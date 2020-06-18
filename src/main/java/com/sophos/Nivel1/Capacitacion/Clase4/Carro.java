package com.sophos.Nivel1.Capacitacion.Clase4;

public class Carro {
	private int numeroOcupantes;
	private String color;
	private int cantidaLlantas;
	private String marcaCarro;
	
	public Carro() {
		numeroOcupantes = 0;
		color = null;
		cantidaLlantas = 0;
		marcaCarro = null;		
	}

	public int getNumeroOcupantes() {
		return numeroOcupantes;
	}

	public void setNumeroOcupantes(int numeroOcupantes) {
		if(numeroOcupantes<100) {
			this.numeroOcupantes = numeroOcupantes;
		}else {
			System.out.println("Error no se permite crear carros con mas de 100 pasajeros");
		}
		
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getCantidaLlantas() {
		return cantidaLlantas;
	}

	public void setCantidaLlantas(int cantidaLlantas) {
		this.cantidaLlantas = cantidaLlantas;
	}

	public String getMarcaCarro() {
		return marcaCarro;
	}

	public void setMarcaCarro(String marcaCarro) {
		this.marcaCarro = marcaCarro;
	}
	

}
