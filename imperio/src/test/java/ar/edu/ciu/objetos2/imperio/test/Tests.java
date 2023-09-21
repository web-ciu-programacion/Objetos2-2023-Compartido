package ar.edu.ciu.objetos2.imperio.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import ar.edu.ciu.objetos2.imperio.model.Aldeano;
import ar.edu.ciu.objetos2.imperio.model.Gobernante;
import ar.edu.ciu.objetos2.imperio.model.Imperio;

public class Tests {

    @DisplayName("Test MessageService.get()")
    @Test
	public void testItem1() {
        Gobernante marcoAurelio = new Gobernante("Marco Aurelio", "1-10247", "Emperador");
        Gobernante patriciaWalsh = new Gobernante("Calibula", "2-15431", "Senadora");

        Aldeano estebanPerez = new Aldeano("Esteban Perez", "7-15912", Boolean.TRUE);
        Aldeano matiasGimenez = new Aldeano("Matias Gimenez", "7-15913", Boolean.FALSE);
        Aldeano martinZurlo = new Aldeano("Martin Zurlo", "7-15920", Boolean.TRUE);
        Aldeano abelFlegenal = new Aldeano("Abel Flegenal", "7-15915", Boolean.FALSE);
        Aldeano linoBillordo = new Aldeano("Lino Billordo", "7-15912", Boolean.FALSE); // Legajo duplicado

        Imperio imperioRomano = new Imperio();
        imperioRomano.agregar(marcoAurelio);
        imperioRomano.agregar(patriciaWalsh);
        imperioRomano.agregar(estebanPerez);
        imperioRomano.agregar(matiasGimenez);
        imperioRomano.agregar(martinZurlo);
        imperioRomano.agregar(abelFlegenal);
        imperioRomano.agregar(linoBillordo);

		assertEquals(Integer.valueOf(6), imperioRomano.getCantidadDeCiudadanos());
	}
	
}
