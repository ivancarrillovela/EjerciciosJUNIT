package org.cuatrovientos.dam.ed.Ejercicio2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GeneradorIPTest {

	@Test
	void testGenerarNumero() {
		GeneradorIP generadorIP=new GeneradorIP();
		
		for (int i=0;i<1000;i++) {
			int numero=generadorIP.generarNumero(0, 255);
			assertTrue(numero <=255 && numero >=0, "El número está fuera del rango introducido");
		}
		
	
	}

	@Test
	void testGenerarIPV4() {
		fail("Not yet implemented");
	}

}
