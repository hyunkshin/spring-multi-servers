package com.example.serv1;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.example.serv1")
@PropertySource("classpath:serv1.properties")
@EnableAutoConfiguration
public class Serv1Config {
	
}
