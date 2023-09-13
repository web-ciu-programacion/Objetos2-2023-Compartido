package ejercicio.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import ejercicio.entity.CentroDeDistribucion;
import ejercicio.entity.Certificacion;
import ejercicio.entity.Ciudad;
import ejercicio.entity.ComercioCorresponsal;
import ejercicio.entity.Empresa;
import ejercicio.entity.Provincia;
import ejercicio.entity.Sucursal;
import ejercicio.entity.Vendedor;
import ejercicio.entity.VendedorFijo;
import ejercicio.entity.VendedorViajante;
import ejercicio.exception.VendedorExistenteException;
import junit.framework.TestCase;

public class Test extends TestCase {
	
	public void test1() {
		Vendedor v1 = new VendedorFijo();
		v1.agregar(new Certificacion(10, Boolean.TRUE));
		v1.agregar(new Certificacion(20, Boolean.TRUE));
		v1.agregar(new Certificacion(25, Boolean.TRUE));
		assertFalse(v1.esVersatil());
		v1.agregar(new Certificacion(15, Boolean.FALSE));
		assertTrue(v1.esVersatil());
	}

	public void test2() {
		Vendedor v1 = new VendedorFijo();
		v1.agregar(new Certificacion(10, Boolean.TRUE));
		assertFalse(v1.esFirme());
		v1.agregar(new Certificacion(20, Boolean.TRUE));
		assertTrue(v1.esFirme());
	}

	public void test3() {
		try {
			Empresa emp1 = new Empresa();

			CentroDeDistribucion cdd1 = new CentroDeDistribucion();
			Vendedor v1 = new VendedorFijo();
			v1.agregar(new Certificacion(10, Boolean.TRUE));
			Vendedor v2 = new VendedorFijo();
			v2.agregar(new Certificacion(10, Boolean.TRUE));
			v2.agregar(new Certificacion(15, Boolean.TRUE));
			cdd1.agregar(v1);
			cdd1.agregar(v2);
			Vendedor flojo1 = cdd1.vendedorMasFlojo();
			assertEquals(v1, flojo1);
			emp1.agregar(cdd1);

			CentroDeDistribucion cdd2 = new CentroDeDistribucion();
			Vendedor v3 = new VendedorFijo();
			v3.agregar(new Certificacion(90, Boolean.TRUE));
			Vendedor v4 = new VendedorFijo();
			v4.agregar(new Certificacion(10, Boolean.TRUE));
			v4.agregar(new Certificacion(15, Boolean.TRUE));
			cdd2.agregar(v3);
			cdd2.agregar(v4);
			Vendedor flojo2 = cdd2.vendedorMasFlojo();
			assertEquals(v4, flojo2);
			emp1.agregar(cdd2);
			
			Collection<Vendedor> vendedoresFlojos = emp1.vendedoresFlojos();
			Collection<Vendedor> flojitos = new ArrayList<Vendedor>();
			flojitos.add(v1);
			flojitos.add(v4);
			
			assertTrue(flojitos.containsAll(vendedoresFlojos) && vendedoresFlojos.containsAll(flojitos));
		} catch (VendedorExistenteException e) {
			assertTrue(Boolean.FALSE);
		}
	}

	public void test4() {
		try {
			Ciudad rosario = new Ciudad("Rosario");
			Ciudad santaRosa = new Ciudad("Santa Rosa");
			Empresa emp1 = new Empresa();

			Vendedor v1 = new VendedorFijo(rosario);
			Vendedor v2 = new VendedorFijo(santaRosa);

			CentroDeDistribucion cdd1 = new CentroDeDistribucion();
			cdd1.agregar(v1);
			CentroDeDistribucion cdd2 = new CentroDeDistribucion();
			cdd2.agregar(v2);
			
			emp1.agregar(cdd1);
			emp1.agregar(cdd2);
			
			Collection<CentroDeDistribucion> aux = new ArrayList<CentroDeDistribucion>();
			aux.add(cdd1);
			assertTrue(aux.containsAll(emp1.centrosQuePuedenCubrir(rosario)) && emp1.centrosQuePuedenCubrir(rosario).containsAll(aux));
		} catch (VendedorExistenteException e) {
			assertTrue(Boolean.FALSE);
		}
	}
	
