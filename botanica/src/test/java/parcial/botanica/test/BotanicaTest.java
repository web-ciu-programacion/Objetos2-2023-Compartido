package parcial.botanica.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import parcial.botanica.entity.Componente;
import parcial.botanica.entity.Hoja;
import parcial.botanica.entity.MoscaBlanca;
import parcial.botanica.entity.NoViva;
import parcial.botanica.entity.Pulgon;
import parcial.botanica.entity.Rama;
import parcial.botanica.entity.VivaAbichada;
import parcial.botanica.entity.VivaSana;

public class BotanicaTest {

    @DisplayName("Test Hoja No Viva")
    @Test
	public void testHojaNoViva() {
    	Hoja hoja = new Hoja(Double.valueOf(0.06), Double.valueOf(20), NoViva.getInstance());
    	assertEquals(Double.valueOf(0.12), hoja.cantidadDeClorofila());
    	hoja = new Hoja(Double.valueOf(0.04), Double.valueOf(20), NoViva.getInstance());
    	assertEquals(Double.valueOf(0), hoja.cantidadDeClorofila());
    }

    @DisplayName("Test Hoja Viva Sana")
    @Test
	public void testHojaVivaSana() {
    	Hoja hoja = new Hoja(Double.valueOf(0.08), Double.valueOf(40), VivaSana.getInstance());
    	assertEquals(Double.valueOf(3.2), hoja.cantidadDeClorofila());
    	hoja = new Hoja(Double.valueOf(0.07), Double.valueOf(40), VivaSana.getInstance());
    	assertEquals(Double.valueOf(2.8), hoja.cantidadDeClorofila());
    }

    @DisplayName("Test Hoja Viva Abichada")
    @Test
	public void testHojaVivaAbichada() {
    	assertEquals(Double.valueOf(1.75), this.getHojaAbichada().cantidadDeClorofila());
    }

    @DisplayName("Test Cantidad de Hojas")
    @Test
	public void testCantidadDeHojas() {
    	assertEquals(6, this.getPlanta().totalDeHojas());
    }

    @DisplayName("Test Cantidad de clorifila")
    @Test
	public void testCantidadDeClorofila() {
    	BigDecimal bd = new BigDecimal(this.getPlanta().cantidadDeClorofila()).setScale(2, RoundingMode.HALF_UP);
    	double val2 = bd.doubleValue();
    	assertEquals(13.47, val2);
    }

    @DisplayName("Test Clon")
    @Test
	public void testClon() {
    	Componente rama = this.getPlanta();
    	assertEquals(rama, rama);
    	Componente ramaClon = (Componente)rama.clone();
    	assertEquals(ramaClon, ramaClon);

    	assertNotEquals(rama, ramaClon);
    	assertEquals(6, ramaClon.totalDeHojas());
    	BigDecimal bd = new BigDecimal(ramaClon.cantidadDeClorofila()).setScale(2, RoundingMode.HALF_UP);
    	double val2 = bd.doubleValue();
    	assertEquals(13.47, val2);
    }

    /*
     * 
     * hoja No Viva: +
     * hoja Viva Sana: °
     * hoja Viva Abichada: *
     * 
     *        rama_1_2_1\      /rama_1_2_2
     *                   \   °/+
     *             \      \° /
     *    rama_1_1  \*     \/
     *              °\     /
     *                \   /°
     *                 \ /rama_1_2 
     *                  |
     *                  |
     *                  |rama_1
     * 
     */
    private Rama getPlanta() {
    	Rama rama_1 = new Rama();
    	Rama rama_1_1 = new Rama();
    	Rama rama_1_2 = new Rama();
    	Rama rama_1_2_1 = new Rama();
    	Rama rama_1_2_2 = new Rama();
    	Hoja hoja_1 = new Hoja(0.08d, 40d, VivaSana.getInstance()); // 3.2
    	Hoja hoja_2 = this.getHojaAbichada(); // 1.75
    	Hoja hoja_3 = new Hoja(0.07d, 40d, VivaSana.getInstance()); // 2.8
    	Hoja hoja_4 = new Hoja(0.07d, 40d, VivaSana.getInstance()); // 2.8
    	Hoja hoja_5 = new Hoja(Double.valueOf(0.06), Double.valueOf(20), NoViva.getInstance()); // 0.12
    	Hoja hoja_6 = new Hoja(0.07d, 40d, VivaSana.getInstance()); // 2.8
    	rama_1_1.agregar(hoja_1);
    	rama_1_1.agregar(hoja_2);
    	rama_1.agregar(rama_1_1);
    	rama_1_2.agregar(hoja_3);
    	rama_1_2_1.agregar(hoja_4);
    	rama_1_2_2.agregar(hoja_5);
    	rama_1_2_2.agregar(hoja_6);
    	rama_1_2.agregar(rama_1_2_1);
    	rama_1_2.agregar(rama_1_2_2);
    	rama_1.agregar(rama_1_2);
    	return rama_1;
    }
    
    private Hoja getHojaAbichada() {
    	VivaAbichada vivaAbichada = new VivaAbichada();
    	vivaAbichada.agregarPlaga(new Pulgon());
    	vivaAbichada.agregarPlaga(new MoscaBlanca());
    	return new Hoja(Double.valueOf(0.07), Double.valueOf(30), vivaAbichada);
    }
}