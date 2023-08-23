package ar.edu.ciu.objetos2.teoria.interfaces.test;

import java.time.LocalDate;

import ar.edu.ciu.objetos2.teoria.interfaces.model.Loro;
import ar.edu.ciu.objetos2.teoria.interfaces.model.Mascota;
import ar.edu.ciu.objetos2.teoria.interfaces.model.Vendible;
import junit.framework.TestCase;

public class Test extends TestCase {

    public void testLoro() {
        Loro loritoPepe = new Loro();
        loritoPepe.setDescripcion("Loro parlanchin");
        loritoPepe.setHabla(Boolean.TRUE);
        loritoPepe.setEdadLimiteReproductor(5);
        loritoPepe.setFechaDeNacimiento(LocalDate.of(2021, 11, 15));
        loritoPepe.setPeso(400);
        loritoPepe.setAlimento("Alpiste");
        loritoPepe.setCantidadAlimentoDiario(10);

        // lo utilizo como mascota (el método getEdad es de Masctota)
        Mascota loritoPepemascota = (Mascota)loritoPepe;
        assertEquals(1, loritoPepemascota.getEdad());

        // lo utilizao como vendible
        Vendible loritoPepeVendible = (Vendible)loritoPepe;
        assertEquals(6000.0, loritoPepeVendible.getPrecioFinal());
    }

}
