package com.sophos.Nivel1.Capacitacion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Driver {
	WebDriver driver;

	public void navegadorGoogle() {
		String rutaDriver = ".\\src\\main\\java\\resources\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", rutaDriver);
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.close();
	}

	public void navegadorInternetExplore() {
		String rutaDriver = ".\\src\\main\\java\\resources\\drivers\\IEDriverServer.exe";
		System.setProperty("webdriver.ie.driver", rutaDriver);
//		DesiredCapabilities cap = DesiredCapabilities.internetExplorer();
//        cap.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		InternetExplorerOptions options = new InternetExplorerOptions();
		options.ignoreZoomSettings();
		options.introduceFlakinessByIgnoringSecurityDomains();
		options.enablePersistentHovering();
		options.disableNativeEvents();
		WebDriver driver = new InternetExplorerDriver(options);
		driver.get("https://www.google.com/");
		WebElement elemento = driver.findElement(By.name("q"));
		System.out.println("Se ejecuta acá");
		driver.close();
		System.out.println("Por ultimo se ejecuta acá");
	}

	public void navegadorFireFox() {
		String rutaDriver = ".\\src\\main\\java\\resources\\drivers\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", rutaDriver);
		driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		driver.close();
	}

}
