package com.sophos.Nivel1.Capacitacion.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.Select;

public class VistaHomeEbay {
private WebDriver driver;
	
	public VistaHomeEbay(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10) , this);
	}
	
	@FindBy(id = "gh-cat")
	WebElement listaDesplegable;
	
	
	public boolean seleccionarListaDesplegablePorPosicion(int posicion) {
		Select listaDesplegableSelect = new Select(listaDesplegable);
		try {
			listaDesplegableSelect.selectByIndex(posicion);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean seleccionarListaDesplegablePorNombre(String posicion) {
		Select listaDesplegableSelect = new Select(listaDesplegable);
		try {
			listaDesplegableSelect.selectByVisibleText(posicion);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
