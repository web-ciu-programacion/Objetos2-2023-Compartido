package ar.edu.ciu.objetos2.ascenso;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class test {

    @Test
    public void test1() {
        Partido p1 = new Partido("Dep. Laferrere", "Lamadrid");
        Emisora prensaLamadrid = new Emisora("Prensa Lamadrid");
        prensaLamadrid.setEstado(EnAire.getInstance());
        prensaLamadrid.setPartidoTransmitido(p1);

        Partido p2 = new Partido("Sol de Mayo", "Villa Mitre");
        Emisora futbolSur = new Emisora("Fútbol Sur");
        futbolSur.setEstado(EnAire.getInstance());
        futbolSur.setPartidoTransmitido(p2);

        Partido p3 = new Partido("Liniers", "CentralBallester");
        Emisora pelota = new Emisora("Pelota");
        pelota.setEstado(EnAire.getInstance());
        pelota.setPartidoTransmitido(p3);

        Partido p4 = new Partido("Alvarado", "Alte. Brown");
        Emisora pasionDeSabado = new Emisora("Pasion de Sabados");
        pasionDeSabado.setEstado(Interrumpida.getInstance());
        pasionDeSabado.setPartidoTransmitido(p4);

        Partido p5 = new Partido("Arg. de Rosario", "Dep. Paraguayo");
        Emisora narcoFutbol = new Emisora("Narco Futbol");
        narcoFutbol.setEstado(EnAire.getInstance());
        narcoFutbol.setPartidoTransmitido(p5);

        Manager manager = new Manager();
        manager.agregar(prensaLamadrid);
        manager.agregar(futbolSur);
        manager.agregar(pelota);
        manager.agregar(pasionDeSabado);
        manager.agregar(narcoFutbol);

        prensaLamadrid.generarNotificacion(61, "Gol de Lamadrid!!! Lama se impone por 1 a 0!");
        pasionDeSabado.setEstado(EnAire.getInstance());
        System.out.println("------------------------------");
        narcoFutbol.generarNotificacion(85, "Partido suspendido por ONG Los gatos son mascotas!");
        Assertions.assertTrue(true);
    }

}
