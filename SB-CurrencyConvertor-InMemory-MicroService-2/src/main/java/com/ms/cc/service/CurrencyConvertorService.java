package com.ms.cc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ms.cc.command.CurrencyConvertorCommand;
import com.ms.cc.command.CurrencyExchangeCommand;

@Service
public class CurrencyConvertorService {
	@Autowired
	CurrencyExchangeClient client;
	
//	private static final String currencyExchangeUrl="http://localhost:7070/currency/from/{from}/to/{to}";
//	
//	public CurrencyConvertorCommand getCurrencyValue(String from,String to,Double quantity) {
//		CurrencyConvertorCommand cmd = new CurrencyConvertorCommand();
//		Builder builder = WebClient.builder();
//		WebClient build = builder.build();
//		CurrencyExchangeCommand exCmd = build.get()
//														.uri(currencyExchangeUrl, from, to)
//														.retrieve()
//														.bodyToMono(CurrencyExchangeCommand.class)
//														.block();
//		Double currencyCost = exCmd.getCurrencyValue();
//		
//		cmd.setTotalAmount(quantity * currencyCost);
//		cmd.setCurrencyFrom(from);
//		cmd.setCurrencyTo(to);
//		
//		return cmd;
//	}

	
	public CurrencyConvertorCommand getCurrencyValue(String from, String to, Double quentity) {
		CurrencyConvertorCommand cmd = new CurrencyConvertorCommand();
		 CurrencyExchangeCommand exCmd = client.getAmt(from, to);
		 Double currencyCost = exCmd.getCurrencyValue();
			
			cmd.setTotalAmount(quentity * currencyCost);
			cmd.setCurrencyFrom(from);
			cmd.setCurrencyTo(to);
			
			return cmd;
		
	}
}
