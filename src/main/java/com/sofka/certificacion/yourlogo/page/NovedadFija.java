package com.sofka.certificacion.yourlogo.page;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class NovedadFija extends PageObject {

    @FindBy(id = "dropdown-concept")
    WebElementFacade btonConcepto;

    @FindBy(xpath = "//li[@aria-label='206-CONDONACION POLIZA VEHICULO']")
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

    @FindBy(id = "initial-date")
    WebElementFacade btonFechaInicial;

    @FindBy(id = "finalDate")
    WebElementFacade btonFechafinal;

    @FindBy(xpath = "//p-calendar[@inputid='final-date']//table//tbody//tr//span[text()='10']")
    WebElementFacade seleccionarFechaFinal;

    @FindBy(id = "next-button")
    WebElementFacade btnContinuar;





    int fechaInicialActual;
    public  void fechaInicialActual(){
        String timeStamp = new SimpleDateFormat("dd").format(Calendar.getInstance().getTime());
        fechaInicialActual= Integer.parseInt(timeStamp);
        System.out.println(fechaInicialActual);

    }

    public  void ingresarDatosNovedadFija() {
        btonConcepto.click();
        seleccionarConcepto.click();
        btonFechaInicial.click();
        getDriver().findElement(By.xpath("//p-calendar[@inputid='initial-date']//table//tbody//tr//span[text()='"+fechaInicialActual+"']")).click();
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
