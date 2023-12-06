package ar.edu.ciu.objetos2.plumasverdes;

public class Chofer {

	private String tipoDeDocumento;
	private Integer numeroDeDocumento;
	private String nombreYApellido;
	
	public Chofer(String tipoDeDocumento, Integer numeroDeDocumento, String nombreYApellido) {
		this.tipoDeDocumento = tipoDeDocumento;
		this.numeroDeDocumento = numeroDeDocumento;
		this.nombreYApellido = nombreYApellido;
	}
	
	public String getDumento() {
		return this.tipoDeDocumento + ": " + this.numeroDeDocumento;
	}
	
	public String getNombreYApellido() {
		return this.nombreYApellido;
	}
}
