package com.in28minutes.microservice.converter;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class ApplicationContextProvider2  implements ApplicationContextAware{

	private static ApplicationContext context;
	
	public  ApplicationContext getApplicationContext() {
		final ApplicationContextProvider2 cprovider = new ApplicationContextProvider2();
		return cprovider.getContext();
	}
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
            context = applicationContext;
		
	}
	public static ApplicationContext getContext() {
		return context;
	}
	
	
}
