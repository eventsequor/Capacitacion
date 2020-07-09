package com.sophos.Nivel1.Capacitacion.PatronFactory;

public class Mango implements Fruta{

	@Override
	public String color() {
		return "Yo soy de color amarillo";
	}

	@Override
	public String tamanho() {
		return "Yo tengo un tamaño de 10 cm";
	}

}
