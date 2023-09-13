package ejercicio.entity;

import java.util.ArrayList;
import java.util.Collection;

import ejercicio.exception.ClienteAsignadoException;

public abstract class Vendedor {

	// constantes
	private static final Integer MINIMO_CERTIFICACIONES = Integer.valueOf(3);
	private static final Integer MINIMO_FIRME = Integer.valueOf(30);

	// atributos
	protected Collection<Certificacion> certificaciones;
	protected Collection<Cliente> clientesAsignados;

	// constructores
	public Vendedor() {
		this.certificaciones = new ArrayList<Certificacion>();
		this.clientesAsignados = new ArrayList<Cliente>();
	}

	// metodos abstractos
	public abstract Boolean puedeTrabajarEn(Ciudad ciudad);

	// metodos
	public void agregar(Certificacion certificacion) {
		this.certificaciones.add(certificacion);
	}

	public Boolean esVersatil() {
		return this.cantidadDeCertificaciones()>=MINIMO_CERTIFICACIONES && 
				this.tieneCertificacionProducto() && 
				this.tieneCertificacionNoProducto();
	}

	public Boolean esFirme() {
		return this.totalPuntosCertificaciones()>=MINIMO_FIRME;
	}
	
	public Integer totalPuntosCertificaciones() {
		return this.certificaciones.stream()
										.mapToInt(Certificacion::getPuntosOtorgados)
										.sum();
	}

	public Integer cantidadDeCertificaciones() {
		return this.certificaciones.size();
	}
	
	private Boolean tieneCertificacionProducto() {
		return this.certificaciones.stream()
										.anyMatch(Certificacion::getProducto);
	}

	private Boolean tieneCertificacionNoProducto() {
		return this.certificaciones.stream()
										.anyMatch(c -> !c.getProducto());
	}
	
	public Boolean esPersonaFisica() {
		return Boolean.TRUE;
	}
	
	public void agregar(Cliente cliente) throws ClienteAsignadoException {
		if (cliente.puedeSerAtendidoPor(this)) {
			this.clientesAsignados.add(cliente);
		}
		throw new ClienteAsignadoException("El vendedor no cumple con las exigencias del cliente.");
	}
}
