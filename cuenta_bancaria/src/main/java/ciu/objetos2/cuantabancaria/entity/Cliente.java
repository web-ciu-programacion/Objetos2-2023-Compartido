package ciu.objetos2.cuantabancaria.entity;

public class Cliente {

	private String nombre;
	private String apellido;
	private String cuil;
	private Double ingresoMensual;

	public Cliente(String nombre, String apellido, String cuil, Double ingresoMensual) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.cuil = cuil;
		this.ingresoMensual = ingresoMensual;
	}

	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public String getCuil() {
		return cuil;
	}
	
	public void setCuil(String cuil) {
		this.cuil = cuil;
	}
	
	public Double getIngresoMensual() {
		return ingresoMensual;
	}
	
	public void setIngresoMensual(Double ingresoMensual) {
		this.ingresoMensual = ingresoMensual;
	}
}