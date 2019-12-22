package com.ms.cc.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ms.cc.command.CurrencyConvertorCommand;
import com.ms.cc.service.CurrencyConvertorService;

@RestController
public class CurrencyConvertorController {
	
	@Autowired
	CurrencyConvertorService service;
	
	@GetMapping(value="/convert/from/{from}/to/{to}/quantity/{quantity}",produces="application/json")
	public CurrencyConvertorCommand getCurrencyValue(@PathVariable("from") String from,@PathVariable("to") String to, @PathVariable("quantity") Double quantity ) {
		
		CurrencyConvertorCommand convertorCommand = service.getCurrencyValue(from, to, quantity);
	
		return convertorCommand;
	}
	

}
