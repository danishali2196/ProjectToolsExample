package com.nit.beans;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class StockMarketTest {
	
	static Logger logger = Logger.getLogger(StockMarket.class);
	
	public static void main(String[] args) {
		PropertyConfigurator.configure("src/main/java/com/nit/commans/log4j.properties");
		logger.debug("main method");
		
		logger.debug("stock market obj created");
		StockMarket sm = new StockMarket();
		
		logger.debug("return value");
		System.out.println("Price  ::  "+sm.getPrice("ibm"));
	}

}
