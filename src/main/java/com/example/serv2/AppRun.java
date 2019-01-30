package com.example.serv2;

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

	@Override
	public void run(ApplicationArguments args) throws Exception {
		String name = "Service 2";
		String url = "http://localhost:" + port;
		svc.addService(name, url);
		apps.addService(name, context);
		System.out.println("name = " + name + ", url = " + url);
	}
}
