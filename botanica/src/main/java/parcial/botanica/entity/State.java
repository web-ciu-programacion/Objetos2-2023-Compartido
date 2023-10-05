package parcial.botanica.entity;

public abstract class State {

	public abstract Double cantidadDeClorofila(Hoja hoja);

	protected Double cantidadDeClorofilaEstandard(Hoja hoja) {
		return Math.round((hoja.getSuperficie() * hoja.getClorofilaEstimada()) * 100.0) / 100.0;
	}
}