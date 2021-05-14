package com.sophos.Nivel1.Capacitacion;

import java.io.File;
import java.io.IOException;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import javax.swing.JOptionPane;

import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Keys;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.Command;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.openqa.selenium.winium.WiniumDriverCommandExecutor;
import org.openqa.selenium.winium.WiniumDriverService;
import org.openqa.selenium.winium.WiniumOptions;
import org.sikuli.script.Screen;

import com.libreria.LibreriaClase.FuncionesMatematicas.FuncionesAritmeticas;
import com.sophos.Nivel1.Capacitacion.Clase4.Carro;
import com.sophos.Nivel1.Capacitacion.Clase4.Modificadores1;
import com.sophos.Nivel1.Capacitacion.Clase4.Polihedro;
import com.sophos.Nivel1.Capacitacion.Clase4.Rectagulo;
import com.sophos.Nivel1.Capacitacion.Csv.LeerArchivosCsv;
import com.sophos.Nivel1.Capacitacion.PageObject.VistaHomeEbay;
import com.sophos.Nivel1.Capacitacion.PageObject.VistaHomeMercadoLibre;
import com.sophos.Nivel1.Capacitacion.PageObject.VistaResultados;
import com.sophos.Nivel1.Capacitacion.PatronFactory.Fruta;
import com.sophos.Nivel1.Capacitacion.PatronFactory.Mango;
import com.sophos.Nivel1.Capacitacion.PatronFactory.Manzana;
import com.sophos.Nivel1.Capacitacion.Tour.Francia;

import net.bytebuddy.asm.Advice.Local;

/**
 * Hello world!
 *
 */
public class App {
	static int count = 0;
	private static String user = "admin";
	private static String keyUser = "123";

