package com.in28minutes.microservices.limitsservice.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class LimitConfiguration {
	
	private int maxLimit;
	private int minLimit;
	
	public LimitConfiguration() {}
	
	public LimitConfiguration(int maxLimit, int minLimit) {
		super();
		this.maxLimit = maxLimit;
		this.minLimit = minLimit;
	}
	public int getMaxLimit() {
		return maxLimit;
	}
	
	public int getMinLimit() {
		return minLimit;
	}
	
	
	
}
