package com.example.portal;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.example.portal")
@PropertySource("classpath:${portal-name:portal}.properties")
@EnableAutoConfiguration
public class PortalConfig {
	
	@Bean
	public HelloWorld hello() {
		HelloWorld h = new HelloWorld();
		h.setMessage("Hello World!!!");
		return h;
	}
	
}