	public static void main(String[] args) {
		System.out.println("Respuesta" + test(4) + " \n" + "===================\n");
		test2();
//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\usuario\\IdeaProjects\\serenitybddlerning\\src\\test\\resources\\drivers\\chromedriver.exe");
//		WebDriver driver;
//		driver = new ChromeDriver();
//		driver.get("http://www.google.com");
//		try {
//			Thread.sleep(4000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		driver.quit();
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.alertIsPresent());

//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\usuario\\IdeaProjects\\serenitybddlerning\\src\\test\\resources\\drivers\\chromedriver.exe");
//		WebDriver driver;
//		for (int i = 0; i < 3; i++) {
//			driver = new ChromeDriver();
//			driver.get("https://es.duolingo.com/");
//			WebElement botonYaTengoUnaCuenta = driver
//					.findElement(By.xpath("//*[@id=\"root\"]/div/div/span[1]/div/div[1]/div[2]/div[2]/a"));
//			botonYaTengoUnaCuenta.click();
//			WebElement cajaTextoUsuario = driver.findElement(
//					By.xpath("//*[@id=\"overlays\"]/div[5]/div/div/form/div[1]/div[1]/div[1]/label/div/input"));
//			cajaTextoUsuario.sendKeys("usuario@prueba.com");
//			WebElement cajaTextoClave = driver.findElement(
//					By.xpath("//*[@id=\"overlays\"]/div[5]/div/div/form/div[1]/div[1]/div[2]/label/div[1]/input"));
//			cajaTextoClave.sendKeys("clave123151");
//			driver.quit();
//	}
//		try {
//			Thread.sleep(3000);
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//		driver.getDriver().findElement(By.name("pbFechaIda")).click();
//		WebElement cajaDeFecha = driver.getDriver().findElement(By.className("calendar-container"));
//		try {
//			Thread.sleep(1000);
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//		WebElement botonAnterio;
//		int intentosDeAnterior = 12;
//		while (intentosDeAnterior > 0) {
//			botonAnterio = cajaDeFecha.findElement(By.className("prev"));
//			if (botonAnterio.getAttribute("class").toLowerCase().contains("disabled")) {
//				System.out.println("Botón anterior deshabilitado");
//				break;
//			}
//			botonAnterio.click();
//			intentosDeAnterior--;
//			try {
//				Thread.sleep(300);
//			} catch (Exception e) {
//				// TODO: handle exception
//			}
//		}
//		boolean encontroFechaInicial = false;
//		List<WebElement> listaTDs = cajaDeFecha.findElements(By.tagName("td"));
//		System.out.println("Cantidad de tags");
//		for (WebElement fechaParticular : listaTDs) {
//			if (fechaParticular.getAttribute("class").contains("number")) {
//				System.out.println(fechaParticular.getAttribute("data-date"));
//				if (fechaParticular.getAttribute("data-date").contains("2021-02-30")) {
//					fechaParticular.click();
//					encontroFechaInicial = true;
//					break;
//				}
//			}
//		}
//
//		if (!encontroFechaInicial) {
//			throw new RuntimeException("La fecha inicial no fue encontrada");
//		}

//		Driver driver = new Driver();
//		driver.lanzarNavegador("google");
//		driver.navegarA("https://co.marca.com/claro/ciclismo/tour-francia/clasificacion.html");
//		Francia francia = new Francia(driver.getDriver());
//		francia.listaTablas();
//		try {
//			Thread.sleep(5000);
//		} catch (Exception e) {
//		}
//		driver.cierreNavegador();

//		BaseDeDatos obj = new BaseDeDatos();
//		obj.conexion();

//		App obj = new App();
//		try {
//			obj.clase11MercadoLibre();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

	}

	public static int test(int x) {
		System.out.println(">" + x);
		if (x <= 1) {
			return 1;
		} else {
			return test(x - 1) * x;
		}
	}

	public static void test2() {
		int index = 13;
		int sum = 0;
		int k = 0;
		while (k < index) {
			k = k + 1;
			sum = sum + k;
			System.out.println(k +"-:-"+sum);
		}

		System.out.println("<_>" + sum);
	}
	
	public void motor(String disel) {
		
	}
	
	public void motor(int gasolina) {
		
	}

	public static void pruebaWinium() {
		ChromeOptions options2 = new ChromeOptions();
//		options2.addArguments("start-maximized");
//		options2.setExperimentalOption("useAutomationExtension", false);
//		options2.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
		options2.setExperimentalOption("debuggerAddress", "127.0.0.1:9222"); // Perrada 99
		WiniumDriverService service = new WiniumDriverService.Builder().usingDriverExecutable(new File(""))
				.buildDesktopService();
		DesktopOptions options = new DesktopOptions();
		WebDriver driver = new WiniumDriver(options);

	}

	public void clase12iEBay() {
		Driver objDriver = new Driver();
		objDriver.lanzarNavegador("google");
		objDriver.navegarA("https://www.ebay.com/");
		VistaHomeEbay ebay = new VistaHomeEbay(objDriver.getDriver());
		if (ebay.seleccionarListaDesplegablePorNombre("Cámaras y   fotografía")) {
			System.out.println("Pudo seleccionar una posición");
		} else {
			System.out.println("La posición ingresada no existe");
		}

		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		objDriver.cierreNavegador();

	}

	public void clase11MercadoLibre() throws IOException {
		LeerArchivosCsv obj = new LeerArchivosCsv();
//		obj.leerCsv();
		System.out.println("inicio");
		List<CSVRecord> lista = obj.todasLista("./ejercicio.csv");
		System.out.println("Número de lineas: " + lista.size());
		System.out.println("Número de lineas lista: " + lista.size());
//		System.out.println(csvParser.getRecords().size());
		for (CSVRecord linea : lista) {
			Driver objDriver = new Driver();
			objDriver.lanzarNavegador(linea.get(0));
			objDriver.navegarA("https://www.mercadolibre.com.co/");
			VistaHomeMercadoLibre objVistaHome = new VistaHomeMercadoLibre(objDriver.getDriver());
			objVistaHome.setTexto(linea.get(1));

			VistaResultados objResultados = new VistaResultados(objDriver.getDriver());
			if (objResultados.darClickPrimerResultado()) {
				System.out.println("El elemento exite");
			} else {
				System.out.println("El elemento que desea buscar no existe");
			}

			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			objDriver.cierreNavegador();
		}

	}

	public void clase10() {
//		Fruta mango = new Mango();
//		System.out.println(mango.color());
//		
//		Fruta manzana = new Manzana();
//		System.out.println(manzana.color());
//		
//		WebDriver objDriver = new ChromeDriver();

		PatronSingleton objPatron = PatronSingleton.getInstancia("Instancia uno", "clave 1");
		System.out.println(objPatron.toString());
	}

	public void clase9() {
		Ordenamiento objOrde = new Ordenamiento();
		objOrde.metodo1();
		objOrde.recursividad(1);

		int arreglo[] = { 7, 5, 9, 41, 74, 2, 47, 34, 12 };
		objOrde.ordenamientoBurbuja(arreglo);

		for (int i = 0; i < arreglo.length; i++) {
			System.out.print("[" + arreglo[i] + "],");
		}

	}

	public void paginaMecadoLibre() {
		WebDriver driverLocal;
		Driver objDriver = new Driver();
		objDriver.lanzarNavegador("GOOGLE");
		objDriver.navegarA("https://www.mercadolibre.com.co/");
		WebElement cajaTexto = objDriver.getDriver().findElement(By.name("as_word"));
		cajaTexto.sendKeys("Sillas gamer");
		cajaTexto.submit();
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		List<WebElement> listaElementos = objDriver.getDriver().findElements(By.className("objDriver.getDriver()"));

		System.out.println("Cantidad elementos encontrados " + listaElementos.size());
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		objDriver.cierreNavegador();
	}

	public void clase8() {
		Driver objDriver = new Driver();
		objDriver.lanzarNavegador("google");
		objDriver.navegarA("https://www.google.com/");

		WebElement cajaTexto = objDriver.getDriver().findElement(By.name("q"));
		cajaTexto.sendKeys("Html");
		WebElement cajaTexto2 = objDriver.getDriver()
				.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input"));
		cajaTexto2.sendKeys(" 5");
		cajaTexto2.submit();

		ArrayList<WebElement> listaElemento = (ArrayList<WebElement>) objDriver.getDriver()
				.findElements(By.className("LC20lb DKV0Md"));
		for (WebElement elemento : listaElemento) {
			System.out.println(elemento.getText());
		}
//		WebElement botonBuscar = objDriver.getDriver().findElement(By.name("btnK"));
//		botonBuscar.click();

		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			System.out.println("Fallo en la espera");
		}

		objDriver.cierreNavegador();
	}

	public void clase6_2() {
		int limiteInferior = -30;
		int limiteSuperior = 9;
		while (limiteInferior <= limiteSuperior) {
			System.out.println("El resultado potencia al cuadrado de cuando x es:" + limiteInferior + ": "
					+ Math.pow(limiteInferior, 2));
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
