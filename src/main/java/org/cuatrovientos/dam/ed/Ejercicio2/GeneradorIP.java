package org.cuatrovientos.dam.ed.Ejercicio2;

import java.util.Random;

public class GeneradorIP {
	
	private Random random=new Random();
	
	public int generarNumero(int min, int max){
		return random.nextInt(min,(max+1));
	}
	
	public String generarIPV4(){
		int[] secciones=new int[4];
		String miIp = "";
		for (int i=0;i<secciones.length;i++) {
			if(i==0 || i==secciones.length-1) {
					secciones[i]=generarNumero(1, 254);
			}else {
				secciones[i]=generarNumero(0, 254);
			}
			
			if (i>0) {
				miIp+=".";
			}
			miIp+=secciones[i];
		}
		return miIp;
	}
}
