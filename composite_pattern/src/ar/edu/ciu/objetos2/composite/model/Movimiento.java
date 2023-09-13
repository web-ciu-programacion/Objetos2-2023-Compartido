package ar.edu.ciu.objetos2.composite.model;

public class Movimiento {

	private Signo signo;
	private Double monto;

	public Movimiento(Signo signo, Double monto) {
		super();
		this.signo = signo;
		this.monto = monto;
	}

	public Double getImporte() {
		return this.monto.doubleValue() * this.signo.getOperador().doubleValue();
	}

	public boolean esNegativo() {
		return this.signo.esNegativo();
	}
}
