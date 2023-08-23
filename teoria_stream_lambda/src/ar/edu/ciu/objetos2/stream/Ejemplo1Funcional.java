package ar.edu.ciu.objetos2.stream;

import java.util.ArrayList;
import java.util.List;

public class Ejemplo1Funcional {

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

		System.out.println("Programacion funcional");

		// Stream ejemplo 1
		musicos.stream()
        	.filter(x -> x.getGenero().equals("Punk"))
        	//.filter(x -> x.getEdad()>40 )
        	.sorted((x,y) -> x.getNombre().compareToIgnoreCase(y.getNombre()))
        	.distinct()
        	.forEach(m -> System.out.println(m.getNombre()));
	}

}
