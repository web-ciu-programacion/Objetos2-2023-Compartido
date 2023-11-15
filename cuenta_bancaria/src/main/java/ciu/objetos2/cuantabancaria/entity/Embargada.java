package ciu.objetos2.cuantabancaria.entity;

/*
 * Concrete 2 State
 * Singleton
 */
public class Embargada implements CuentaState {

	private static final Double RETENCION_EXTRACCION = 1.02;
	private static final Double RETENCION_DEPOSITO = 0.3;

	private static final Embargada instance = new Embargada();

	private Embargada() {
	}

	public static Embargada getInstance() {
		return instance;
	}

	@Override
	public Double calcularMontoFinalAExtraer(Double monto) {
		return monto * RETENCION_EXTRACCION;
	}

	@Override
	public Double calcularMontoFinalADepositar(Double monto) {
		return monto - (monto * RETENCION_DEPOSITO);
	}
}