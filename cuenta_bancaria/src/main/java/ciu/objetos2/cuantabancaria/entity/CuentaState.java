package ciu.objetos2.cuantabancaria.entity;

import ciu.objetos2.cuantabancaria.exception.CuentaException;

/*
 * Pattern State
 * 
 * El monto a extraer depende del estado de la Cuenta.
 * El monto a depositar depende del estado de la Cuenta.
 */
public interface CuentaState {

	public Double calcularMontoFinalAExtraer(Double monto) throws CuentaException;
	
	public Double calcularMontoFinalADepositar(Double monto);
}
