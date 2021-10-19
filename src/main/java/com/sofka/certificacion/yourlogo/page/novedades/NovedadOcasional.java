package com.sofka.certificacion.yourlogo.page.novedades;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class NovedadOcasional extends PageObject {

    @FindBy(id = "dropdown-concept")
    WebElementFacade btonConcepto;

    @FindBy(xpath = "//li[@aria-label='209- REINTEGRO PTMO SEGUROS VEHICULO']")
    WebElementFacade seleccionarConcepto;

    @FindBy(id = "dropdown-value-type")
    WebElementFacade btonUnidad;

    @FindBy(xpath = "//li[@aria-label='Nominal']")
    WebElementFacade seleccionarUnidMedida;

    @FindBy(xpath = "//div[@class='p-checkbox-box']")
    WebElementFacade checkReintegro;

    @FindBy(xpath = "//div[@class='p-field form-input']//p-inputnumber//span//input")
    WebElementFacade btonValor;

    @FindBy(xpath = "//div[@class='p-field form-input']//p-inputnumber//span//input")
    WebElementFacade campoValor;

    @FindBy(xpath = "//button[@class='p-ripple p-button p-component']")
    WebElementFacade btnAceptar;

    @FindBy(id = "next-button")
    WebElementFacade btnContinuar;



    public  void ingresarDatosNovedad() {
        btonConcepto.click();
        seleccionarConcepto.click();
        btonUnidad.click();
        seleccionarUnidMedida.click();
        waitABit(2000);
        checkReintegro.click();
        btonValor.click();
        campoValor.sendKeys("2000");
        btnAceptar.click();
        btnContinuar.click();

    }


}
