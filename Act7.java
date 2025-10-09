package com;
public class Act7 {

	public static void main(String[] args) {
		
		int numero=1,producto=1,contador=0;
		
		do {
			
			producto=producto*numero;
			contador++;
			numero=numero+2;
			
		}while(contador<10);
		System.out.println("El producto de los 10 primeros impares es: " + producto);
	
	}

}
