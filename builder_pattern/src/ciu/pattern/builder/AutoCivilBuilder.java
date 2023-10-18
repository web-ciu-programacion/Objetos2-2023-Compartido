package ciu.pattern.builder;

import ciu.pattern.builder.model.Auto;
import ciu.pattern.builder.model.MotorUsoCivil;

public class AutoCivilBuilder implements Builder {

	private Auto auto;
	
	public AutoCivilBuilder() {
		this.reset();
	}

	@Override
	public void reset() {
		this.auto = new Auto();
	}

	@Override
	public void buildPuertas() {
		this.auto.setPuertas(4);
	}

	@Override
	public void buildMotor() {
		this.auto.setMotor(new MotorUsoCivil());
	}

	@Override
	public void buildComputadoraDeNavegacion() {
		this.auto.setComputadoraDeNavegacion(true);
	}

	@Override
	public void buildGPS() {
		this.auto.setGps(true);
	}

	@Override
	public void buildRuedaDeAuxilio() {
		this.auto.setRuedaDeAuxilio(true);
	}

	@Override
	public Auto build() {
		return this.auto;
	}
}
