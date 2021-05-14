package com.sophos.Nivel1.Capacitacion.lili;

import java.util.ArrayList;
import java.util.List;

public class Casteo {
	public static void main(String[] args) {
		Casteo obj = new Casteo();
		obj.metodoVariables();
	}

	public void metodoVariables() {
		byte x = 109; // -127 + 127 0111 1101
		Character objChar = new Character('m');
		char letra = (char) x;
		byte x2 = (byte) objChar.charValue();
		String oracion = "2544";
		char sub = 'm';
		System.out.println(x);
	}

	public void polimorfismo() {
		Camionetas camineta1 = new Camionetas();
		Sedan carro1 = new Sedan();
		List<Vehiculo> carros = new ArrayList<Vehiculo>();
		carros.add(camineta1);
		carros.add(carro1);

		if (carros.get(0) instanceof Camionetas) {
			Camionetas subCamineta = (Camionetas) carros.get(0);
		}

	}

}
