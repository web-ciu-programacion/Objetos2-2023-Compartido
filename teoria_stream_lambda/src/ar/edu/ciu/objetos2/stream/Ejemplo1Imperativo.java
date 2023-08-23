package ar.edu.ciu.objetos2.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ejemplo1Imperativo {

	public static void main(String[] args) {
		Musico m1 = new Musico((long)1, "Ricardo Espinosa", 34, "Punk");
		Musico m2 = new Musico((long)2, "Ale Sergi", 45, "Pop");
		Musico m3 = new Musico((long)3, "Hernan Valente", 44, "Punk");
		Musico m4 = new Musico((long)4, "Patricia Sosa", 60, "Rock");
		Musico m5 = new Musico((long)5, "Ciro Pertussi", 46, "Punk");
		Musico m6 = new Musico((long)6, "Evariso Perez", 62, "Punk");
		Musico m7 = new Musico((long)7, "Pablo Lescano", 46, "Cumbia 'DeLaBuena'");
		List<Musico> musicos = new ArrayList<Musico>();
		musicos.add(m1);
		musicos.add(m2);
		musicos.add(m3);
		musicos.add(m4);
		musicos.add(m3);
		musicos.add(m5);
		musicos.add(m6);
		musicos.add(m7);

		System.out.println("Programacion imperativa");

		// filtro los Punks
		List<Musico> musicosPreFinal = new ArrayList<Musico>();
		for (Musico musico : musicos) {
			if (musico.getGenero().equals("Punk")) {
				musicosPreFinal.add(musico);
			}
		}

		// ordeno por nombre
		Collections.sort(musicosPreFinal, new Comparator<Musico>() {
			@Override
			public int compare(Musico m1, Musico m2) {
				return m1.getNombre().compareTo(m2.getNombre());
			}
		});
		
		// elimino duplicados
		Set<Musico> musicosFinal = new HashSet<Musico>(musicosPreFinal);
		
		// muestro por pantalla
		for (Musico musico : musicosFinal) {
			System.out.println(musico.getNombre());
		}

	}

}
