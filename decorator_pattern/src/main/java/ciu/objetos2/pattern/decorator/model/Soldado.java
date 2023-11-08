package ciu.objetos2.pattern.decorator.model;

/*
 *  Client
 */
public class Soldado {

	public Integer atacar(Enemigo enemigo) {
		return enemigo.danioGenerado();
	}
}