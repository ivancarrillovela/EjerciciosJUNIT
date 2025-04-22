package org.cuatrovientos.dam.ed.EjercicioTipoExamen;

import java.util.List;

public class Modulo {
	
	private String nombreModulo;
	private List<Double> entregables;
	private List<Double> examenes;
	
	public Modulo(String nombreModulo, List<Double> entregables, List<Double> examenes) {
		super();
		this.nombreModulo = nombreModulo;
		this.entregables = entregables;
		this.examenes = examenes;
	}

	public double notaModulo() {
		if (entregables.contains(-1) || examenes.contains(-1)) {
			return 0;
		}
		double maxNotaEx=0;
		double sumaNotaEx=0;
		for (Double e: examenes) {
			if (e > maxNotaEx) {
				maxNotaEx=e;
			}
			sumaNotaEx+=e;
		}
		if (maxNotaEx > 4) {
			return maxNotaEx;
		}
		double mediaExamenes=sumaNotaEx/examenes.size();
		double sumaNotaEn=0;
		for (Double e: entregables) {
			sumaNotaEn+=e;
		}
		double mediaEntregables=sumaNotaEn/entregables.size();
		return (mediaEntregables*0.60)+(mediaExamenes*0.40);
	}

}
