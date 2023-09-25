package ar.edu.ciu.objetos2.viajeros.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import ar.edu.ciu.objetos2.viajeros.model.Doctor;
import ar.edu.ciu.objetos2.viajeros.model.Establecido;
import ar.edu.ciu.objetos2.viajeros.model.Menor;
import ar.edu.ciu.objetos2.viajeros.model.Migrante;
import ar.edu.ciu.objetos2.viajeros.model.Pais;
import ar.edu.ciu.objetos2.viajeros.model.Persona;

public class Tests {

    @DisplayName("Test MessageService.get()")
    @Test
	public void testItem1() {
		Pais argentina = new Pais("Argentina");
		Pais uruguay = new Pais("Uruguay");
		Pais brasil = new Pais("Brasil");
		Pais bolivia = new Pais("Bolivia");
		Pais paraguay = new Pais("Paraguay");
		Pais ecuador = new Pais("Ecuador");
		
		// residencias
		Persona tordo = new Doctor("Samuel", "Buu", uruguay, argentina, 2010, 2014);
		assertEquals(Arrays.asList(uruguay, argentina), tordo.enQuePaisesResidioEn(2010));
		assertEquals(Arrays.asList(argentina), tordo.enQuePaisesResidioEn(2011));
		assertEquals(Arrays.asList(uruguay), tordo.enQuePaisesResidioEn(2015));
		
		Persona pachorra = new Establecido("Maria", "Sedentaria", paraguay);
		assertEquals(Arrays.asList(paraguay), pachorra.enQuePaisesResidioEn(2010));
		assertEquals(Arrays.asList(paraguay), pachorra.enQuePaisesResidioEn(2011));
		assertEquals(Arrays.asList(paraguay), pachorra.enQuePaisesResidioEn(2015));

		Persona juanSinTierra = new Migrante("Juan", "Exiliado", argentina, brasil, 2014);
		assertEquals(Arrays.asList(argentina), juanSinTierra.enQuePaisesResidioEn(2010));
		assertEquals(Arrays.asList(argentina, brasil), juanSinTierra.enQuePaisesResidioEn(2014));
		assertEquals(Arrays.asList(brasil), juanSinTierra.enQuePaisesResidioEn(2015));

		Persona pepa = new Migrante("Estela", "Taparabos", bolivia, uruguay, 2011);
		Persona pendejo = new Menor("Araoz", "Puber", pepa);
		assertEquals(Arrays.asList(bolivia), pendejo.enQuePaisesResidioEn(2010));
		assertEquals(Arrays.asList(bolivia, uruguay), pendejo.enQuePaisesResidioEn(2011));
		assertEquals(Arrays.asList(uruguay), pendejo.enQuePaisesResidioEn(2015));

		// viajes
		tordo.realizarViaje(ecuador, 2013);
		assertEquals(Arrays.asList(argentina, ecuador), tordo.enQuePaisesEstuvo(2013));
		
		assertEquals(Boolean.TRUE, tordo.coincidioCon(pendejo, 2015));
	}

}
