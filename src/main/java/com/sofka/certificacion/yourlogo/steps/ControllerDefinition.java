package com.sofka.certificacion.yourlogo.steps;

import com.sofka.certificacion.yourlogo.page.*;

import jnr.ffi.annotations.In;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class ControllerDefinition extends PageObject {

  
	TipoNovedades tipoNovedades = new TipoNovedades();
	PaginaInicial paginaInicial = new PaginaInicial();
	Compania compania = new Compania();
	Periodo periodo= new Periodo();
	Persona persona= new Persona();
	NovedadFija novedadFija = new NovedadFija();
	NovedadOcasional novedadOcasional = new NovedadOcasional();
	NovedadFijaEspecial novedadFijaEspecial = new NovedadFijaEspecial();
	Verificacion verificacion = new Verificacion();

	
	@Step
	public void abrirUrl() {
		paginaInicial.open();
	}
	@Step
	public void novedadOcasional() throws InterruptedException {
		tipoNovedades.seleccionarNovedadOcasional();
	}

	@Step
	public void novedadFija() {
		tipoNovedades.seleccionarNovedadFija();
	}


	@Step
	public void novedadFijaEspecial() {
		tipoNovedades.seleccionarNovedadFijaEspecial();
	}

	@Step
	public void seleccionarCompania() {
		compania.SeleccionarCompania();
	}

	@Step
	public void seleccionarperiodo() {
		periodo.SeleccionarPeriodoEspecifico();
	}

	@Step
	public void seleccionarPerona() throws InterruptedException {
		persona.ingresarCedula();
		persona.seleccionarUsuario();
	}

	@Step
	public void ingresarDatosNovedad() {
		novedadOcasional.ingresarDatosNovedad();
	}

	@Step
	public void ingresarDatosNovedadfija() {
		novedadFija.fechaInicialActual();
		novedadFija.ingresarDatosNovedadFija();

	}

	@Step
	public void verificacion() {
		verificacion.enviarDatos();

	}

	@Step
	public void seleccionarAccionFijaEspecial(String accion) {
		novedadFijaEspecial.fechafinalActual();
		novedadFijaEspecial.seleccinarTipoAccionNovedadfijaEspecial(accion);

	}


	






}
