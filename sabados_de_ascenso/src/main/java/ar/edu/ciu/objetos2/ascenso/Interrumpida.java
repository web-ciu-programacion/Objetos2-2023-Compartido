package ar.edu.ciu.objetos2.ascenso;

public class Interrumpida implements EstadoEmisora {

	private Interrumpida() {}
	
	private static EstadoEmisora instance;
	
	public static EstadoEmisora getInstance() {
		if (instance==null) {
			instance = new Interrumpida();
		}
		return instance;
	}

	@Override
	public void notificar(Emisora emisora, Evento evento) {
		System.out.println("Emisora: " + emisora.getDescripcion() + ": interrumpida.");
	}
}