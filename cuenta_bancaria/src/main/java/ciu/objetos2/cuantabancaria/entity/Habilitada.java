package ciu.objetos2.cuantabancaria.entity;

/*
 * Concrete1 State
 * Singleton
 */
public class Habilitada implements CuentaState {

	private static final Habilitada instance = new Habilitada();

	private Habilitada() {
	}

	public static Habilitada getInstance() {
		return instance;
	}

	@Override
	public Double calcularMontoFinalAExtraer(Double monto) {
		return monto;
	}

	@Override
	public Double calcularMontoFinalADepositar(Double monto) {
		return monto;
	}
}
