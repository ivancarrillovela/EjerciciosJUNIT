package org.cuatrovientos.dam.ed.EjercicioTipoExamen;

public class Examen {
	
	private String nombre;
	private double nota;
	
	public Examen(String nombre, double nota) {
		super();
		this.nombre = nombre;
		this.nota = nota;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

}
