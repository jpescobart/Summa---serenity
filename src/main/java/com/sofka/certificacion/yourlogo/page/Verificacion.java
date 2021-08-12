package com.sofka.certificacion.yourlogo.page;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class Verificacion extends PageObject {

    @FindBy(id = "send-buton")
    WebElementFacade btnEnviar;

    public  void enviarDatos(){
        btnEnviar.click();
    }
}
