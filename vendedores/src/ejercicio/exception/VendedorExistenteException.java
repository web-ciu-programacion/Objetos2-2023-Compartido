package ejercicio.exception;

public class VendedorExistenteException extends Exception {

	private static final long serialVersionUID = 1L;

	public VendedorExistenteException(String mensaje) {
		super(mensaje);
	}
}
