package org.cuatrovientos.dam.ed.Ejercicio2;

import java.util.Random;

public class GeneradorIP {
	
	private Random random=new Random();
	
	public int generarNumero(){
		return random.nextInt(0,255);
	}
	
	public String generarIPV4(){
		String miIp = "";
		for (int i=0;i<4;i++) {
			if (generarNumero()!=0) {
				miIp+=generarNumero()+".";
			}
		}
		return miIp;
	}
}
