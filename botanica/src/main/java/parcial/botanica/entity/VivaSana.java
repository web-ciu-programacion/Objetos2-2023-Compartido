package parcial.botanica.entity;

// Singleton
public class VivaSana extends State {

	private static State instance;

	protected VivaSana() {
	}

	public static State getInstance() {
		if (instance==null) {
			instance = new VivaSana();
		}
		return instance;
	}

	@Override
	public Double cantidadDeClorofila(Hoja hoja) {
		return super.cantidadDeClorofilaEstandard(hoja);
	}
}