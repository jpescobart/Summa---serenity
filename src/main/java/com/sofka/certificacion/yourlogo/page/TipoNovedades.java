package com.sofka.certificacion.yourlogo.page;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.awt.print.PageFormat;

public class TipoNovedades  extends PageObject {

    @FindBy(id = "novelty-1")
    WebElementFacade btonOcasionales;

    @FindBy(id = "novelty-2")
    WebElementFacade btonFijas;

    @FindBy(id = "novelty-3")
    WebElementFacade btonFijasEspeciales;


   public  void seleccionarNovedadOcasional() throws InterruptedException {
       btonOcasionales.click();
   }

    public  void seleccionarNovedadFija(){
        btonFijas.click();
    }
    public  void seleccionarNovedadFijaEspecial(){
        btonFijasEspeciales.click();
    }
}


