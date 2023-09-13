package ejercicio.entity;

public abstract class Cliente {

	// atributos
	protected Ciudad ciudad;

	// constructor
	public Cliente(Ciudad ciudad) {
		this.ciudad = ciudad;
	}

	// metodos abstractos
	protected abstract Boolean cumpleFisonomias(Vendedor vendedor);

	// metodos
	public Boolean puedeSerAtendidoPor(Vendedor vendedor) {
		return this.residenciaCompatible(vendedor) && 
				this.cumpleFisonomias(vendedor);
	}
	
	private Boolean residenciaCompatible(Vendedor vendedor) {
		return vendedor.puedeTrabajarEn(this.ciudad);
	}
}
