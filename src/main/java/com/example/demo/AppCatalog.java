package com.example.demo;

import java.util.HashMap;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class AppCatalog {
	public HashMap<String, ApplicationContext> serviceMap = new HashMap<String, ApplicationContext>();
	
	public void addService(String name, ApplicationContext context) {
		serviceMap.put(name, context);
	}
}
