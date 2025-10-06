package com.krish.controll;

import java.io.IOException;
import java.io.PrintWriter;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameter;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletResponse;

@Profile("uat")
@Controller
@RequestMapping("/intellect")
public class ControllerCls {
	
	@Autowired
	private JobLauncher launcher;
	@Autowired
	private Job job;

	@GetMapping("/home")
	public void meth1(HttpServletResponse res) {
		PrintWriter out;
		try {
			out = res.getWriter();
			out.println("<h1>Method call Success</h1>");
			JobParameters jobparams = new JobParametersBuilder().addLong("startAt", System.currentTimeMillis()).toJobParameters();
			launcher.run(job, jobparams);
			out.println("<br><h1>Job Execution Completed</h1>");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (JobExecutionAlreadyRunningException e) {
			e.printStackTrace();
		} catch (JobRestartException e) {
			e.printStackTrace();
		} catch (JobInstanceAlreadyCompleteException e) {
			e.printStackTrace();
		} catch (JobParametersInvalidException e) {
			e.printStackTrace();
		}
		
	}
}
