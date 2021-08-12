package com.sofka.certificacion.yourlogo.page;

import jdk.nashorn.internal.lookup.MethodHandleFactory;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class Persona extends PageObject {

    @FindBy(id = "document-input")
    WebElementFacade labelCedula;

    @FindBy(id = "document-find-button")
    WebElementFacade btonBuscar;


    public  void ingresarCedula() throws InterruptedException {
        labelCedula.sendKeys("1037607525");
        waitABit(3000);
        btonBuscar.click();
    }

    public  void seleccionarUsuario(){
         getDriver().findElement(By.id("person-1037607525")).click();
    }

}
