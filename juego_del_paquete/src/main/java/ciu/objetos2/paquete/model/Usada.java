package ciu.objetos2.paquete.model;

/*
 * Singleton
 */
public class Usada implements SorpresaState {

	private static SorpresaState instance;

	private Usada() {}
	
	public static SorpresaState getInstance() {
		if (instance==null) {
			instance = new Usada();
		}
		return instance;
	}

	@Override
	public Double costo(Sorpresa sorpresa) {
		return sorpresa.getCosto() * 0.6;
	}
}