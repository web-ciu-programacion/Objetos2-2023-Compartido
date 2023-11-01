package ciu.objetos2.paquete.model;

public class Baqueteada implements SorpresaState {

	@Override
	public Double costo(Sorpresa sorpresa) {
		return Double.valueOf(0);
	}
}