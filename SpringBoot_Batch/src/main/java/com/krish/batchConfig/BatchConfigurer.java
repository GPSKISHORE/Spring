package com.krish.batchConfig;

import java.nio.file.Paths;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.batch.item.data.RepositoryItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.builder.FlatFileItemReaderBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.FileSystemResource;
import org.springframework.transaction.PlatformTransactionManager;

import com.krish.enty.IBMDBInter;
import com.krish.enty.IBMEnty;
import com.krish.process.IBMprocesser;

@EnableBatchProcessing
@Configuration
public class BatchConfigurer {
	
	@Autowired
	private IBMprocesser process;
	
	@Autowired
	private IBMDBInter repo;

	@Autowired
	private ExecutionListerner executionListerner;
	
	@Bean
	FlatFileItemReader<IBMEnty> readData() {
	
		return new FlatFileItemReaderBuilder<IBMEnty>().name("IBM Batch Insertion")
													   .resource(new FileSystemResource(Paths.get("‪E:\\ibm.csv".replaceAll("[^\\x20-\\x7E]", ""))))
													   .delimited().delimiter(",")
													   .names("date","open","high","low","close","openint","volume","refnum")
													  // .targetType(IBMEnty.class) // it uses default mapper, no convertion between java and csv no issue but date convetion such type of events it not works
													   .fieldSetMapper(new BatchFieldSetMapper())
													   .linesToSkip(1)
													   .build();
	}
	
	@Bean
	RepositoryItemWriter<IBMEnty> writeData(){
		RepositoryItemWriter<IBMEnty> writer = new RepositoryItemWriter<IBMEnty>();
		 writer.setRepository(repo);
		 writer.setMethodName("save");
		 return writer;
	}
	
	@Bean(name = "step1") 
	Step createStep(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
		return new StepBuilder("step1",jobRepository).<IBMEnty,IBMEnty>chunk(10,transactionManager)
									   .reader(readData())
									   .processor(process)
									   .writer(writeData())
									   .build();
	}
	
	@Bean(name = "job1")
	Job createJob(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
		return new JobBuilder("job1",jobRepository).start(createStep(jobRepository,transactionManager))
									 .listener(executionListerner)
									 .build();
	}
}
