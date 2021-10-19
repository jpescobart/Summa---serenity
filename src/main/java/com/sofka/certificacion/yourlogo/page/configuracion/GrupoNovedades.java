package com.sofka.certificacion.yourlogo.page.configuracion;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

public class GrupoNovedades extends  PageObject {


    @FindBy(xpath = "/html/body/app-root/router-outlet/div/menu-bar/p-menubar/div/p-menubarsub/ul/li/p-menubarsub/ul/li[1]/a/span[2]")
    WebElementFacade btnGrupoNovedades;

    @FindBy(id = "add-novelty-group")
    WebElementFacade btnCrearGrupo;

    @FindBy(id = "group-name-input")
    WebElementFacade nombreGrupoNovedad;

    @FindBy(xpath = "//button[@icon='pi pi-angle-double-right']")
    WebElementFacade btnTodasLasCompanias;

    @FindBy(xpath = "//strong[text()='GRUPO ARGOS S.A.']//..//..//..//button[@icon='pi pi-angle-double-right']")
    WebElementFacade btnTodosLosconceptos1;

    @FindBy(xpath = "//strong[text()='CEMENTOS ARGOS S.A.']//..//..//..//button[@icon='pi pi-angle-double-right']")
    WebElementFacade btnTodosLosconceptos2;

    @FindBy(xpath = "//strong[text()='CELSIA COLOMBIA S.A. E.S.P.']//..//..//..//button[@icon='pi pi-angle-double-right']")
    WebElementFacade btnTodosLosconceptos3;

    @FindBy(xpath = "//strong[text()='ODINSA S.A.']//..//..//..//button[@icon='pi pi-angle-double-right']")
    WebElementFacade btnTodosLosconceptos4;

    @FindBy(xpath = "//strong[text()='SUMMA SERV. CORP. INTEGRALES']//..//..//..//button[@icon='pi pi-angle-double-right']")
    WebElementFacade btnTodosLosconceptos5;


    @FindBy(id = "send-buton")
    WebElementFacade btnEnviarVerificacion;

    @FindBy(xpath ="//button[@class='p-ripple p-button p-component']")
    WebElementFacade btnEnviarGrupoNovedades;

    @FindBy(xpath = "//div[@class='p-field form-input p-inputgroup ng-star-inserted']//button[@type='button']")
    WebElementFacade btnValidarEmail;

    @FindBy(id ="add-button")
    WebElementFacade btnContinuar;


    public void moduloCrearGruposNovedades(String nombre) throws InterruptedException {
        btnGrupoNovedades.click();
        btnCrearGrupo.click();
        nombreGrupoNovedad.sendKeys("PruebasAutomatizadas" + " " + nombre);
        btnValidarEmail.click();
        Thread.sleep(2000);
        btnEnviarGrupoNovedades.click();
    }

    public void moduloCrearCompania() {
        btnTodasLasCompanias.click();
        btnContinuar.click();

    }

    public void moduloCrearConcepto()  {
        btnTodosLosconceptos1.click();
        btnTodosLosconceptos2.click();
        btnTodosLosconceptos3.click();
        btnTodosLosconceptos4.click();
        btnTodosLosconceptos5.click();
        btnContinuar.click();
    }

    public void moduloCrearUsuarios()  {
        btnContinuar.click();
    }

    public void moduloCrearUsuariosExternos(String email)  {
        getDriver().findElement(By.xpath("//div[@class='user-list-detail ng-star-inserted']//span[text()='"+email+"']")).click();
        btnContinuar.click();
    }


    public void moduloVerificacion()  {
        btnEnviarVerificacion.click();
    }


}

