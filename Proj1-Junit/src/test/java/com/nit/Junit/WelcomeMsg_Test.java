package com.nit.Junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WelcomeMsg_Test {
	
	@Test
	public void getWish_Test() {
		String expected = "good morning";
		WelcomeMsg wm = new WelcomeMsg();
		String actual = wm.getWish();
		
		assertEquals(expected, actual);
		
	}

}
