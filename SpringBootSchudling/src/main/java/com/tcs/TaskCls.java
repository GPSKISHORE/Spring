package com.tcs;

import java.time.LocalDateTime;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class TaskCls {

	//@Scheduled(initialDelay = 2000,fixedDelay = 10000)
	@Scheduled(cron="0/10 6/5 10 * * *")
	public void TaskSchudle() {
		System.out.println(LocalDateTime.now());
	}
}
