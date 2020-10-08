package com.in28minutes.microservice.currencyexchangeservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class CurrencyExchangeController {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private Environment env;
	@Autowired
	ExchangeValueReposiroty respository;

	@GetMapping(value = "/currency-exchange/from/{from}/to/{to}")
	public ExchangeValue getCurrenyExchangeValue(@PathVariable String from,@PathVariable String to) {
		ExchangeValue exch = respository.findAll().get(0);//findByFromAndTo(from, to);
		exch.setPort(Integer.parseInt(env.getProperty("local.server.port")));
		logger.info("{}",exch);
		return exch;
		
	}
}
