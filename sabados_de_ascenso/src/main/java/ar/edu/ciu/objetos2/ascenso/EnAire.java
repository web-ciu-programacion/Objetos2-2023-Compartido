package ar.edu.ciu.objetos2.ascenso;

public class EnAire implements EstadoEmisora {

	private EnAire() {}
	
	private static EstadoEmisora instance;
	
	public static EstadoEmisora getInstance() {
		if (instance==null) {
			instance = new EnAire();
		}
		return instance;
	}
	
	@Override
	public void notificar(Emisora emisora, Evento evento) {
		System.out.println("Emisora: " + emisora.getDescripcion() + ": " + evento.toString());
	}
}
