package com.in28minutes.microservice.converter;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CurrencyConversionController {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private CurrencyExchangeServiceProxy exchangeClientProxy;
	
	@GetMapping(value = "/currency-converter/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversionBean convertCurrency(
			@PathVariable String from,@PathVariable String to,@PathVariable BigDecimal quantity) {
		 Map<String, String> urlvariables = new HashMap<>();
		 urlvariables.put("from", from);
		 urlvariables.put("to", to);
		
		 ResponseEntity<CurrencyConversionBean> restTemplate = new RestTemplate().getForEntity("http://localhost:8000/currency-exchange/from/{from}/to/{to}", CurrencyConversionBean.class,urlvariables);
		 CurrencyConversionBean response = restTemplate.getBody();
		 System.out.println(response);
		 
		return new CurrencyConversionBean(response.getId(), from, to, response.getCurrencyMultiple(), quantity, quantity.multiply(response.getCurrencyMultiple()), response.getPort());
	}
	
	@GetMapping(value = "/currency-converter-feign/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversionBean convertCurrencyfeign(
			@PathVariable String from,@PathVariable String to,@PathVariable BigDecimal quantity) {
		
		 CurrencyConversionBean response = exchangeClientProxy.getCurrenyExchangeValue(from, to);
		 //System.out.println(response);
		 logger.info("{}",response);
		 
		return new CurrencyConversionBean(response.getId(), from, to, response.getCurrencyMultiple(), quantity, quantity.multiply(response.getCurrencyMultiple()), response.getPort());
	}
	
}
