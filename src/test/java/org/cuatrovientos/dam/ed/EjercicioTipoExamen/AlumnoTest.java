package org.cuatrovientos.dam.ed.EjercicioTipoExamen;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class AlumnoTest {

	@Test
	void testApruebaCurso() {
		
		Modulo m1=new Modulo("Matemáticas", Arrays.asList(5.0,7.2,9.5), Arrays.asList(10.0,7.2,8.0));
		Alumno a1=new Alumno("Juan","juan@gmail.com",m1);
		boolean expected=true;
		boolean resultado=a1.apruebaCurso();
		assertEquals(expected, resultado, "ERROR, si todos los modulos tienen una nota superior a 5 tendría que estar aprobado");
		
		Alumno a2=new Alumno("Pepe","pepe@gmail.com");
		expected=true;
		resultado=a2.apruebaCurso();
		assertEquals(expected, resultado, "ERROR, si no hay modulos matriculados tendría que estar aprobado");
		
		
		
	}

}
