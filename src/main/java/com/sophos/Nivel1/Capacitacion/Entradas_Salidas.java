package com.sophos.Nivel1.Capacitacion;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

import javax.swing.Box.Filler;

public class Entradas_Salidas {

	public void entradasPorConsola() {
		String nombre;
		Scanner lector = new Scanner(System.in);

		System.out.println("Por favor digite su nombre");
		nombre = lector.nextLine();

		System.out.println("Su nombre es: " + nombre);

	}

	public void lecturaArchivo(String ruta) {
		FileReader lector ;
		BufferedReader bf;
		File objfile = new File(ruta);
		if (!objfile.exists()) {
			try {
				objfile.createNewFile();
			} catch (Exception e) {
				e.printStackTrace();
			}			
		}
		try {
			lector = new FileReader(objfile);
			bf = new BufferedReader(lector);
			
			System.out.println(bf.readLine());
			
			lector.close();
			bf.close();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			
		}
		

	}

}
