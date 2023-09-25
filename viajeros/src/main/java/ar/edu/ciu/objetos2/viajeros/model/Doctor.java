package ar.edu.ciu.objetos2.viajeros.model;

import java.util.Arrays;
import java.util.Collection;

public final class Doctor extends Persona {

	// atributos
	private Pais paisResidencia;
	private Pais paisDoctorado;
	private Integer anioInicioDoctorado;
	private Integer anioFinDoctorado;

	// constructor
	public Doctor(String nombre, String apellido, Pais paisResidencia, Pais paisDoctorado, Integer anioInicioDoctorado, Integer anioFinDoctorado) {
		super(nombre, apellido);
		this.paisResidencia = paisResidencia;
		this.paisDoctorado = paisDoctorado;
		this.anioInicioDoctorado = anioInicioDoctorado;
		this.anioFinDoctorado = anioFinDoctorado;
	}

	// metodos
	@Override
	public Collection<Pais> enQuePaisesResidioEn(Integer anio) {
		if (this.anioInicioDoctorado.compareTo(anio)==0 || this.anioFinDoctorado.compareTo(anio)==0) {
			return Arrays.asList(this.paisResidencia, this.paisDoctorado);
		} else if (this.anioInicioDoctorado.compareTo(anio)>0 || this.anioFinDoctorado.compareTo(anio)<0) {
			return Arrays.asList(this.paisResidencia);
		} else {
			return Arrays.asList(this.paisDoctorado);
		}
	}

	// gets y sets
	public Pais getPaisResidencia() {
		return paisResidencia;
	}

	public void setPaisResidencia(Pais paisResidencia) {
		this.paisResidencia = paisResidencia;
	}

	public Pais getPaisDoctorado() {
		return paisDoctorado;
	}

	public void setPaisDoctorado(Pais paisDoctorado) {
		this.paisDoctorado = paisDoctorado;
	}

	public Integer getAnioInicioDoctorado() {
		return anioInicioDoctorado;
	}

	public void setAnioInicioDoctorado(Integer anioInicioDoctorado) {
		this.anioInicioDoctorado = anioInicioDoctorado;
	}

	public Integer getAnioFinDoctorado() {
		return anioFinDoctorado;
	}

	public void setAnioFinDoctorado(Integer anioFinDoctorado) {
		this.anioFinDoctorado = anioFinDoctorado;
	}

}
