package ar.com.ejemplo.stream.lambda;

import java.util.Collection;
import java.util.Optional;
import java.util.stream.Collectors;

import ar.com.ejemplo.stream.lambda.factory.SexoFactory;
import ar.com.ejemplo.stream.lambda.model.Estudiante;
import ar.com.ejemplo.stream.lambda.model.Pais;
import ar.com.ejemplo.stream.lambda.model.Universidad;

public class MainStreamLambda1 {

	public static void main(String[] args) {
		Universidad unq = new Universidad();
		
		// Obtengo estudiantes argentinos
		System.out.println("====================================================================================================");
		System.out.println("Estudiantes Argentinos:");
		Collection<Estudiante> estudiantesArgentinos = unq.getEstudiantes().stream()
																				//.filter( e -> e.isArgentino()) // una forma
																				.filter(Estudiante::isArgentino) // otra forma
																				.collect(Collectors.toList());
		estudiantesArgentinos.forEach( e -> System.out.println("    " + e.toString()));
		
		// Obtengo los paises de los cuales hay estudiantes
		System.out.println("====================================================================================================");
		System.out.println("Todos los paises:");
		Collection<Pais> paises = unq.getEstudiantes().stream()
															.map(Estudiante::getPaisNatal)
															.collect(Collectors.toList());
		paises.forEach( p -> System.out.println(p.getNombre()));

		// Obtengo los paises sin repeticion
		System.out.println("====================================================================================================");
		System.out.println("Todos los paises sin repeticion:");
		Collection<Pais> paisesSinRepeticion = unq.getEstudiantes().stream()
																		.map(Estudiante::getPaisNatal)
																		.distinct()
																		.collect(Collectors.toList());
		paisesSinRepeticion.forEach( p -> System.out.println(p.getNombre()));

		// Obtener cualquier estudiante
		System.out.println("====================================================================================================");
		System.out.println("Estudiante al azar:");
		Optional<Estudiante> cualquiera = unq.getEstudiantes().stream()
																	.findAny();
		if (cualquiera.isPresent()) {
			System.out.println(cualquiera.get().toString());
		}

		// Todos tienen legajo?
		System.out.println("====================================================================================================");
		System.out.println("Todes tienen legajo?:");
		Boolean tienenLegajo = unq.getEstudiantes().stream()
														.allMatch(Estudiante::tieneLegajo);
		System.out.println(tienenLegajo);

		// Hay estudiantes de sexo no masculino y no femenina
		System.out.println("====================================================================================================");
		System.out.println("Hay estudiantes de sexo no masculino y no femenina?:");
		Boolean otre = unq.getEstudiantes().stream()
														.anyMatch(e -> e.getSexo().equals(SexoFactory.getOtre()));
		System.out.println(otre);

		// Hay al menos un estudiante masculino y al menos una estudiante femenina
		System.out.println("====================================================================================================");
		System.out.println("Hay al? menos un estudiante masculino y al menos una estudiante femenina?:");
		Boolean femenina = unq.getEstudiantes().stream()
														.anyMatch(e -> e.getSexo().equals(SexoFactory.getFemenina()));
		Boolean masculino = unq.getEstudiantes().stream()
														.anyMatch(e -> e.getSexo().equals(SexoFactory.getMasculino()));
		System.out.println(femenina && masculino);

	}

}
