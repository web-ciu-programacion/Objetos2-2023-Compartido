package ar.com.ejemplo.stream.lambda.model;

import ar.com.ejemplo.stream.lambda.factory.PaisesFactory;

public class Estudiante extends Persona {

	// atributos
	private String numeroDeLegajo;

	// constructor
	public Estudiante(String legajo, String nombre, String apellido, Sexo sexo, Pais paisNatal) {
		super(nombre, apellido, sexo, paisNatal);
		this.numeroDeLegajo = legajo;
	}

	// metodos
	public Boolean isArgentino() {
		return this.paisNatal.equals(PaisesFactory.getArgentina());
	}

	public Boolean isExtranjero() {
		return !this.isArgentino();
	}

	public Boolean tieneLegajo() {
		return this.numeroDeLegajo!=null && !this.numeroDeLegajo.isBlank();
	}

	@Override
	public String toString() {
		return this.apellido + ", " + this.nombre + " - " + this.numeroDeLegajo + " - " + this.paisNatal.getNombre();
	}

	// gets
	public String getNumeroDeLegajo() {
		return numeroDeLegajo;
	}

}
