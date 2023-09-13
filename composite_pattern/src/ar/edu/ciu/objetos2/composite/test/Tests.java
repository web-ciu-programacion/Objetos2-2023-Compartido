package ar.edu.ciu.objetos2.composite.test;

import ar.edu.ciu.objetos2.composite.model.*;
import junit.framework.TestCase;

public class Tests extends TestCase {

    public void testItem1() {
        CuentaPersonal caJose = new CajaDeAhorro();
        caJose.add(new Movimiento(Signo.POSITIVO, Double.valueOf(5274.85)));
        caJose.add(new Movimiento(Signo.NEGATIVO, Double.valueOf(100.50)));
        caJose.add(new Movimiento(Signo.NEGATIVO, Double.valueOf(120)));
        assertEquals(Double.valueOf(5054.35), caJose.saldo());

        CuentaPersonal ccMicaela = new CuentaCorriente();
        ccMicaela.add(new Movimiento(Signo.POSITIVO, Double.valueOf(50)));
        ccMicaela.add(new Movimiento(Signo.NEGATIVO, Double.valueOf(100.50)));
        ccMicaela.add(new Movimiento(Signo.NEGATIVO, Double.valueOf(120)));
        assertEquals(Double.valueOf(-220.50), ccMicaela.saldo());

        Corporativa corpo1 = new Corporativa();
        corpo1.add(caJose);
        corpo1.add(ccMicaela);
        assertEquals(Double.valueOf(4833.85), corpo1.saldo());
    }

    public void testItem2() {
        Banco garcap = new Banco(1000000.00);

        CuentaPersonal caJose = new CajaDeAhorro();
        caJose.add(new Movimiento(Signo.POSITIVO, Double.valueOf(5274.85)));
        caJose.add(new Movimiento(Signo.NEGATIVO, Double.valueOf(100.50)));
        caJose.add(new Movimiento(Signo.NEGATIVO, Double.valueOf(120)));
        assertEquals(Double.valueOf(5054.35), caJose.saldo());

        CuentaPersonal ccMicaela = new CuentaCorriente();
        ccMicaela.add(new Movimiento(Signo.POSITIVO, Double.valueOf(50)));
        ccMicaela.add(new Movimiento(Signo.NEGATIVO, Double.valueOf(100.50)));
        ccMicaela.add(new Movimiento(Signo.NEGATIVO, Double.valueOf(120)));
        assertEquals(Double.valueOf(-220.50), ccMicaela.saldo());

        Corporativa corpo1 = new Corporativa();
        corpo1.add(caJose);
        corpo1.add(ccMicaela);
        assertEquals(Double.valueOf(4833.85), corpo1.saldo());

        garcap.add(corpo1);

        CuentaPersonal caMaria = new CajaDeAhorro();
        caMaria.add(new Movimiento(Signo.POSITIVO, Double.valueOf(500.00)));

        CuentaPersonal caPablo = new CajaDeAhorro();
        caPablo.add(new Movimiento(Signo.POSITIVO, Double.valueOf(700.00)));

        assertFalse(garcap.estaEnPeligroDeQuiebra());

    }
    public void testItem3() {
        Banco garcap = new Banco(50000.00);

        CuentaPersonal caJose = new CajaDeAhorro();
        caJose.add(new Movimiento(Signo.POSITIVO, Double.valueOf(100.00)));
        caJose.add(new Movimiento(Signo.NEGATIVO, Double.valueOf(25.00)));
        caJose.add(new Movimiento(Signo.NEGATIVO, Double.valueOf(25.00)));
        assertEquals(Double.valueOf(50.00), caJose.saldo());
        CuentaPersonal ccMicaela = new CuentaCorriente();
        ccMicaela.add(new Movimiento(Signo.NEGATIVO, Double.valueOf(100000.00)));
        assertEquals(Double.valueOf(-100000.00), ccMicaela.saldo());
        Corporativa corpo1 = new Corporativa();
        corpo1.add(caJose);
        corpo1.add(ccMicaela);
        assertEquals(Double.valueOf(-99950.00), corpo1.saldo());

        CuentaPersonal caLopez = new CajaDeAhorro();
        caLopez.add(new Movimiento(Signo.POSITIVO, Double.valueOf(500.00)));
        CuentaPersonal ccNico = new CuentaCorriente();
        ccNico.add(new Movimiento(Signo.NEGATIVO, Double.valueOf(100000.00)));
        Corporativa corpo2 = new Corporativa();
        corpo2.add(caLopez);
        corpo2.add(ccNico);
        assertEquals(Double.valueOf(-99500.00), corpo2.saldo());

        corpo1.add(corpo2);

        CajaDeAhorro caPirlo = new CajaDeAhorro();
        caPirlo.add(new Movimiento(Signo.POSITIVO, Double.valueOf(100.00)));

        garcap.add(corpo1);
        garcap.add(caPirlo);

        assertEquals(-199350.00, garcap.balance());

    }

}
