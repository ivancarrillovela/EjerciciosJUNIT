package org.cuatrovientos.dam.ed.EjerciciosJUnit.EjemplosTestUnitarios;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HelloTest {

	/**
	 * Test method for {@link org.cuatrovientos.dam.ed.EjerciciosJUnit.EjemplosTestUnitarios.Hello#sayHello()}.
	 */
	@Test
	void testSayHello() {
		
		//1. Crear lo necesario para ejecutar el test
		Hello objectToTest = new Hello();
		
		//2. Expected
		String expected="hello";
		
		//3. Ejecutar
		String actual=objectToTest.sayHello();
		
		//4. Asserts
		assertEquals(expected, actual, "Falla el test más simple del mundo");
		assertTrue(expected.equals(actual), "Falla de otra manera");
	}

}
