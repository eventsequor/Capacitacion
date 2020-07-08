package com.sophos.Nivel1.Capacitacion;

public class Ordenamiento {

	// Arreglo de números [{0},{1},{2}...{n}]
	// Arreglo de números [{3},{7},{9}...{n}]

	public void ordenamientoBurbuja(int[] arreglo) {
		int i, j, pivo;
		for (i = 0; i < arreglo.length -1; i++) {
			for (j = 0; j < arreglo.length -i -1 ; j++) {
				if (arreglo[j + 1] < arreglo[j]) {
					pivo = arreglo[j + 1];
					arreglo[j + 1] = arreglo[j];
					arreglo[j] = pivo;
				}
			}
		}
	}
	
	public void metodo1() {
		metodo2();
	}
	
	public void metodo2() {
		System.out.println("imprimo algo");
	}
	
	public int recursividad(int numero) {
		System.out.println(">> "+ numero);
		if(numero<5) {
			return recursividad(numero+1);
		}else {
			return numero;
		}
	}

}
