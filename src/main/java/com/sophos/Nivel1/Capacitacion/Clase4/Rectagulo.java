package com.sophos.Nivel1.Capacitacion.Clase4;

public class Rectagulo extends Polihedro{
	int area;
	
	public Rectagulo(int numLado) {
		super(numLado);
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}
	
	public void areaRectagulo() {
		area = getCantidadLados()[0]*getCantidadLados()[1];
		System.out.println("############## "+ area);
	}
	
	
	
}
