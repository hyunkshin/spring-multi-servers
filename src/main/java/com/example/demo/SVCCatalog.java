package com.example.demo;

import java.util.HashMap;

import org.springframework.stereotype.Component;

@Component
public class SVCCatalog {
	public HashMap<String, String> serviceMap = new HashMap<String, String>();
	
	public void addService(String name, String url) {
		serviceMap.put(name, url);
	}
}
