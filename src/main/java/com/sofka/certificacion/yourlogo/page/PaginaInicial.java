package com.sofka.certificacion.yourlogo.page;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://app-portalnovedades-frontend-qa.azurewebsites.net/novedades")
public class PaginaInicial extends PageObject {

    @FindBy(xpath = "//div[@id='g-summa']//img")
    WebElementFacade seleccionarCompania;

    @FindBy(xpath = "//input[@name='loginfmt']")
    WebElementFacade ingresarCorreo;

    @FindBy(id = "idSIButton9")
    WebElementFacade btnsiguiente;

    @FindBy(id = "passwordInput")
    WebElementFacade ingresarContrasena;

    @FindBy(id = "submitButton")
    WebElementFacade btIniciarSesion;

    @FindBy(id = "idSIButton9")
    WebElementFacade btSi;



    public  void ingresarSumma() throws InterruptedException {
        seleccionarCompania.click();
        Thread.sleep(5000);
        ingresarCorreo.sendKeys("summaqasnet@summa-sci.com");
        btnsiguiente.click();
        ingresarContrasena.sendKeys("SRub1fh0nzq82e*+p");
        btIniciarSesion.click();
        btSi.click();
    }


}
