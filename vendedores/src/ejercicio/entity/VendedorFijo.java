package ejercicio.entity;

public class VendedorFijo extends Vendedor {

	// atributos
	private Ciudad ciudadResidencia;

	// constructores
	public VendedorFijo() {
	}

	public VendedorFijo(Ciudad ciudad) {
		this.ciudadResidencia = ciudad;
	}

	// metodos
	@Override
	public Boolean puedeTrabajarEn(Ciudad ciudad) {
		return this.ciudadResidencia.equals(ciudad);
	}
}
