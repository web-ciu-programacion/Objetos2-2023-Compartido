package ciu.objetos2.cuentabancaria.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import ciu.objetos2.cuantabancaria.entity.Banco;
import ciu.objetos2.cuantabancaria.entity.Cliente;
import ciu.objetos2.cuantabancaria.entity.Cuenta;
import ciu.objetos2.cuantabancaria.exception.CuentaException;
import ciu.objetos2.cuantabancaria.factory.CajaDeAhorroCreator;
import ciu.objetos2.cuantabancaria.factory.CuentaCorrienteCreator;
import ciu.objetos2.cuantabancaria.factory.CuentaCreator;

public class Parte1Test {

    @DisplayName("Crear Caja de Ahorro")
    @Test
	public void testCrearCajaDeAhorro() {
		try {
	    	Cliente cliente = new Cliente("Ricardo", "Iorio", "20-12854374-1", 65000d);
	    	CuentaCreator caCreator = new CajaDeAhorroCreator();
	    	Cuenta ca = caCreator.crearCuenta(cliente);
	    	ca.depositar(100d);
	    	assertEquals(2, ca.cantidadDeMovimientos());
	    	assertEquals(1100d, ca.getSaldo());
		} catch (CuentaException e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
    }

    @DisplayName("Crear Cuenta Corriente")
    @Test
	public void testCrearCuentaCorriente() {
		try {
	    	Cliente cliente = new Cliente("Luciano", "Scaglione", "20-21371011-1", 90000d);
	    	CuentaCreator ccCreator = new CuentaCorrienteCreator();
	    	Cuenta cc = ccCreator.crearCuenta(cliente);
	    	cc.depositar(100d);
	    	assertEquals(2, cc.cantidadDeMovimientos());
	    	assertEquals(-550d, cc.getSaldo());
		} catch (CuentaException e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
    }

    @DisplayName("Cuentas embargadas")
    @Test
	public void testCuentasEmbargadas() {
		try {
	    	Cliente miryam = new Cliente("Miryam", "Bregman", "20-19652321-1", 30000d);
	    	CuentaCreator caCreator = new CajaDeAhorroCreator();
	    	Cuenta caMiryam = caCreator.crearCuenta(miryam);
	    	caMiryam.embargar();

	    	Cliente nicolas = new Cliente("Nicolas", "Del Caño", "20-21355963-1", 45000d);
	    	Cuenta caNicolas = caCreator.crearCuenta(nicolas);

	    	Cliente marcelo = new Cliente("Marcelo", "Ramal", "20-21355963-1", 10000d);
	    	Cuenta caMarcelo = caCreator.crearCuenta(marcelo);
	    	
	    	Banco credicoop = new Banco();
	    	credicoop.agregar(caMiryam);credicoop.agregar(caNicolas);credicoop.agregar(caMarcelo);

	    	assertEquals(1, credicoop.getCuentasEmbargadas().size());
		} catch (CuentaException e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
    }

}
