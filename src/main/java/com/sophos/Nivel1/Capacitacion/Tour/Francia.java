package com.sophos.Nivel1.Capacitacion.Tour;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Francia extends PageFactory {

	public Francia(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(className = "ue-table-ranking__tr")
	private List<WebElement> listaOfTable;
	
	@FindBy(id ="selectweb")
	private WebElement etapa;
	
	
	public void listaTablas() {
		Select seleccion = new Select(etapa);
		seleccion.selectByVisibleText("Etapa 21");
		
		System.out.println(listaOfTable.size());
		for (WebElement element:listaOfTable) {
			System.out.println(element.getText());
		}
	}
	

}
