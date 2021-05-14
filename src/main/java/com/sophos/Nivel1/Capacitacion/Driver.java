package com.sophos.Nivel1.Capacitacion;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Driver {
	private static WebDriver driver;

	public static WebDriver getDriver() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		this.driver = driver;
	}

	public void lanzarNavegador(String navegador) {
		navegador = navegador.toLowerCase();

		switch (navegador) {
		case "google":
			System.setProperty("webdriver.chrome.driver", "src\\main\\java\\resources\\drivers\\chromedriver.exe");
			ChromeOptions options2 = new ChromeOptions();
//			options2.addArguments("start-maximized");
//			options2.setExperimentalOption("useAutomationExtension", false);
//			options2.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
			options2.setExperimentalOption("debuggerAddress", "127.0.0.1:9222"); //Perrada 99
			driver = new ChromeDriver(options2);
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver", ".\\src\\main\\java\\resources\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		case "ie":
			String rutaDriver = ".\\src\\main\\java\\resources\\drivers\\IEDriverServer.exe";
			System.setProperty("webdriver.ie.driver", rutaDriver);
			InternetExplorerOptions options = new InternetExplorerOptions();
			options.ignoreZoomSettings();
			options.introduceFlakinessByIgnoringSecurityDomains();
			options.enablePersistentHovering();
			options.disableNativeEvents();
			driver = new InternetExplorerDriver(options);

			break;
		default:
			System.out.println("El valor ingresado no existe, o no ha sido programado");
			break;
		}

	}// method lanzarNavegador

	public void navegarA(String url) {
//		driver.get(url);
		driver.navigate().to(url);
	}

	public void addCookie(String key, String value) {
		driver.manage().addCookie(new Cookie(key, value));
	}

	public void cierreNavegador() {
		driver.close();
	}

}
