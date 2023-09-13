package ar.edu.ciu.objetos2.composite.model;

public enum Signo {

	POSITIVO((short)1, "Positivo"),
	NEGATIVO((short)-1, "Negativo");

	Signo(Short operador, String descricpion) {
		this.operador = operador;
		this.descripcion = descricpion;
	}

	private Short operador;
	private String descripcion;

	public Short getOperador() {
		return operador;
	}

	public String getDescripcion() {
		return descripcion;
	}
	
	public boolean esPositivo() {
		return this.operador.shortValue()==1;
	}

	public boolean esNegativo() {
		return !this.esPositivo();
	}

}
