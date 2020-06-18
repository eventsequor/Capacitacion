package com.sophos.Nivel1.Capacitacion.Clase4;

public class Polihedro {
	int[] cantidadLados;
	String color;

	public Polihedro(int numLado) {
		super();
		cantidadLados = new int[numLado];
		color = null;
	}
	
	public void setValorLado(int posicion,int valor) {
		cantidadLados[posicion] = valor;
	}

	public int[] getCantidadLados() {
		return cantidadLados;
	}

	public void setCantidadLados(int[] cantidadLados) {
		this.cantidadLados = cantidadLados;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
