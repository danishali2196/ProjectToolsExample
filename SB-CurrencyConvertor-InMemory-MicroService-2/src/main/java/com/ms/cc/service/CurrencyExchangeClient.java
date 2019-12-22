package com.ms.cc.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.ms.cc.command.CurrencyExchangeCommand;

@FeignClient(name="CURRENCY-EXCHANGE-SERVICE")
public interface CurrencyExchangeClient {
	
	@GetMapping(value="/currency/from/{from}/to/{to}")
	public CurrencyExchangeCommand getAmt(@PathVariable("from")String from,@PathVariable("to")String to);

}
