package com.sofka.certificacion.yourlogo.page;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class Periodo extends PageObject {

    @FindBy(id = "period-6")
    WebElementFacade seleccionarPeriodo;

    public  void SeleccionarPeriodoEspecifico(){
        seleccionarPeriodo.click();
    }


}
