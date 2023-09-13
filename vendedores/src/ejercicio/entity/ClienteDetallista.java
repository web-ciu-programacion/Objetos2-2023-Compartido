package ejercicio.entity;

public class ClienteDetallista extends Cliente {

	// constructores
	public ClienteDetallista(Ciudad ciudad) {
		super(ciudad);
	}

	// metodos
	@Override
	protected Boolean cumpleFisonomias(Vendedor vendedor) {
		return vendedor.cantidadDeCertificaciones()>=3;
	}

}
