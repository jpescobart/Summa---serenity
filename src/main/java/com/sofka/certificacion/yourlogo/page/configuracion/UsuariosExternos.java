package com.sofka.certificacion.yourlogo.page.configuracion;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import org.openqa.selenium.support.FindBy;

public class UsuariosExternos extends PageObject {


    @FindBy(xpath = "/html/body/app-root/router-outlet/div/menu-bar/p-menubar/div/p-menubarsub/ul/li/a/span[2]")
    WebElementFacade btnConfiguracion;

    @FindBy(xpath = "/html/body/app-root/router-outlet/div/menu-bar/p-menubar/div/p-menubarsub/ul/li[2]/p-menubarsub/ul/li[3]/a/span[2]")
    WebElementFacade btnusuariosExternos;

    @FindBy(id = "add-user")
    WebElementFacade btnCrearUsuarios;

    @FindBy(id = "dropdown-roles")
    WebElementFacade selectRol;

    @FindBy(xpath = "//li[@aria-label='Tercero']")
    WebElementFacade rol;

    @FindBy(xpath = "//input[@id='name-input']")
    WebElementFacade nombres;

    @FindBy(xpath = "//input[@id='email-input']")
    WebElementFacade emails;

    @FindBy(id = "dropdown-noveltygroups")
    WebElementFacade selectGrupoNovedad;

    @FindBy(xpath = "//li[@aria-label='Beneficios Summa']")
    WebElementFacade grupoNovedad;

    @FindBy(id = "confirm-button")
    WebElementFacade btnEnviar;

    @FindBy(xpath = "//div[@class='p-field form-input p-inputgroup']//button[@type='button']")
    WebElementFacade btnValidarEmail;



    public  void Moduloconfiguracion() throws InterruptedException {
        Thread.sleep(4000);
        btnConfiguracion.click();
    }
        public  void moduloCrearUsuariosExternos(String nombre, String email) throws InterruptedException {
        btnusuariosExternos.click();
        btnCrearUsuarios.click();
        selectRol.click();
        rol.click();
        Thread.sleep(2000);
        nombres.sendKeys(nombre);
        emails.sendKeys(email);
        selectGrupoNovedad.click();
        grupoNovedad.click();

    }
    public  void validarCorreo() throws InterruptedException {
        btnValidarEmail.click();
        Thread.sleep(5000);
        btnEnviar.click();
    }
}
