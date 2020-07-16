package com.sophos.Nivel1.Capacitacion.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.Select;

public class VistaHomeMercadoLibre {
	private WebDriver driver;
	
	public VistaHomeMercadoLibre(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10) , this);
	}
	
	@FindBy(name = "as_word")
	WebElement cajaTexto;
	
	@FindBy(xpath = "/html/body/header/div/div[2]/ul/li[2]/a")
	WebElement categorias;
	
	
	public void setTexto(String texto) {
		cajaTexto.sendKeys(texto);
		cajaTexto.submit();
	}
	
	public void darClickEnCategorias() {
		categorias.click();
	}
	
	public void nombreMetodo() {
		WebElement nombreElemento = driver.findElement(By.id("idElemento"));
		String variable = nombreElemento.getText(); 
	}
	
	
	

}
