package ciu.objetos2.paquete.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import ciu.objetos2.paquete.model.Componente;
import ciu.objetos2.paquete.model.Nueva;
import ciu.objetos2.paquete.model.Paquete;
import ciu.objetos2.paquete.model.Sorpresa;
import ciu.objetos2.paquete.model.Usada;

public class PaqueteTest {

	private Componente getPaquete() {
    	Componente camisetaLamadrid = new Sorpresa(15000d, Nueva.getInstance());
    	Componente banderinLamadrid = new Sorpresa(2200d, Nueva.getInstance());
    	Componente llaveroLamadrid = new Sorpresa(1700d, Nueva.getInstance());
    	Componente shortLamadrid = new Sorpresa(9100d, Nueva.getInstance());
    	Componente mediasLamadrid = new Sorpresa(5500d, Nueva.getInstance());
    	Componente posterLamadrid = new Sorpresa(1500d, Nueva.getInstance());
    	Componente pulseraLamadrid = new Sorpresa(1000d, Usada.getInstance());
    	
    	Paquete paquete1 = new Paquete();
    	paquete1.agregar(camisetaLamadrid);

    	Paquete paquete2 = new Paquete();
    	paquete2.agregar(paquete1);
    	paquete2.agregar(banderinLamadrid);
    	paquete2.agregar(llaveroLamadrid);

    	Paquete paquete3 = new Paquete();
    	paquete3.agregar(paquete2);
    	paquete3.agregar(shortLamadrid);
    	
    	Paquete paquete4 = new Paquete();
    	paquete4.agregar(paquete3);
    	paquete4.agregar(mediasLamadrid);
    	paquete4.agregar(posterLamadrid);
    	paquete4.agregar(pulseraLamadrid);
    	return paquete4;
	}

    @DisplayName("Cantidad de sorpresas")
    @Test
	public void testCantidadDeSorpresas() {
    	assertEquals(Integer.valueOf(7), this.getPaquete().cantidadDeSorpresas());
    }
    
    @DisplayName("Costo total paquete")
    @Test
	public void testCostoTotalPaquete() {
    	assertEquals(35600d, this.getPaquete().costoTotal());
    }

    @DisplayName("Test Clon")
    @Test
	public void testClon() {
    	Componente paquete = this.getPaquete();
    	assertEquals(paquete, paquete);
    	Componente paqueteClon = (Componente)paquete.clone();
    	assertEquals(paqueteClon, paqueteClon);

    	assertNotEquals(paquete, paqueteClon);
    	assertEquals(7, paqueteClon.cantidadDeSorpresas());
    	assertEquals(35600d, this.getPaquete().costoTotal());
    }
}