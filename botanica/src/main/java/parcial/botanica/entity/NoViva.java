package parcial.botanica.entity;

// Singleton
public class NoViva extends State {

	private static final Double SUPERFICIE_MINIMA = 0.05; // m2

	private static State instance;

	private NoViva() {
	}
	
	public static State getInstance() {
		if (instance==null) {
			instance = new NoViva();
		}
		return instance;
	}

	@Override
	public Double cantidadDeClorofila(Hoja hoja) {
		Double clorofila = Double.valueOf(0);
		if (hoja.getSuperficie()>=SUPERFICIE_MINIMA) {
			clorofila = (super.cantidadDeClorofilaEstandard(hoja) * Double.valueOf(10))/100;
		}
		return clorofila;
	}
}
