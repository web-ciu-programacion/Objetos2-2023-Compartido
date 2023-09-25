package ar.edu.ciu.objetos2.pattern.strategy.model;

/*
 * Concrete Strategy
 */
public class Adicion implements Strategy {

	@Override
	public int producto(int numero1, int numero2) {
		int resultado = 0;
		for (int i = 0; i < numero2; i++) {
			resultado += numero1;
		}
		return resultado;
	}
}
