package com.sofka.certificacion.yourlogo.utiles;

import com.github.javafaker.Faker;
import net.serenitybdd.core.pages.PageObject;

public class MetodosUtiles  extends PageObject {

    public String  generarNombrealeatorio() {
        Faker faker = new Faker();
        String firstName = faker.name().firstName();
        return firstName;
    }

    public String  generarEmialAleatorio() {
        Faker faker = new Faker();
        String email = faker.internet().emailAddress();
        return email;
    }




}
