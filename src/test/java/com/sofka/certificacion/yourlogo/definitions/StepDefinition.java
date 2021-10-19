package com.sofka.certificacion.yourlogo.definitions;

import java.util.List;

import com.sofka.certificacion.yourlogo.steps.ControllerDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {

	ControllerDefinition controllerDefinition;


	//---------------------------------------------------------------------------------------------------------
	@Given("^que  ingreso al portal de novedades de Summa$")
	public void queIngresoAlPortalDeNovedadesDeSumma() throws InterruptedException {
		controllerDefinition.abrirUrl();

	}


	@When("^seleccion un cliente e ingresos todos los datos para una novedad ocasional$")
	public void seleccionUnClienteEIngresosTodosLosDatosParaUnaNovedadOcasional() throws InterruptedException {
		Thread.sleep(3000);
		controllerDefinition.moduloCrearNovedades();
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


	@When("^seleccion un cliente e ingreso todos los datos para generar varias novedad fija especial con \"([^\"]*)\"$")
	public void seleccionUnClienteEIngresoTodosLosDatosParaGenerarVariasNovedadFijaEspecialCon(String accion) throws Throwable {
		controllerDefinition.novedadFijaEspecial();
		controllerDefinition.seleccionarCompania();
		controllerDefinition.seleccionarperiodo();
		controllerDefinition.seleccionarPerona();
		controllerDefinition.seleccionarAccionFijaEspecialVariasVeces(accion);
		throw new PendingException();

	}

	@Then("^el sistema permite enviar las novedades generadas correctamente$")
	public void elSistemaPermiteEnviarLasNovedadesGeneradasCorrectamente() throws InterruptedException {
		controllerDefinition.verificacion();
	}
//-------------------------------------------------Usuarios externos-------------------------
    @When("^ingreso al modulo usuarios externos$")
    public void ingresoAlModuloUsuariosExternos() throws InterruptedException {
		controllerDefinition.moduloconfiguracion();
    }

	@And("^ingreso todos sus datos correctamente$")
	public void ingresoTodosSusDatosCorrectamente() throws InterruptedException {
		controllerDefinition.crearUsuarioExterno();
	}

	@Then("^el sistema permite crear un usuario externo$")
	public void elSistemaPermiteCrearUnUsuarioExterno() {
		System.out.println("Usuario Creado Correctamente");
	}
	//------------------------------------------------------------Usuarios corporativos---------------------------

	@When("^ingreso al modulo usuarios corporativos$")
	public void ingresoAlModuloUsuariosCorporativos() throws InterruptedException {
		controllerDefinition.moduloconfiguracion();
	}


	@And("^ingreso todos sus datos correctamente para el usuario corporativo$")
	public void ingresoTodosSusDatosCorrectamenteParaElUsuarioCorporativo() throws InterruptedException {
		controllerDefinition.crearUsuarioCorporativo();
	}


	@Then("^el sistema permite crear un usuario corporativos$")
	public void elSistemaPermiteCrearUnUsuarioCorporativos() {
		System.out.println("Usuario Creado Correctamente");
	}

//---------------------------------------------------------------grupo novedades -----------------------------------------
	@When("^ingreso al modulo grupo de novedades$")
	public void ingresoAlModuloGrupoDeNovedades() throws InterruptedException {
		controllerDefinition.moduloconfiguracion();
	}

	@And("^ingreso todos sus datos correctamente para crear el grupo de novedad$")
	public void ingresoTodosSusDatosCorrectamenteParaCrearElGrupoDeNovedad() throws InterruptedException {
		controllerDefinition.crearGrupoNovedades();
	}

	@Then("^el sistema permite crear un grupo de novedades$")
	public void elSistemaPermiteCrearUnGrupoDeNovedades(){
		System.out.println("grupo Creado Correctamente");
	}

    @When("^ingreso al modulo usuarios corporatavivos$")
    public void ingresoAlModuloUsuariosCorporatavivos() throws InterruptedException {
		controllerDefinition.moduloconfiguracion();

    }

	@And("^creo un usuario externo$")
	public void creoUnUsuarioExterno() throws InterruptedException {
		controllerDefinition.crearUsuarioCorporativoSinGrupoNovedad();
	}

	@And("^ingreso todos sus datos correctamente para crear el grupo de novedad par el usuario creado$")
	public void ingresoTodosSusDatosCorrectamenteParaCrearElGrupoDeNovedadParElUsuarioCreado() throws InterruptedException {
		controllerDefinition.crearGrupoNovedadesConUsurio();
	}

	@Then("^el sistema permite crear un grupo de novedades asociado al usuario externo creado$")
	public void elSistemaPermiteCrearUnGrupoDeNovedadesAsociadoAlUsuarioExternoCreado() {
		System.out.println("grupo creado corectamente");
	}
}


