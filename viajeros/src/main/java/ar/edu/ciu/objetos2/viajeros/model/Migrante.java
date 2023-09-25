package ar.edu.ciu.objetos2.viajeros.model;

import java.util.Arrays;
import java.util.Collection;

public final class Migrante extends Persona {

	// atributos
	private Pais paisNatal;
	private Pais paisMigrante;
	private Integer anioMigracion;

	// constructor
	public Migrante(String nombre, String apellido, Pais paisNatal, Pais paisMigrante, Integer anioMigracion) {
		super(nombre, apellido);
		this.paisNatal = paisNatal;
		this.paisMigrante = paisMigrante;
		this.anioMigracion = anioMigracion;
	}

	// metodos
	@Override
	public Collection<Pais> enQuePaisesResidioEn(Integer anio) {
		if (this.anioMigracion.compareTo(anio)==0) {
			return Arrays.asList(paisNatal, paisMigrante);
		} else if (this.anioMigracion.compareTo(anio)>0) {
			return Arrays.asList(paisNatal);
		} else {
			return Arrays.asList(paisMigrante);
		}
	}

	// gets y sets
	public Pais getPaisNatal() {
		return paisNatal;
	}

	public void setPaisNatal(Pais paisNatal) {
		this.paisNatal = paisNatal;
	}

	public Pais getPaisMigrante() {
		return paisMigrante;
	}

	public void setPaisMigrante(Pais paisMigrante) {
		this.paisMigrante = paisMigrante;
	}

	public Integer getAnioMigracion() {
		return anioMigracion;
	}

	public void setAnioMigracion(Integer anioMigracion) {
		this.anioMigracion = anioMigracion;
	}

}
