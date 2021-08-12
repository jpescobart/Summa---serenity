package com.sofka.certificacion.yourlogo.page;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Compania  extends PageObject {

    @FindBy (id = "company-5")
    WebElementFacade seleccionarCompania;


    public  void SeleccionarCompania(){
        seleccionarCompania.click();
    }
}
