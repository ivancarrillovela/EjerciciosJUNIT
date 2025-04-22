package org.cuatrovientos.dam.ed.Ejercicio2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GeneradorIPTest {

	@Test
	void testGenerarNumero() {
		GeneradorIP generadorIP=new GeneradorIP();
		
		for (int i=0;i<1000;i++) {
			int resultado=generadorIP.generarNumero(0, 255);
			
			assertTrue(resultado <=255 && resultado >=0, "El número está fuera del rango introducido");
		}
		
	}

	@Test
	void testGenerarIPV4() {
		GeneradorIP generadorIP=new GeneradorIP();
		
		String resultado=generadorIP.generarIPV4();
		
		String[] secciones=resultado.split("\\.");
		
		assertTrue(secciones.length==4,"ERROR, la IPV4 no tiene el número de secciones indicado");
		assertTrue(Integer.parseInt(secciones[0]) !=0 && Integer.parseInt(secciones[secciones.length-1]) !=0, "ERROR, la IPV4 empieza o termina por 0");
		
	}

}
