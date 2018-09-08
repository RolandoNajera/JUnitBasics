package com.globaltade.test.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.globaltade.dev.junit.Calculator;

public class CalculatorTest {

	private Calculator calculator;

	@Before
	public void setUp() throws Exception {
		calculator = new Calculator();
	}

	@Test
	public void testAssertEqualsAdd() {
		// static initialization for result we expect
		long result = 10 + 12 + (-2) + 5;

		// Compare the statis result with the add method from Calculator
		assertEquals(result, calculator.add(10, 12, -2, 5));

		result = 100 + 200;
		assertEquals(result, calculator.add(100, 200));

		// to make sure there is nothing wird with the method
		result = 0;
		assertEquals(result, calculator.add(0));
	}

	@Test
	public void testAssertEqualsSubstract() {
		// static initialization for result we expect
		long result = 10 - 12 - (-2) - 5;

		// Compare the statis result with the substract method from Calculator
		assertEquals(result, calculator.substract(10, 12, -2, 5));

		result = 100 - 200;
		assertEquals(result, calculator.substract(100, 200));

		// to make sure there is nothing wird with the method
		result = 0;
		assertEquals(result, calculator.substract(0));
	}

}
