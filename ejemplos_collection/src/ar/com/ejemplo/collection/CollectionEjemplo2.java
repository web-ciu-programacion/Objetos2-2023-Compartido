package ar.com.ejemplo.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/*
 * En este ejemplo utilizando Generics tipamos la Collection.
 */
public class CollectionEjemplo2 {

	public static void main(String[] args) {
		Collection<Estudiante> c1 = new ArrayList<>();
		c1.add(new Estudiante("1098494", "Pablo", "Picaro"));
		c1.add(new Estudiante("1098546", "Maria", "Rodriguez"));
		c1.add(new Estudiante("1098707", "Tobias", "Mendez"));
		for (Object object : c1) {
			System.out.println(object);
		}
		// ¿por qué no puedo acceder al método get(index) de la interface List, si es un ArrayList? 
		//     Respuesta: Porqué está definido como Collection, entonces veo los métodos de Collection.

		// casteo
		List<Estudiante> l1 = (List<Estudiante>)c1;
		Estudiante e1 = l1.get(0);
		System.out.println(e1);
		
		// o bien al inicio como sabia que iba a utilizar el get(index) lo definía:
		List<Estudiante> c2 = new ArrayList<>();
		System.out.println(c2);
	}

}