	public void test5() {
		Vendedor v1 = new VendedorFijo();
		Vendedor v2 = new VendedorFijo();
		CentroDeDistribucion cdd1 = new CentroDeDistribucion();
		try {
			cdd1.agregar(v1);
			cdd1.agregar(v2);
			cdd1.agregar(v1);
			assertTrue(Boolean.FALSE);
		} catch (VendedorExistenteException e) {
			assertTrue(Boolean.TRUE);
		}
	}
	
	public void test6() {
		Provincia santaFe = new Provincia("Santa Fe");
		Provincia santaJuan = new Provincia("San Juan");
		Provincia laRioja = new Provincia("La Rioja");
		Ciudad rosario = new Ciudad("Rosario");
		Ciudad rafaela = new Ciudad("Rafaela");
		Ciudad sanFrancisco = new Ciudad("San Francisco");
		Ciudad arroyito = new Ciudad("Arroyito");
		Ciudad olta = new Ciudad("Olta");
		Ciudad nonogasta = new Ciudad("Nonogasta");
		Ciudad jachal = new Ciudad("Jachal");
		Ciudad laPlata = new Ciudad("La Plata");
		santaFe.agregar(rosario);
		santaFe.agregar(rafaela);
		santaFe.agregar(sanFrancisco);
		santaFe.agregar(arroyito);
		santaJuan.agregar(jachal);
		laRioja.agregar(olta);
		laRioja.agregar(nonogasta);

		Vendedor vA = new VendedorViajante();
		((VendedorViajante)vA).agregar(santaFe);

		Vendedor vB = new VendedorFijo(rafaela);

		Sucursal s1 = new Sucursal(olta);
		Sucursal s2 = new Sucursal(nonogasta);
		Sucursal s3 = new Sucursal(sanFrancisco);
		Sucursal s4 = new Sucursal(arroyito);
		Vendedor vC = new ComercioCorresponsal();
		((ComercioCorresponsal)vC).agregar(s1);
		((ComercioCorresponsal)vC).agregar(s2);
		((ComercioCorresponsal)vC).agregar(s3);
		((ComercioCorresponsal)vC).agregar(s4);

		Sucursal s5 = new Sucursal(arroyito);
		Sucursal s6 = new Sucursal(rosario);
		Sucursal s7 = new Sucursal(jachal);
		Vendedor vD = new ComercioCorresponsal();
		((ComercioCorresponsal)vD).agregar(s5);
		((ComercioCorresponsal)vD).agregar(s6);
		((ComercioCorresponsal)vD).agregar(s7);
		
		CentroDeDistribucion cdd1 = new CentroDeDistribucion();
		try {
			cdd1.agregar(vA);
			cdd1.agregar(vB);
			cdd1.agregar(vC);
			cdd1.agregar(vD);
		} catch (VendedorExistenteException e) {
			assertTrue(Boolean.FALSE);
		}
		
		Collection<Ciudad> ciudadesAEvaluar = Arrays.asList(rafaela, arroyito, jachal, laPlata);
		Collection<Ciudad> ciudadesAux = Arrays.asList(rafaela, arroyito);
		Collection<Ciudad> ciudadesRedundantes = cdd1.ciudadesRedundantes(ciudadesAEvaluar);
		
		assertTrue(ciudadesAux.containsAll(ciudadesRedundantes) && ciudadesRedundantes.containsAll(ciudadesAux));
	}
	
	public void test8() {
		// FactoryMethod
		// Manejo de Escepciones
		
	}
}
