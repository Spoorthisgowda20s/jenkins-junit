package com.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {
	
	Calculator calc = new Calculator();

	@Test
	public void testAdd(){
		assertEquals(5, calc.add(3, 2));
	}

	@Test
	public void testSubtract(){
		assertEquals(1, calc.subtract(3, 2));
	}

	@Test
	public void testMultiply(){
		assertEquals(9, calc.multiply(3, 2));
	}

	@Test
	public void testDivide(){
		assertEquals(1, calc.divide(3, 2));
	}
	
	@Test
	void testDivisionByZero(){
		assertThrows(ArithmeticException.class, () -> {
			calc.divide(10, 0);
		});
	}
}