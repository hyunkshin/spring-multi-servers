package com.example.portal;

import java.util.Date;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
//@EnableScheduling
public class Scheduler {
	@Scheduled(fixedRate = 10000)
	public void scheduled_task() {
		System.out.println("Scheduled task runs at " + new Date().toString());
	}
}
