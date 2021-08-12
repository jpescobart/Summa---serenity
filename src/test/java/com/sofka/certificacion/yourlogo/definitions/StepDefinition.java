package com.sofka.certificacion.yourlogo.definitions;

import java.util.List;

import com.sofka.certificacion.yourlogo.steps.ControllerDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {

	ControllerDefinition controllerDefinition;


	//---------------------------------------------------------------------------------------------------------
	@Given("^que  ingreso al portal de novedades de Summa$")
	public void queIngresoAlPortalDeNovedadesDeSumma() {
		controllerDefinition.abrirUrl();
	}

	@When("^seleccion un cliente e ingresos todos los datos para una novedad ocasional$")
	public void seleccionUnClienteEIngresosTodosLosDatosParaUnaNovedadOcasional() throws InterruptedException {
		Thread.sleep(3000);
		controllerDefinition.novedadOcasional();
		controllerDefinition.seleccionarCompania();
		controllerDefinition.seleccionarperiodo();
		controllerDefinition.seleccionarPerona();
		controllerDefinition.ingresarDatosNovedad();

	}

	@Then("^el sistema permite enviar la novedad generada correctamente$")
	public void elSistemaPermiteEnviarLaNovedadGeneradaCorrectamente() {
		controllerDefinition.verificacion();
	}

	//------------------------------------------------------------------------------------------------------------

	@When("^seleccion un cliente e ingresos todos los datos para una novedad fija$")
	public void seleccionUnClienteEIngresosTodosLosDatosParaUnaNovedadFija() throws InterruptedException {
		controllerDefinition.novedadFija();
		controllerDefinition.seleccionarCompania();
		controllerDefinition.seleccionarperiodo();
		controllerDefinition.seleccionarPerona();
		controllerDefinition.ingresarDatosNovedadfija();
	}


	@When("^seleccion un cliente e ingresos todos los datos para una novedad fija especial con \"([^\"]*)\"$")
	public void seleccionUnClienteEIngresosTodosLosDatosParaUnaNovedadFijaEspecialCon(String accion) throws Throwable {
		controllerDefinition.novedadFijaEspecial();
		controllerDefinition.seleccionarCompania();
		controllerDefinition.seleccionarperiodo();
		controllerDefinition.seleccionarPerona();
		controllerDefinition.seleccionarAccionFijaEspecial(accion);
		throw new PendingException();
	}
}


