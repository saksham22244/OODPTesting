package com.calculator.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	
	static Calculator calculator;
	@BeforeAll
	static void setup() {
		 calculator=new Calculator();
		System.out.println("This gets printed before all tests");
		
	}

	@AfterAll
	static void end() {
		System.out.println("This should print after all tests");
	}
	@Test
	void testSum() {
		int result=calculator.sum(5,6);
		assertEquals(11,result);
		System.out.println("This should print the sum");
	}

	@Test
	void testdiffrence() {
		int result=calculator.diffrence(5,6);
		assertEquals(-1,result);
		System.out.println("This should print the diffrence");
	}

	@Disabled
	void testMultiply() {
		int result=calculator.sum(5,6);
		assertEquals(30,result);
		System.out.println("This should print the multiply");
	}

}

