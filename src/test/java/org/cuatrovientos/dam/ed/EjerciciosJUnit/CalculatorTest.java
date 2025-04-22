package org.cuatrovientos.dam.ed.EjerciciosJUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void testMultiply() {
		
		Calculator calculadora=new Calculator();
		
		double expected=4;
		
		double resultado=calculadora.multiply(2, 2);
		
		assertEquals(expected, resultado, "No multiplica bien");
		
		expected=0;
		
		resultado=calculadora.multiply(2, 0);
		
		assertEquals(expected, resultado, "No multiplica bien");
		
	}

	@Test
	void testDivide() {
		
		Calculator calculadora=new Calculator();
		
		double expected=4;
		
		double resultado=calculadora.divide(8, 2);
		
		assertEquals(expected, resultado, "No divide bien");
		
		expected=2;
		
		resultado=calculadora.multiply(2, 1);
		
		assertEquals(expected, resultado, "No divide bien");
	}

}
