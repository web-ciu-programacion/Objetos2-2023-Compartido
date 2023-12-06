package ar.edu.ciu.objetos2.plumasverdes.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import ar.edu.ciu.objetos2.plumasverdes.Central;
import ar.edu.ciu.objetos2.plumasverdes.Chofer;
import ar.edu.ciu.objetos2.plumasverdes.Dec;
import ar.edu.ciu.objetos2.plumasverdes.IdaA;
import ar.edu.ciu.objetos2.plumasverdes.Observador;
import ar.edu.ciu.objetos2.plumasverdes.Omnibus;
import ar.edu.ciu.objetos2.plumasverdes.Sentido;
import ar.edu.ciu.objetos2.plumasverdes.Sujeto;

public class BondiTest {

	@DisplayName("Omnibus 1")
	@Test
    public void test1() throws InterruptedException {
		Chofer juanca = new Chofer("DNI", 27421764, "Ricardo Esppinosa");
		Sentido ida = new IdaA("De: Flores A: Devoto");
		Omnibus o1 = new Omnibus(144, juanca, ida);
		
		Sujeto central = new Central();
		Observador dec1 = new Dec(1, "Plaza Flores");
		Observador dec2 = new Dec(2, "Avellaneda");
		Observador dec3 = new Dec(3, "Pomar");
		Observador dec4 = new Dec(4, "Nogoya");
		Observador dec5 = new Dec(5, "Lamadrid");
		Observador dec6 = new Dec(6, "Plaza Arenales");
		central.agregar(dec1);
		central.agregar(dec2);
		central.agregar(dec3);
		central.agregar(dec4);
		central.agregar(dec5);
		central.agregar(dec6);
		
		dec1.arribo(o1);
		Thread.sleep(1500); // Simula demora de 1.5 segundos entre parada y parada.
		System.out.println("-------------------------------------------------------------------");
		dec2.arribo(o1);
		
		Assertions.assertTrue(true);
    }
}
