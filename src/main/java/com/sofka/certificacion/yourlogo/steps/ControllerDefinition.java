

package com.sofka.certificacion.yourlogo.steps;

import com.sofka.certificacion.yourlogo.page.*;

import com.sofka.certificacion.yourlogo.page.configuracion.GrupoNovedades;
import com.sofka.certificacion.yourlogo.page.configuracion.UsuariosCorporativos;
import com.sofka.certificacion.yourlogo.page.novedades.*;
import com.sofka.certificacion.yourlogo.page.configuracion.UsuariosExternos;
import com.sofka.certificacion.yourlogo.utiles.MetodosUtiles;
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
	ModuloCrearNovedades moduloCrearNovedades = new ModuloCrearNovedades();
	UsuariosExternos usuariosExternos= new UsuariosExternos();
	UsuariosCorporativos usuariosCorporativos = new UsuariosCorporativos();
	GrupoNovedades grupoNovedades = new GrupoNovedades();
	MetodosUtiles metodosUtiles = new MetodosUtiles();
	String nombreAleatorio;
	String emialaleatorio;

	
	@Step
	public void abrirUrl() throws InterruptedException {
		paginaInicial.open();
		paginaInicial.ingresarSumma();
	}

	public void moduloCrearNovedades() throws InterruptedException {
		moduloCrearNovedades.moduloCrearNovedades();
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

	@Step
	public void seleccionarAccionFijaEspecialVariasVeces(String accion) throws InterruptedException {
		novedadFijaEspecial.fechafinalActual();
		novedadFijaEspecial.seleccinarTipoAccionNovedadfijaEspecialVariasVeces(accion);

	}


	@Step
	public void moduloconfiguracion( ) throws InterruptedException {
		usuariosExternos.Moduloconfiguracion();
	}
	@Step
	public void crearUsuarioExterno( ) throws InterruptedException {
	    nombreAleatorio=  metodosUtiles.generarNombrealeatorio();
	    emialaleatorio=metodosUtiles.generarEmialAleatorio();
		usuariosExternos.moduloCrearUsuariosExternos(nombreAleatorio,emialaleatorio);
		usuariosExternos.validarCorreo();
	}

	@Step
	public void crearUsuarioCorporativo( ) throws InterruptedException {
		nombreAleatorio=  metodosUtiles.generarNombrealeatorio();
		emialaleatorio=metodosUtiles.generarEmialAleatorio();
		usuariosCorporativos.moduloCrearUsuariosCorporativos(nombreAleatorio,emialaleatorio);
		usuariosExternos.validarCorreo();
	}

	public void crearUsuarioCorporativoSinGrupoNovedad( ) throws InterruptedException {
		nombreAleatorio=  metodosUtiles.generarNombrealeatorio();
		emialaleatorio=metodosUtiles.generarEmialAleatorio();
		usuariosCorporativos.moduloCrearUsuariosCorporativosSinGrupoNovedad(nombreAleatorio,emialaleatorio);
		usuariosExternos.validarCorreo();
		usuariosCorporativos.verificarUsuarioCrado();
	}

	@Step
	public void crearGrupoNovedades( ) throws InterruptedException {
		nombreAleatorio=  metodosUtiles.generarNombrealeatorio();
		emialaleatorio=metodosUtiles.generarEmialAleatorio();
		grupoNovedades.moduloCrearGruposNovedades(nombreAleatorio);
		grupoNovedades.moduloCrearCompania();
		grupoNovedades.moduloCrearConcepto();
		grupoNovedades.moduloCrearUsuarios();
		grupoNovedades.moduloVerificacion();

	}
	public void crearGrupoNovedadesConUsurio( ) throws InterruptedException {
		grupoNovedades.moduloCrearGruposNovedades(nombreAleatorio);
		grupoNovedades.moduloCrearCompania();
		grupoNovedades.moduloCrearConcepto();
		grupoNovedades.moduloCrearUsuariosExternos(emialaleatorio);
		grupoNovedades.moduloVerificacion();

	}





	






}
