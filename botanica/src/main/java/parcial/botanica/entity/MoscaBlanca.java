package parcial.botanica.entity;

public class MoscaBlanca extends Plaga {

	private static final Double SUPERFICIE_MINIMA = 0.02; // m2

	@Override
	public Double colorofilaConsumida(Hoja hoja) {
		Double clorofilaConsumida = 0.25d;
		if (hoja.getSuperficie()<=SUPERFICIE_MINIMA) {
			clorofilaConsumida = 0d;
		}
		return clorofilaConsumida;
	}

}
