package org.cuatrovientos.dam.ed.EjercicioTipoExamen;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class ModuloTest {

	@Test
	void testNotaModulo() {
		Modulo m1=new Modulo("Matemáticas", Arrays.asList(-1.0,7.2,9.5), Arrays.asList(10.0,7.2,8.0));
		double expected=0;
		double resultado=m1.notaModulo();
		assertEquals(expected, resultado, "ERROR, si falta algún entregable la nota tiene que ser 0");
		
		Modulo m2=new Modulo("Física", Arrays.asList(5.8,7.2,9.5), Arrays.asList(10.0,-1.0,8.0));
		expected=0;
		resultado=m2.notaModulo();
		assertEquals(expected, resultado, "ERROR, si falta algún examen la nota tiene que ser 0");
		
		Modulo m3=new Modulo("Lengua", Arrays.asList(10.0,7.2,8.0), Arrays.asList(3.0,2.0,1.5));
		expected=3.0;
		resultado=m3.notaModulo();
		assertEquals(expected, resultado, "ERROR, si algun examen es <=4 la nota tiene que ser la mayor");
		
		Modulo m4=new Modulo("Ingés", Arrays.asList(8.0,7.0,6.0), Arrays.asList(5.0,4.0,6.5));
        double mediaEntregables=(8.0+7.0+6.0) / 3;
        double mediaExamenes=(5.0+4.0+6.5) / 3;
        expected=(mediaEntregables * 0.60) + (mediaExamenes * 0.40);
        resultado=m4.notaModulo();
        assertEquals(expected, resultado, "ERROR, la nota tendría que ser un 60% entregables y un 40% examenes");
		
	}

}
