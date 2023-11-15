package ciu.objetos2.cuantabancaria.entity;

import ciu.objetos2.cuantabancaria.exception.CuentaException;

public class CuentaCorriente extends Cuenta {

	private Double limiteDisponible;

	public CuentaCorriente(Cliente cliente) {
		super(cliente);
	}

	@Override
	protected void extraerEnCuenta(Double monto) throws CuentaException {
		if (this.saldo-monto>=this.limiteDisponible) {
			this.saldo -= monto;
		} else {
			throw new CuentaException("Saldo Insuficiente.");
		}
	}

	public void calcularLimiteDisponible() {
		this.limiteDisponible = (this.cliente.getIngresoMensual() * 2) * -1;
	}

}
