package org.cuatrovientos.dam.ed.EjercicioTipoExamen;

import java.util.ArrayList;

public class Alumno {
	
	private String nombre;
	private String email;
	private ArrayList<Modulo> modulos=new ArrayList<Modulo>();
	
	public Alumno(String nombre, String email) {
		super();
		this.nombre = nombre;
		this.email = email;
	}
	
	public Alumno(String nombre, String email, Modulo modulo) {
		super();
		this.nombre = nombre;
		this.email = email;
		modulos.add(modulo);
	}

	public boolean apruebaCurso() {
		if (modulos.isEmpty()) {
			return true;
		}
		for (Modulo m:modulos) {
			if (m.notaModulo()<5) {
				return false;
			}
		}
		return true;
	}

}
