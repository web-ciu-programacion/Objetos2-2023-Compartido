package ejercicio.main;

import ejercicio.entity.Criminal;
import ejercicio.entity.Integrante;

public class Main {

	public static void main(String[] args) {
		Integrante pepe = new Criminal("tony", 10);
		pepe.imprimirNombre();
	}

}
