package ciu.objetos2.cuantabancaria.entity;

import ciu.objetos2.cuantabancaria.exception.CuentaException;

public class CajaDeAhorro extends Cuenta {

	public CajaDeAhorro(Cliente cliente) {
		super(cliente);
	}

	private Double limiteDisponibleEnTarjetaDeCredito;
	
	@Override
	protected void extraerEnCuenta(Double monto) throws CuentaException {
		if (this.saldo-monto>=0) {
			this.saldo-=monto;
		} else {
			throw new CuentaException("Saldo insuficiente.");
		}
	}
	
	public void calcularLimiteDisponibleEnTarjetaDeCredito() {
		this.limiteDisponibleEnTarjetaDeCredito = this.cliente.getIngresoMensual() * 3;
	}
	
	public Double getLimiteDisponibleEnTarjetaDeCredito() {
		return this.limiteDisponibleEnTarjetaDeCredito;
	}
}
