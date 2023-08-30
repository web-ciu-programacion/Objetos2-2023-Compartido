package ejercicio.test;

import java.util.ArrayList;
import java.util.Collection;

import ejercicio.entity.Ametralladora;
import ejercicio.entity.Arma;
import ejercicio.entity.Bomba;
import ejercicio.entity.Criminal;
import ejercicio.entity.Cuchillo;
import ejercicio.entity.Familia;
import ejercicio.entity.Integrante;
import ejercicio.entity.Respetable;
import ejercicio.entity.Titulo;
import junit.framework.TestCase;

public class Test extends TestCase {

	public void test1() {
		Arma tramontina = new Cuchillo(1);
		assertFalse(tramontina.isHeavy());
		Arma amet = new Ametralladora(205);
		assertTrue(amet.isHeavy());
		Arma bom = new Bomba();
		assertTrue(bom.isHeavy());
	}

	public void test2() {
		Integrante tony = new Criminal("Tony", 150);
		Arma ametralladora = new Ametralladora(250);
		Arma tramontina = new Cuchillo(100);
		((Criminal)tony).add(ametralladora);
		((Criminal)tony).add(tramontina);
		assertEquals(255, tony.honor().intValue());
	}

	public void test3() {
		// criminal
		Integrante tony = new Criminal("Tony", 150);
		Arma ametralladora = new Ametralladora(250);
		Arma tramontina = new Cuchillo(100);
		((Criminal)tony).add(ametralladora);
		((Criminal)tony).add(tramontina);
		assertTrue(tony.esCapo());
		Integrante niki = new Criminal("niki", 10);
		Arma tramontinaBerreta = new Cuchillo(5);
		((Criminal)niki).add(tramontinaBerreta);
		assertFalse(niki.esCapo());
		// respetable
		Integrante gregorio = new Respetable("Gregorio", 90, Boolean.TRUE);
		Titulo chamuyero  = new Titulo("Licenciado en Recursos Humanos");
		Titulo garca  = new Titulo("Licenciado en Economía");
		((Respetable)gregorio).add(chamuyero);
		((Respetable)gregorio).add(garca);
		assertTrue(gregorio.esCapo());
	}

	public void test4() {
		// criminal
		Integrante tony = new Criminal("Tony", 150);
		Arma ametralladora = new Ametralladora(250);
		Arma tramontina = new Cuchillo(100);
		((Criminal)tony).add(ametralladora);
		((Criminal)tony).add(tramontina);

		Integrante niki = new Criminal("niki", 10);
		Arma tramontinaBerreta = new Cuchillo(5);
		((Criminal)niki).add(tramontinaBerreta);

		// respetable
		Integrante gregorio = new Respetable("Gregorio", 90, Boolean.TRUE);
		Titulo chamuyero  = new Titulo("Licenciado en Recursos Humanos");
		Titulo garca  = new Titulo("Licenciado en Economía");
		((Respetable)gregorio).add(chamuyero);
		((Respetable)gregorio).add(garca);
		
		Familia basura = new Familia();
		basura.add(gregorio);
		basura.add(tony);
		basura.add(niki);
		
		Collection<Integrante> auxiliar = new ArrayList<Integrante>();
		auxiliar.add(tony);
		auxiliar.add(gregorio);
		
		assertTrue(basura.capos().containsAll(auxiliar) && auxiliar.containsAll(basura.capos()));
	}

	public void test5() {
		// criminal
		Integrante tony = new Criminal("Tony", 150);
		Arma ametralladora = new Ametralladora(250);
		Arma tramontina = new Cuchillo(100);
		((Criminal)tony).add(ametralladora);
		((Criminal)tony).add(tramontina);

		Integrante niki = new Criminal("niki", 10);
		Arma tramontinaBerreta = new Cuchillo(5);
		((Criminal)niki).add(tramontinaBerreta);

		// respetable
		Integrante gregorio = new Respetable("Gregorio", 90, Boolean.TRUE);
		Titulo chamuyero  = new Titulo("Licenciado en Recursos Humanos");
		Titulo garca  = new Titulo("Licenciado en Economía");
		((Respetable)gregorio).add(chamuyero);
		((Respetable)gregorio).add(garca);
		
		Familia basura = new Familia();
		basura.add(gregorio);
		basura.add(tony);
		basura.add(niki);
		
		assertEquals(126, basura.honorPerCapita().intValue());
	}

	public void test6() {
		// criminal
		Integrante tony = new Criminal("Tony", 150);
		Arma ametralladora = new Ametralladora(250);
		Arma tramontina = new Cuchillo(100);
		((Criminal)tony).add(ametralladora);
		((Criminal)tony).add(tramontina);

		// respetable
		Integrante gregorio = new Respetable("Gregorio", 90, Boolean.TRUE);
		Titulo chamuyero  = new Titulo("Licenciado en Recursos Humanos");
		Titulo garca  = new Titulo("Licenciado en Economía");
		((Respetable)gregorio).add(chamuyero);
		((Respetable)gregorio).add(garca);
		
		Familia basura = new Familia();
		basura.add(gregorio);
		basura.add(tony);
		
		assertTrue(basura.esEjemplar().booleanValue());
	}

}
