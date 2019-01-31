package com.example.demo;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.beans.BeansException;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.web.WebApplicationInitializer;

import com.example.portal.PortalConfig;
import com.example.serv1.Serv1Config;
import com.example.serv2.Serv2Config;

@SpringBootApplication
public class MultiServersApplication extends SpringBootServletInitializer implements ApplicationRunner, ApplicationContextAware, WebApplicationInitializer {

	private AbstractApplicationContext parentcontext;

	public static void main(String[] args) {
		SpringApplicationBuilder builder;
		new SpringApplicationBuilder().parent(ParentConfig.class).web(WebApplicationType.SERVLET)
/*			.child(PortalConfig.class).web(WebApplicationType.SERVLET)
			.sibling(Serv1Config.class).web(WebApplicationType.SERVLET)
			.sibling(Serv2Config.class).web(WebApplicationType.SERVLET);*/
		.run(args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("Parent ApplicationRunner.run()");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		parentcontext = (AbstractApplicationContext) applicationContext;
		parentcontext.registerShutdownHook();
	}

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		SpringApplicationBuilder builder = new SpringApplicationBuilder().parent(ParentConfig.class).web(WebApplicationType.SERVLET)
				.child(PortalConfig.class).web(WebApplicationType.SERVLET)
				.sibling(Serv1Config.class).web(WebApplicationType.SERVLET)
				.sibling(Serv2Config.class).web(WebApplicationType.SERVLET);
			builder.run();		
	}
}

