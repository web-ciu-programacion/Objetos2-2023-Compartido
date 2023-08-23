package ar.com.ejemplo.collection;

import java.util.Objects;

public class Estudiante extends Object {

	// atributos
	private String numeroDeLegajo;
	private String nombre;
	private String apellido;

	// constructor
	public Estudiante(String legajo, String nombre, String apellido) {
		super();
		this.numeroDeLegajo = legajo;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	// metodos
	@Override
	public String toString() {
		return this.numeroDeLegajo + " - " + this.apellido + ", " + this.nombre;
	}

	@Override
	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof Estudiante))
			return false;
		Estudiante other = (Estudiante) o;
		return this.numeroDeLegajo.equals(other.getNumeroDeLegajo());
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.numeroDeLegajo);
	}

	// gets y sets
	public String getNumeroDeLegajo() {
		return numeroDeLegajo;
	}

	public void setNumeroDeLegajo(String numeroDeLegajo) {
		this.numeroDeLegajo = numeroDeLegajo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

}
