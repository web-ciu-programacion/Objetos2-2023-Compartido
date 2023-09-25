package ar.edu.ciu.objetos2.viajeros.model;

import java.util.Collection;

public final class Menor extends Persona {

	// atributos
	private Persona madre;

	// constructor
	public Menor(String nombre, String apellido, Persona madre) {
		super(nombre, apellido);
		this.madre = madre;
	}

	// metodos
	@Override
	public Collection<Pais> enQuePaisesResidioEn(Integer anio) {
		return this.madre.enQuePaisesResidioEn(anio);
	}

	// gets y sets
	public Persona getMadre() {
		return madre;
	}

	public void setMadre(Persona madre) {
		this.madre = madre;
	}

}
