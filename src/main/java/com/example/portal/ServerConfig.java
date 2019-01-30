package com.example.portal;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
import org.springframework.web.context.ServletConfigAware;
import org.springframework.web.context.ServletContextAware;

@Component
public class ServerConfig implements ServletContextAware, ApplicationContextAware, ServletConfigAware, BeanNameAware  {

	private ServletContext servletContext;

	public ServletContext getServletContext() {
		return servletContext;
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("setApplicationContext ......................................." + applicationContext);
	}

	@Override
	public void setServletContext(ServletContext servletContext) {
		this.servletContext = servletContext;
		System.out.println("setServletContext ......................................." + servletContext);
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("setBeanName ......................................." + name);
	}

	@Override
	public void setServletConfig(ServletConfig servletConfig) {
		System.out.println("setServletConfig ......................................." + servletConfig);
		
	}

}
