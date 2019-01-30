package com.example.portal;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

public class HelloWorld implements InitializingBean, DisposableBean  {
	private String message;

	public void init() {
//		System.out.println("PostConstruct helloworld");
	}

	public void destroy() {
//		System.out.println("PreDestroy helloworld");
	}
	
	public void xmlDestroy() {
//		System.out.println("XmlDestroy helloworld");
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		
	}
}