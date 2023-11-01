package ciu.objetos2.paquete.model;

/*
 * Singleton
 */
public class Nueva implements SorpresaState {

	private static SorpresaState instance;

	private Nueva() {}
	
	public static SorpresaState getInstance() {
		if (instance==null) {
			instance = new Nueva();
		}
		return instance;
	}
	
	@Override
	public Double costo(Sorpresa sorpresa) {
		return sorpresa.getCosto();
	}
}