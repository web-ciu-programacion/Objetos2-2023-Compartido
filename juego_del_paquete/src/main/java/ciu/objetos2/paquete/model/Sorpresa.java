package ciu.objetos2.paquete.model;

public class Sorpresa implements Componente {

	private Double costo;
	private SorpresaState estado;

	public Sorpresa(Double costo, SorpresaState estado) {
		this.costo = costo;
		this.estado = estado;
	}

	private Sorpresa(Sorpresa sorpresa) {
		this.costo = sorpresa.costo;
		this.estado = sorpresa.estado;
	}

	@Override
	public Integer cantidadDeSorpresas() {
		return Integer.valueOf(1);
	}
	
	@Override
	public Double costoTotal() {
		return this.estado.costo(this);
	}

	@Override
	public Prototype clone() {
		return new Sorpresa(this);
	}

	public Double getCosto() {
		return costo;
	}
}