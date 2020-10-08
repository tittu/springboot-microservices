package com.in28minutes.microservices.limitsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.microservices.limitsservice.Configuration;
import com.in28minutes.microservices.limitsservice.model.LimitConfiguration;

@RestController
public class LimitServiceController {
	
	@Autowired
	private Configuration config;

	@GetMapping(value = "/limitsconfig")
	public LimitConfiguration getLimitsConfiguration() {
		return new LimitConfiguration(config.getMaximum(),config.getMinimum());
	}
	
	public static void main(String[] args) {
		String s= "cat";
		//write your Logic here:
		int length = s.length();
		int totalPermutation = length * length;
	 // for(int k=0;k<totalPermutation;k++){	
	//	 StringBuffer sb= new StringBuffer();
		for(int i=0; i< s.length();i++){	
		  char c = s.charAt(i);	
		  String sc=s.substring(0, i) + s.substring(i+1);
		  //  sb.append(sc+c);
		  System.out.println(sc+c);
		    
		}
		//System.out.println(sb);
	 // }
		
	}
}
