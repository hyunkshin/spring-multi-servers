package com.example.portal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class AppReadyListener implements ApplicationListener<ApplicationReadyEvent> {

	@Autowired
	RestClient restClient;
	
	@Override
	public void onApplicationEvent(ApplicationReadyEvent event) {
		restClient.getProjects();
	}
}