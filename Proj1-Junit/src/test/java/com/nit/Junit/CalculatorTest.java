package com.nit.Junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	@Test(expected = ArithmeticException.class)
	public void testGetValue() {
		Calculator calc = new Calculator();
		calc.getValue();
		
	}

}
