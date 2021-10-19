package com.sofka.certificacion.yourlogo.page.novedades;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ModuloCrearNovedades extends PageObject {


    @FindBy(xpath = "//a[@class='p-menuitem-link p-ripple ng-star-inserted']//span[text()='Novedades']//..//..")
    WebElementFacade btnNovedades;

    @FindBy(xpath = "/html/body/app-root/router-outlet/div/menu-bar/p-menubar/div/p-menubarsub/ul/li[1]/p-menubarsub/ul/li[1]/a/span[2]")
    WebElementFacade btnCrearNovedades;


    public  void moduloCrearNovedades() throws InterruptedException {
        Thread.sleep(4000);
        btnNovedades.click();
        Thread.sleep(2000);
        btnCrearNovedades.click();
    }
}
