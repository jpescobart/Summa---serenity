package com.sofka.certificacion.yourlogo.page.novedades;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.FindBy;
import org.yecht.Data;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class NovedadFijaEspecial extends PageObject {


    @FindBy(xpath = "//span[@id='dropdown-action']//..")
    WebElementFacade btonAccion;


    @FindBy(xpath = "//span[text()='Modificación Valor']")
    WebElementFacade seleccionModificacionValor;

    @FindBy(xpath = "//span[text()='Modificación Fecha']")
    WebElementFacade seleccionModificacionFecha;

    @FindBy(xpath = "//span[text()='Modificación Fecha y Valor']")
    WebElementFacade seleccionModificacionFechaValor;

    @FindBy(xpath = "//span[text()='Modificación del periodo de aplicación']")
    WebElementFacade seleccionModificacionPeriodo;

    @FindBy(xpath = "//p-dropdown[@inputid='concept']//div")
    WebElementFacade btonConcepto;

    @FindBy(xpath = "//li[@aria-label='206-CONDONACION POLIZA VEHICULO']")
    WebElementFacade seleccionarConcepto;

    @FindBy(xpath = "//input[@id='applicationPeriod']//..//..")
    WebElementFacade btonPeriodoAplicacion;

    @FindBy(xpath = "//li[@aria-label='2da Quincena']//span")
    WebElementFacade seleccionarPeriodoAplicacion;

    @FindBy(id = "dropdown-value-type")
    WebElementFacade btonUnidad;

    @FindBy(xpath = "//li[@aria-label='Nominal']")
    WebElementFacade seleccionarUnidMedida;

    @FindBy(xpath = "//div[@class='p-checkbox-box']")
    WebElementFacade checkReintegro;

    @FindBy(xpath = "//input[@id='value']")
    WebElementFacade btonValor;

    @FindBy(xpath = "//input[@id='value']")
    WebElementFacade campoValor;

    @FindBy(xpath = "//button[@class='p-ripple p-button p-component']")
    WebElementFacade btnAceptar;

    @FindBy(id = "initial-date")
    WebElementFacade btonFechaInicial;

    @FindBy(xpath = "//p-calendar[@inputid='initial-date']//table//tbody//tr//span[text()='9']")
    WebElementFacade seleccionarFechaInicial;

    @FindBy(xpath = "//p-calendar[@inputid='finalDate']//span")
    WebElementFacade btonFechafinal;

    @FindBy(xpath = "//p-calendar[@inputid='finalDate']//table//tbody//tr//span[text()='10']")
    WebElementFacade seleccionarFechaFinal;

    @FindBy(id = "observation")
    WebElementFacade observaciones;

    @FindBy(xpath = "//p-button[@id='next-button']//button")
    WebElementFacade btnContinuar;

    @FindBy(xpath = "//p-button[@id='add-more-button']//button")
    WebElementFacade btnAgregarNovedad;


    int fechaFinalActual;

    public void fechafinalActual() {
        String timeStamp = new SimpleDateFormat("dd").format(Calendar.getInstance().getTime());
        fechaFinalActual = Integer.parseInt(timeStamp);
        System.out.println(fechaFinalActual);

    }


    public void seleccinarTipoAccionNovedadfijaEspecial(String contador) {
        int contadorFinal = Integer.parseInt(contador);
        String accion;
        switch (contadorFinal) {

            case 1:
                accion = "Eliminaciòn";
                btonAccion.click();
                getDriver().findElement(By.xpath("//span[contains(text(),'Elimina')]//..")).click();
                waitABit(2000);
                btonConcepto.click();
                seleccionarConcepto.click();
                btonUnidad.click();
                seleccionarUnidMedida.click();
                btonValor.click();
                campoValor.sendKeys("2000");
                observaciones.sendKeys("Pruebas juan pablo");
                btnAceptar.click();
                btnContinuar.click();
                break;
            case 2:
                accion = "Modificaciòn Valor";
                btonAccion.click();
                getDriver().findElement(By.xpath("//span[contains(text(),'Modificaci')][1]")).click();
                waitABit(2000);
                btonConcepto.click();
                seleccionarConcepto.click();
                btonUnidad.click();
                seleccionarUnidMedida.click();
                btonValor.click();
                campoValor.sendKeys("2000");
                observaciones.sendKeys("Pruebas juan pablo");
                btnAceptar.click();
                btnContinuar.click();

                break;
            case 3:
                accion = "Modificaciòn Fecha";
                btonAccion.click();
                getDriver().findElement(By.xpath("//span[contains(text(),'Fecha')][1]")).click();
                waitABit(2000);
                btonConcepto.click();
                seleccionarConcepto.click();
                btonFechafinal.click();
                getDriver().findElement(By.xpath("//p-calendar[@inputid='finalDate']//table//tbody//tr//span[text()='" + fechaFinalActual + "']")).click();
                observaciones.sendKeys("Pruebas juan pablo");
                btnAceptar.click();
                btnContinuar.click();
                break;
            case 4:
                accion = "Modificaciòn Fecha y Valor";
                btonAccion.click();
                getDriver().findElement(By.xpath("//span[contains(text(),'Fecha y Valor')][1]")).click();
                waitABit(2000);
                btonConcepto.click();
                ;
                seleccionarConcepto.click();
                btonFechafinal.click();
                getDriver().findElement(By.xpath("//p-calendar[@inputid='finalDate']//table//tbody//tr//span[text()='" + fechaFinalActual + "']")).click();
                btonUnidad.click();
                seleccionarUnidMedida.click();
                btonValor.click();
                campoValor.sendKeys("2000");
                observaciones.sendKeys("Pruebas juan pablo");
                btnAceptar.click();
                btnContinuar.click();
                break;
            case 5:
                accion = "Modificaciòn del periodo de aplicacion";
                btonAccion.click();
                getDriver().findElement(By.xpath("//span[contains(text(),'periodo de aplicaci')]//..")).click();
                waitABit(2000);
                btonConcepto.click();
                ;
                seleccionarConcepto.click();
                btonPeriodoAplicacion.click();
                seleccionarPeriodoAplicacion.click();
                observaciones.sendKeys("Pruebas juan pablo");
                btnAceptar.click();
                btnContinuar.click();
                break;
            default:
                accion = "Dia inválido";
                break;
        }

        System.out.println(accion);

    }

    public void seleccinarTipoAccionNovedadfijaEspecialVariasVeces(String contador) throws InterruptedException {
        int contadorFinal = Integer.parseInt(contador);
        String accion;

        switch (contadorFinal) {

            case 1:
                accion = "Eliminaciòn";
                for (int i = 0; i <= 5; i++) {
                    btonAccion.click();
                    getDriver().findElement(By.xpath("//span[contains(text(),'Elimina')]//..")).click();
                    waitABit(2000);
                    btonConcepto.click();
                    seleccionarConcepto.click();
                    btonUnidad.click();
                    seleccionarUnidMedida.click();
                    btonValor.click();
                    campoValor.sendKeys("2000");
                    observaciones.sendKeys("Pruebas juan pablo");
                    btnAceptar.click();
                    if (i != 5) {
                        btnAgregarNovedad.click();
                    }
                }
                Thread.sleep(4000);
                btnContinuar.click();
                break;
            case 2:
                accion = "Modificaciòn Valor";
                for (int i = 0; i <= 5; i++) {
                    btonAccion.click();
                    getDriver().findElement(By.xpath("//span[contains(text(),'Modificaci')][1]")).click();
                    waitABit(2000);
                    btonConcepto.click();
                    seleccionarConcepto.click();
                    btonUnidad.click();
                    seleccionarUnidMedida.click();
                    btonValor.click();
                    campoValor.sendKeys("2000");
                    observaciones.sendKeys("Pruebas juan pablo");
                    btnAceptar.click();
                    if (i != 5) {
                        btnAgregarNovedad.click();
                    }
                }
                Thread.sleep(4000);
                btnContinuar.click();
                break;
            case 3:
                accion = "Modificaciòn Fecha";
                for (int i = 0; i <= 5; i++) {
                    btonAccion.click();
                    getDriver().findElement(By.xpath("//span[contains(text(),'Fecha')][1]")).click();
                    waitABit(2000);
                    btonConcepto.click();
                    seleccionarConcepto.click();
                    btonFechafinal.click();
                    getDriver().findElement(By.xpath("//p-calendar[@inputid='finalDate']//table//tbody//tr//span[text()='" + fechaFinalActual + "']")).click();
                    observaciones.sendKeys("Pruebas juan pablo");
                    btnAceptar.click();
                    if (i != 5) {
                        btnAgregarNovedad.click();
                    }
                }
                Thread.sleep(4000);
                btnContinuar.click();
                break;
            case 4:
                accion = "Modificaciòn Fecha y Valor";
                for (int i = 0; i <= 5; i++) {
                    btonAccion.click();
                    getDriver().findElement(By.xpath("//span[contains(text(),'Fecha y Valor')][1]")).click();
                    waitABit(2000);
                    btonConcepto.click();
                    ;
                    seleccionarConcepto.click();
                    btonFechafinal.click();
                    getDriver().findElement(By.xpath("//p-calendar[@inputid='finalDate']//table//tbody//tr//span[text()='" + fechaFinalActual + "']")).click();
                    btonUnidad.click();
                    seleccionarUnidMedida.click();
                    btonValor.click();
                    campoValor.sendKeys("2000");
                    observaciones.sendKeys("Pruebas juan pablo");
                    btnAceptar.click();
                    if (i != 5) {
                        btnAgregarNovedad.click();
                    }
                }

                Thread.sleep(4000);
                btnContinuar.click();
                break;
            case 5:
                accion = "Modificaciòn del periodo de aplicacion";
                for (int i = 0; i <= 5; i++) {
                    btonAccion.click();
                    getDriver().findElement(By.xpath("//span[contains(text(),'periodo de aplicaci')]//..")).click();
                    waitABit(2000);
                    btonConcepto.click();
                    ;
                    seleccionarConcepto.click();
                    btonPeriodoAplicacion.click();
                    seleccionarPeriodoAplicacion.click();
                    observaciones.sendKeys("Pruebas juan pablo");
                    btnAceptar.click();
                    if (i != 5) {
                        btnAgregarNovedad.click();
                    }
                }

                Thread.sleep(4000);
                btnContinuar.click();
                break;
            default:
                accion = "Dia inválido";
                break;
        }

        System.out.println(accion);

    }

}


