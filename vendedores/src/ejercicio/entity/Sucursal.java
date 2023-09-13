package ejercicio.entity;

public class Sucursal {

	// atributos
	private Ciudad ciudad;
	
	// constructor
	public Sucursal(Ciudad ciudad) {
		this.ciudad = ciudad;
	}

	// metodos
	public Boolean estaEn(Ciudad ciudad) {
		return this.ciudad.equals(ciudad);
	}

	// gets
	public Ciudad getCiudad() {
		return ciudad;
	}
}
