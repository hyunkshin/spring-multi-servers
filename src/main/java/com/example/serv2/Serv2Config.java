package com.example.serv2;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.example.serv2")
@PropertySource("classpath:serv2.properties")
@EnableAutoConfiguration
public class Serv2Config {

}
