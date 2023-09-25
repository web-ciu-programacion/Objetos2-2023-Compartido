package ar.edu.ciu.objetos2.viajeros.model;

public final class Viaje {

	// atributos
	private Pais paisDestino;
	private Integer anio;

	// constructor
	public Viaje(Pais paisDestino, Integer anio) {
		super();
		this.paisDestino = paisDestino;
		this.anio = anio;
	}

	// gets y sets
	public Pais getPaisDestino() {
		return paisDestino;
	}
	public void setPaisDestino(Pais paisDestino) {
		this.paisDestino = paisDestino;
	}
	public Integer getAnio() {
		return anio;
	}
	public void setAnio(Integer anio) {
		this.anio = anio;
	}

}
