package com.sophos.Nivel1.Capacitacion.PageObject;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VistaResultados {
	private WebDriver driver;
	WebDriverWait wait;

	public VistaResultados(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 10);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 15), this);
	}
	// *[@id="MCO562264363"]/div[2]/div/h2/a/span

	@FindBy(tagName = "li")
	List<WebElement> listResultados;

	public boolean darClickPrimerResultado() {
		boolean encontro = false;
//		wait.until(ExpectedConditions.visibilityOfAllElements(listResultados));
		System.out.println("Cantidad de elementos encontrados");
		System.out.println(listResultados.size());
		for (WebElement elemento : listResultados) {
			try {
				if (elemento.isDisplayed()) {
					if (elemento.getText().contains("$")) {
						List<WebElement> dos = elemento.findElements(By.tagName("h2"));
						System.out.println(dos.get(0).getText());
						System.out.println(dos.size());
						dos.get(0).click();
						encontro = true;
						break;
					}
				}

			} catch (Exception e) {
				System.out.println(">>>>>>>>>>> Error ");
			}
		}
		return encontro;
	}
}
