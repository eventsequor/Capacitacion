package com.sophos.Nivel1.Capacitacion;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.libreria.LibreriaClase.FuncionesMatematicas.FuncionesAritmeticas;
import com.sophos.Nivel1.Capacitacion.Clase4.Carro;
import com.sophos.Nivel1.Capacitacion.Clase4.Modificadores1;
import com.sophos.Nivel1.Capacitacion.Clase4.Polihedro;
import com.sophos.Nivel1.Capacitacion.Clase4.Rectagulo;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Driver objDriver = new Driver();
		objDriver.navegadorGoogle();
		objDriver.navegadorFireFox();
		objDriver.navegadorInternetExplore();
		
	}
	
	public void clase6_2() {
		int limiteInferior = -30;
		int limiteSuperior = 9;
		while (limiteInferior <= limiteSuperior) {
			System.out.println(
					"El resultado potencia al cuadrado de cuando x es:" + limiteInferior +": "+ Math.pow(limiteInferior, 2));
			limiteInferior++;
		}

		String ruta = "C:\\Users\\usuario\\eclipse-workspace2020\\Capacitacion\\documentoEjemplo.txt";
		Entradas_Salidas objIO = new Entradas_Salidas();
//		objIO.entradasPorConsola();
		objIO.lecturaArchivo(ruta);
	}

	public void clase6() {
		FuncionesAritmeticas obj = new FuncionesAritmeticas();
		System.out.println(obj.suma(5, 45));
		WebDriver driver = new FirefoxDriver();
		driver.get("");
	}

	public void clase4() {
		Carro objCarro = new Carro();
		objCarro.setCantidaLlantas(4);
		objCarro.setColor("Azul");
		objCarro.setMarcaCarro("Mazda");
		objCarro.setNumeroOcupantes(101);
		objCarro.setNumeroOcupantes(19);

		Carro objOtroCarro = new Carro();
		System.out.println("La cantidad de llantas de carro objOtroCarro es: " + objOtroCarro.getCantidaLlantas());

		System.out.println("El número de ocupantes es: " + objCarro.getNumeroOcupantes());

//		Polihedro objPoli = new Polihedro(3);

		Rectagulo objRecta = new Rectagulo(2);
		objRecta.setValorLado(0, 4);
		objRecta.setValorLado(1, 5);
		objRecta.areaRectagulo();
		System.out.println("El área del rectagulo es: " + objRecta.getArea());

//		Modificadores1 modif = new Modificadores1();
//		
//		System.out.println(modif.variable3);
//		System.out.println(modif.retornoVariable1());
	}

	public void clase3() {
		VariableCondicionales nombreP = new VariableCondicionales();

		nombreP.agregarNuevaPersona("Jhon:12");
		nombreP.agregarNuevaPersona("Elena:15");
		nombreP.agregarNuevaPersona("Marcos:55");
		nombreP.agregarNuevaPersona("Rober:13");
		nombreP.agregarNuevaPersona("Pedro:118");
		nombreP.agregarNuevaPersona("Javier:17");

		ArrayList<String> resultado = nombreP.personasMayores18();

		for (String resul : resultado) {
			System.out.println("Es mayor de 18 años" + resul);
		}

//		System.out.println("Hello World!");
//		int variable_Uno = 5;
//
//		byte nombreByte = 65;// -128 y 127 A
//		System.out.println(nombreByte);
//		short variableShort = Short.valueOf("1000");
//		System.out.println(variableShort);
//		int variableInt = 5;
//		System.out.println(variableInt);
//
//		float numero = (float) 5.555;
//
//		boolean variableVerdad = true;
//		
//		char variableChar = 'A';
//		
//		byte variableCasteoByte = (byte) variableChar;
//		System.out.println(variableCasteoByte);
//		
//		byte variableP = 0;		//8
//		
//		boolean condicional = false;
//		
//		char [] arregloChar = {'E','d','e','r'};
//		System.out.println("<><><><><><><>\n");
//		for (int i = 0; i < arregloChar.length; i++) {
//			int x = (int) arregloChar[i]+1;
//			System.out.println(x);
//			System.out.println((char)x);
//		}
//		
//		
////		if(5<3) {
////			System.out.println("5 si es mayor que 3");
////		}else {
////			System.out.println("5 no es menor que 3");
////		}
//		
//		if(5<3) {
//			System.out.println("5 si es mayor que 3");
//		}else if (5<1) {
//			System.out.println("Segunda opción 5 si es mayor que 3");
//		}else {
//			System.out.println("Continue");
//		}
//		
//		if(5<3 && 5<8) {
//			System.out.println("Si se cumple la condición");
//		}

//		String key = "opcion2";
//		
//		switch (key) {
//		case "opcion1":
//			System.out.println("Case 1");
//			break;
//		case "opcion2":
//			System.out.println("Case 2");
//			break;
//
//		default:
//			break;
//		}
// 		
	}
}
