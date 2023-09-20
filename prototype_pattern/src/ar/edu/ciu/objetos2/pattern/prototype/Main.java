package ar.edu.ciu.objetos2.pattern.prototype;

import ar.edu.ciu.objetos2.pattern.prototype.model.Circulo;

public class Main {

	public static void main(String[] args) {
		Circulo c1 = new Circulo(5, 6, "Azul", 10);
		Circulo c2 = new Circulo(5, 6, "Azul", 9);
		Circulo c3 = (Circulo)c1.clone();
		System.out.println("c1 igual a: c2: " + c1.equals(c2));
		System.out.println("c1 igual a: c3: " + c1.equals(c3));
	}

}
