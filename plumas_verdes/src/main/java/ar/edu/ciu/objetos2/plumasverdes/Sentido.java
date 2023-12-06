package ar.edu.ciu.objetos2.plumasverdes;

public abstract class Sentido {

	protected String descripcion;
	
	public Sentido(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public String getDescripcion() {
		return this.descripcion;
	}
}
