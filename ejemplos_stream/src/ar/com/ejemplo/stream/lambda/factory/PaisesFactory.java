package ar.com.ejemplo.stream.lambda.factory;

import ar.com.ejemplo.stream.lambda.model.Pais;

/*
 * 
 * El objetivo es que retorne la misma instancia (objeto) de cada pais.
 *
 */
public class PaisesFactory {

	private static final Pais ARGENTINA = new Pais("Argentina");
	private static final Pais URUGUAY = new Pais("Uruguay");
	private static final Pais BOLIVIA = new Pais("Bolivia");
	private static final Pais PARAGUAY = new Pais("Paraguay");
	private static final Pais CHILE = new Pais("Chile");
	private static final Pais ECUADOR = new Pais("Ecuador");
	private static final Pais COLOMBIA = new Pais("Colombia");
	private static final Pais VENEZUELA = new Pais("Venezuela");

	public static Pais getArgentina() {
		return ARGENTINA;
	}
	
	public static Pais getUruguay() {
		return URUGUAY;
	}

	public static Pais getBolivia() {
		return BOLIVIA;
	}

	public static Pais getParaguay() {
		return PARAGUAY;
	}

	public static Pais getChile() {
		return CHILE;
	}

	public static Pais getEcuador() {
		return ECUADOR;
	}

	public static Pais getColombia() {
		return COLOMBIA;
	}

	public static Pais getVenezuela() {
		return VENEZUELA;
	}

}
