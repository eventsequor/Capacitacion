package com.sophos.Nivel1.Capacitacion.PatronFactory;

public class Manzana implements Fruta{
	@Override
	public String color() {
		return "Yo soy de color rojo";
	}

	@Override
	public String tamanho() {
		return "Yo tengo un tamaño de 7 cm";
	}
}
