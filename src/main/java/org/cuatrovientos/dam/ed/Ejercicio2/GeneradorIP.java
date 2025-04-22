package org.cuatrovientos.dam.ed.Ejercicio2;

import java.util.Random;

public class GeneradorIP {
	
	private Random random=new Random();
	
	public int generarNumero(int min, int max){
		return random.nextInt(min,max+1);
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
