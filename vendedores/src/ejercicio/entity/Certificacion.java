package ejercicio.entity;

public class Certificacion {

	// atributos
	private Integer puntosOtorgados;
	private Boolean producto;
	
	public Certificacion(Integer puntos, Boolean producto) {
		this.puntosOtorgados = puntos;
		this.producto = producto;
	}
	
	// gets y sets
	public Integer getPuntosOtorgados() {
		return puntosOtorgados;
	}
	
	public void setPuntosOtorgados(Integer puntosOtorgados) {
		this.puntosOtorgados = puntosOtorgados;
	}
	
	public Boolean getProducto() {
		return producto;
	}
	
	public void setProducto(Boolean producto) {
		this.producto = producto;
	}
}
