package ar.edu.ciu.objetos2.viajeros.model;

import java.util.Arrays;
import java.util.Collection;

public final class Establecido extends Persona {

	// atributos
	private Pais paisResidencia;

	// constructor
	public Establecido(String nombre, String apellido, Pais paisResidencia) {
		super(nombre, apellido);
		this.paisResidencia = paisResidencia;
	}

	// metodos
	@Override
	public Collection<Pais> enQuePaisesResidioEn(Integer anio) {
		return Arrays.asList(this.paisResidencia);
	}

	// gets y sets
	public Pais getPaisResidencia() {
		return paisResidencia;
	}

	public void setPaisResidencia(Pais paisResidencia) {
		this.paisResidencia = paisResidencia;
	}

}
