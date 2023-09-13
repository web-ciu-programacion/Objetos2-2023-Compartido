package ejercicio.entity;

public class ClienteInseguro extends Cliente {

	// constructores
	public ClienteInseguro(Ciudad ciudad) {
		super(ciudad);
	}

	// metodos
	@Override
	protected Boolean cumpleFisonomias(Vendedor vendedor) {
		return vendedor.esVersatil() && vendedor.esFirme();
	}

}
