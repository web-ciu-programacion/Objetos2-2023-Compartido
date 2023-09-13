package ejercicio.entity;

public class ClienteHumanista extends Cliente {

	// constructores
	public ClienteHumanista(Ciudad ciudad) {
		super(ciudad);
	}

	// metodos
	@Override
	protected Boolean cumpleFisonomias(Vendedor vendedor) {
		return vendedor.esPersonaFisica();
	}

}
