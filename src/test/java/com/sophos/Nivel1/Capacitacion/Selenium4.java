package com.sophos.Nivel1.Capacitacion;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.locators.RelativeLocator.RelativeBy;

public class Selenium4 {

	@Test
	public void prueba() {

	}

	public static void main(String[] args) {
		//https://listado.mercadolibre.com.co/mazda#D[A:mazda]
		//Copetir, sypre
		DevTools devTools;
		
		System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		devTools = driver.getDevTools();
		devTools.createSession();
		
		driver.get("https://listado.mercadolibre.com.co/mazda#D[A:mazda]");
		driver.manage().window().maximize();
		RelativeBy element1 = RelativeLocator.withTagName("li")
				.below(By.xpath("(//li[@class ='ui-search-layout__item'])[position()=2]"));
		WebElement element = driver.findElement(element1);
		element.click();
	}

}
