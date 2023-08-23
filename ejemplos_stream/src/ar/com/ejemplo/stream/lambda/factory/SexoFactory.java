package ar.com.ejemplo.stream.lambda.factory;

import ar.com.ejemplo.stream.lambda.model.Sexo;

public class SexoFactory {

	private static final Sexo FEMENINA = new Sexo("Femenina");
	private static final Sexo MASCULINO = new Sexo("Masculino");
	private static final Sexo OTRE = new Sexo("Otre");

	public static Sexo getFemenina() {
		return FEMENINA;
	}

	public static Sexo getMasculino() {
		return MASCULINO;
	}

	public static Sexo getOtre() {
		return OTRE;
	}

}
