package ciu.pattern.builder;

import ciu.pattern.builder.model.Auto;
import ciu.pattern.builder.model.MotorDeportivo;

public class AutoDeportivoBuilder implements Builder {

	private Auto auto;
	
	public AutoDeportivoBuilder() {
		this.reset();
	}

	@Override
	public void reset() {
		this.auto = new Auto();
	}

	@Override
	public void buildPuertas() {
		this.auto.setPuertas(2);
	}

	@Override
	public void buildMotor() {
		this.auto.setMotor(new MotorDeportivo());
	}

	@Override
	public void buildComputadoraDeNavegacion() {
		this.auto.setComputadoraDeNavegacion(true);
	}

	@Override
	public void buildGPS() {
		this.auto.setGps(false);
	}

	@Override
	public void buildRuedaDeAuxilio() {
	}

	@Override
	public Auto build() {
		return this.auto;
	}
}
