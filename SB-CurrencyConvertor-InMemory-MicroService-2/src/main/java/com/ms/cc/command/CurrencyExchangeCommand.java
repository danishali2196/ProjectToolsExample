package com.ms.cc.command;

import lombok.Data;

@Data
public class CurrencyExchangeCommand {

	private Integer currencyId;
	private String currencyFrom;
	private String currencyTo;
	private Double currencyValue;
	
}
