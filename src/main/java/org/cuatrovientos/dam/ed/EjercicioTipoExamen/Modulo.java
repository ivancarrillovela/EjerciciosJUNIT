package org.cuatrovientos.dam.ed.EjercicioTipoExamen;

import java.util.ArrayList;

public class Modulo {
	
	private String nombreModulo;
	private ArrayList<Entregable> entregables=new ArrayList<Entregable>();
	private ArrayList<Examen> examenes=new ArrayList<Examen>();
	
	public Modulo(String nombreModulo) {
		this.nombreModulo = nombreModulo;
	}

	public double notaModulo() {
		if (entregables.contains(-1) || examenes.contains(-1)) {
			return 0;
		}
		double maxNotaEx=0;
		double sumaNotaEx=0;
		for (Examen e: examenes) {
			if (e.getNota() > maxNotaEx) {
				maxNotaEx=e.getNota();
			}
			sumaNotaEx+=e.getNota();
		}
		if (maxNotaEx > 4) {
			return maxNotaEx;
		}
		double mediaExamenes=sumaNotaEx/examenes.size();
		double sumaNotaEn=0;
		for (Entregable e: entregables) {
			sumaNotaEn+=e.getNota();
		}
		double mediaEntregables=sumaNotaEn/entregables.size();
		return (mediaEntregables*0.60)+(mediaExamenes*0.40);
	}

}
