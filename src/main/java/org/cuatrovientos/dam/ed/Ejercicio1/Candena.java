package org.cuatrovientos.dam.ed.Ejercicio1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Candena {
	
	private String contenido;
	
	private String[] vocales={"a","e","i","o","u","á","é","í","ó","ú"};
	
	public int longitud() {
		return contenido.length();
	}
	
	public int numeroVocales(){
		int numVocales=0;
		for (char c:contenido.toCharArray()) {
			if (Arrays.asList(vocales).contains(c)) {
				numVocales++;
			}
		}
		return numVocales;
	}
	
	public String invertirCadena(){
		String cadenaInvertida="";
		for (int i=contenido.toCharArray().length;i>0;i--) {
			cadenaInvertida+=i;
		}
		return cadenaInvertida;
	}
	
	public int contarLetra(char letra){
		int numLetras=0;
		for (char c:contenido.toCharArray()) {
			if (c==letra) {
				numLetras++;
			}
		}
		return numLetras;
	}
	
}
