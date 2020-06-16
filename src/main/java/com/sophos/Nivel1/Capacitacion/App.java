package com.sophos.Nivel1.Capacitacion;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		int variable_Uno = 5;

		byte nombreByte = 65;// -128 y 127 A
		System.out.println(nombreByte);
		short variableShort = Short.valueOf("1000");
		System.out.println(variableShort);
		int variableInt = 5;
		System.out.println(variableInt);

		float numero = (float) 5.555;

		boolean variableVerdad = true;
		
		char variableChar = 'A';
		
		byte variableCasteoByte = (byte) variableChar;
		System.out.println(variableCasteoByte);
		
		byte variableP = 0;		//8
		
		boolean condicional = false;
		
		char [] arregloChar = {'E','d','e','r'};
		System.out.println("<><><><><><><>\n");
		for (int i = 0; i < arregloChar.length; i++) {
			int x = (int) arregloChar[i]+1;
			System.out.println(x);
			System.out.println((char)x);
		}
		
		
//		if(5<3) {
//			System.out.println("5 si es mayor que 3");
//		}else {
//			System.out.println("5 no es menor que 3");
//		}
		
		if(5<3) {
			System.out.println("5 si es mayor que 3");
		}else if (5<1) {
			System.out.println("Segunda opción 5 si es mayor que 3");
		}else {
			System.out.println("Continue");
		}
		
		String key = "opcion2";
		
		switch (key) {
		case "opcion1":
			System.out.println("Case 1");
			break;
		case "opcion2":
			System.out.println("Case 2");
			break;

		default:
			break;
		}
 		
		
	}
}
