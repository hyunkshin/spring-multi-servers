package com.example.serv2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.example.demo.AppCatalog;
import com.example.serv1.Svc1Bean;

@Component
public class AppReadyListener{

	@Autowired
	AppCatalog apps;

	@EventListener
	public void onApplicationEvent(ApplicationReadyEvent event) {
		System.out.println("Service 2: *************************************************************" + event);
		// Get a bean from Serice 1 context
		ApplicationContext svc1 = apps.serviceMap.get("Service 1");
		Svc1Bean b = svc1.getBean(Svc1Bean.class);
		System.out.println("Service 2: Svc1Bean " + b);
	}
}