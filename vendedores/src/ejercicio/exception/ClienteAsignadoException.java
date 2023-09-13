package ejercicio.exception;

public class ClienteAsignadoException extends Exception {

	private static final long serialVersionUID = 1L;

	public ClienteAsignadoException(String mensaje) {
		super(mensaje);
	}
}
