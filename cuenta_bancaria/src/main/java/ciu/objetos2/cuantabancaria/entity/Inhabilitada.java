package ciu.objetos2.cuantabancaria.entity;

import ciu.objetos2.cuantabancaria.exception.CuentaException;

/*
 * Concrete 3 State
 * Singleton
 */
public class Inhabilitada implements CuentaState {

	private static final Double RETENCION_DEPOSITO = 0.03;

	private static final Inhabilitada instance = new Inhabilitada();

	private Inhabilitada() {
	}

	public static Inhabilitada getInstance() {
		return instance;
	}

	@Override
	public Double calcularMontoFinalAExtraer(Double monto) throws CuentaException {
		throw new CuentaException("Cuenta Inhabilitada.");
	}

	@Override
	public Double calcularMontoFinalADepositar(Double monto) {
		return monto - (monto * RETENCION_DEPOSITO);
	}
}
