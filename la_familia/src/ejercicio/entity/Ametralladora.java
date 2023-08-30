package ejercicio.entity;

public class Ametralladora extends Arma {

	private static final Integer PUNTOS_DE_HONOR = Integer.valueOf(5);

	public Ametralladora(Integer potenciaDestructiva) {
		super(PUNTOS_DE_HONOR, potenciaDestructiva);
	}

}
