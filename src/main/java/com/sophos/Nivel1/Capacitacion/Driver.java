package com.sophos.Nivel1.Capacitacion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

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
		driver = new InternetExplorerDriver();
		driver.get("https://www.google.com/");
		WebElement elemento = driver.findElement(By.name("q"));
		driver.close();
	}

	public void navegadorFireFox() {
		String rutaDriver = ".\\src\\main\\java\\resources\\drivers\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", rutaDriver);
		driver = new FirefoxDriver();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		driver.close();
	}

}
