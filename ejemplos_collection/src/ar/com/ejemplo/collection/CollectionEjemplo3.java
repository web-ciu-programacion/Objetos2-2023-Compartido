package ar.com.ejemplo.collection;

import java.util.HashSet;
import java.util.Set;

/*
 * En este ejemplo se muestra como trabaja Set (equlas y hashCode).
 */
public class CollectionEjemplo3 {

	public static void main(String[] args) {
		Estudiante pepe = new Estudiante("1098494", "Jose", "Sand");
		Estudiante trucho = new Estudiante("1021454", "Ruben", "Moraglio");
		Estudiante lily = new Estudiante("1098546", "Liliana", "Rodriguez");
		Estudiante lau = new Estudiante("1098707", "Laura", "Taccio");

		Set<Estudiante> s1 = new HashSet<>();
		s1.add(pepe);
		s1.add(trucho);
		s1.add(lily);
		s1.add(lau);
		s1.add(pepe); // duplicado
		s1.forEach( e -> System.out.println(e));


		System.out.println("====================");
		Estudiante lauBis = new Estudiante("1098707", "Laura", "Taccio");
		s1.add(lauBis);
		s1.forEach( e -> System.out.println(e));

		// ¿por qué aparece lauBis, si es la misma persona?
		//    Respuesta: Es otra instancia de la clase Persona, otro objeto(pelotita), y
		//    el equals no está definido en persona, entonces ejecuta el de Object por herencia.
		//    Ver el código del equals de la clase Object.

		// Descomentar equals y hascode de Estudiante y nuevamente mostrar.

	}

}
