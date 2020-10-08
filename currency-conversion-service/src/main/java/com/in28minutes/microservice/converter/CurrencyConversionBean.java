package com.in28minutes.microservice.converter;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CurrencyConversionBean {

	private Long id;
	private String from;
	private String to;
    private  BigDecimal currencyMultiple;;
	private BigDecimal quantity;
	private BigDecimal totalCalcualtedAmount;
	private int port;
	
	
	
	public CurrencyConversionBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CurrencyConversionBean(Long id, String from, String to, BigDecimal currencyMultiple, BigDecimal quantity,
			BigDecimal totalCalcualtedAmount, int port) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.currencyMultiple = currencyMultiple;
		this.quantity = quantity;
		this.totalCalcualtedAmount = totalCalcualtedAmount;
		this.port = port;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	
	public BigDecimal getQuantity() {
		return quantity;
	}
	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}
	public BigDecimal getTotalCalcualtedAmount() {
		return totalCalcualtedAmount;
	}
	public void setTotalCalcualtedAmount(BigDecimal totalCalcualtedAmount) {
		this.totalCalcualtedAmount = totalCalcualtedAmount;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	public BigDecimal getCurrencyMultiple() {
		return currencyMultiple;
	}
	public void setCurrencyMultiple(BigDecimal currencyMultiple) {
		this.currencyMultiple = currencyMultiple;
	}
	@Override
	public String toString() {
		return "CurrencyConversionBean [id=" + id + ", from=" + from + ", to=" + to + ", currencyMultiple="
				+ currencyMultiple + ", quantity=" + quantity + ", totalCalcualtedAmount=" + totalCalcualtedAmount
				+ ", port=" + port + "]";
	}
	
		
}
