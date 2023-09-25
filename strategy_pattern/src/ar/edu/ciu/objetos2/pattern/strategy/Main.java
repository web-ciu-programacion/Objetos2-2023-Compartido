package ar.edu.ciu.objetos2.pattern.strategy;

import ar.edu.ciu.objetos2.pattern.strategy.model.Adicion;
import ar.edu.ciu.objetos2.pattern.strategy.model.Binario;
import ar.edu.ciu.objetos2.pattern.strategy.model.Producto;
import ar.edu.ciu.objetos2.pattern.strategy.model.Multiplicador;

public class Main {

	public static void main(String[] args) {
		Multiplicador sumador = new Multiplicador();
		sumador.setStrategy(new Binario());
		int resultado = sumador.executeStrategy(5, 11);
		System.out.println("El resultado es: " + resultado);
		sumador.setStrategy(new Adicion());
		resultado = sumador.executeStrategy(5, 11);
		System.out.println("El resultado es: " + resultado);
		sumador.setStrategy(new Producto());
		resultado = sumador.executeStrategy(5, 11);
		System.out.println("El resultado es: " + resultado);
	}
}