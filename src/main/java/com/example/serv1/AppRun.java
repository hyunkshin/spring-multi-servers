package com.example.serv1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import com.example.demo.AppCatalog;
import com.example.demo.SVCCatalog;

@Component
public class AppRun implements ApplicationRunner {

	@Autowired
	ApplicationContext context;

	@Autowired
	SVCCatalog svc;

	@Autowired
	AppCatalog apps;
	
	@Value("${server.port}")
	private int port;

	@Autowired
	GenericSpringEventPublisher gsp;

	@Autowired
	Svc1Bean b;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		String name = "Service 1";
		String url = "http://localhost:" + port;
		svc.addService(name, url);
		apps.addService(name,  context);
		System.out.println("name = " + name + ", url = " + url);
		gsp.doStuffAndPublishAnEvent("GenericSpringEventPulished");
		System.out.println("Service 1: Svc1Bean " + b);
	}
}
