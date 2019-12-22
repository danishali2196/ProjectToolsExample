package com.ms.cc.command;

import lombok.Data;

@Data
public class CurrencyConvertorCommand {
	
	private String currencyFrom;
	private String currencyTo;
	private Double totalAmount; 

}
