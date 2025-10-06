package com.krish.batchConfig;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;
import org.springframework.stereotype.Component;

@Component
public class ExecutionListerner implements JobExecutionListener{

	Logger logger = LoggerFactory.getLogger(ExecutionListerner.class);
	
	public void beforeJob(JobExecution jobExecution) {
		logger.info(" Job Status ::"+jobExecution.getStatus());
		logger.info("Job Start time ::"+jobExecution.getStartTime());
	}
	
	public void afterJob(JobExecution jobExecution) {
		logger.info(" Job Status ::"+jobExecution.getStatus());
		logger.info("Job End time ::"+jobExecution.getEndTime());
		logger.info("Job Exit Status ::"+jobExecution.getExitStatus());
	}
}
