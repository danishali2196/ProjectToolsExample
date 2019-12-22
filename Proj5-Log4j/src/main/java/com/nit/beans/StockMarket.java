package com.nit.beans;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class StockMarket {
	
	static Logger logger = Logger.getLogger(StockMarket.class);
	
	public Double getPrice(String cname) {
		PropertyConfigurator.configure("src/main/java/com/nit/commans/log4j.properties");
		logger.debug("get price method");
		Double price = 0.0;
		if ("tcs".equalsIgnoreCase(cname)){
			logger.info("tcs camp info");
			price = 450.00;
		}
		else if ("ibm".equalsIgnoreCase(cname)) {
			logger.info("ibm comp info");
			price = 500.00;
		}
		else {
			logger.info("no information");
			price = 0.0;
		}
		
		return price;
		
	}
	

}
