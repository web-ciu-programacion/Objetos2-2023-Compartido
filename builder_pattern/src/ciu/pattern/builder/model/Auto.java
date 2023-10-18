package ciu.pattern.builder.model;

public class Auto {

	// atributos
	private Motor motor;
	private int puertas;
	private boolean computadoraDeNavegacion;
	private boolean gps;
	private boolean ruedaDeAuxilio;
	
	// constructor
	public Auto() {
		this.ruedaDeAuxilio = false;
	}

	@Override
	public String toString() {
		return "Auto -> puerats: " + this.puertas + " motor: " + this.motor.getClass().getName() + " computadoraDeNavegacion: " + 
				this.computadoraDeNavegacion + " gps: " + this.gps + " ruedaDeAuxilio: " + this.ruedaDeAuxilio;
	}

	// gets y sets
	public Motor getMotor() {
		return motor;
	}
	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	public int getPuertas() {
		return puertas;
	}
	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}
	public boolean isComputadoraDeNavegacion() {
		return computadoraDeNavegacion;
	}
	public void setComputadoraDeNavegacion(boolean computadoraDeNavegacion) {
		this.computadoraDeNavegacion = computadoraDeNavegacion;
	}
	public boolean isGps() {
		return gps;
	}
	public void setGps(boolean gps) {
		this.gps = gps;
	}
	public boolean isRuedaDeAuxilio() {
		return ruedaDeAuxilio;
	}
	public void setRuedaDeAuxilio(boolean ruedaDeAuxilio) {
		this.ruedaDeAuxilio = ruedaDeAuxilio;
	}
}
