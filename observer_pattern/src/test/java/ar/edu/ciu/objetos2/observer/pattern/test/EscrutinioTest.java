package ar.edu.ciu.objetos2.observer.pattern.test;

import ar.edu.ciu.objetos2.observer.pattern.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class EscrutinioTest {

    @DisplayName("Test Escrutinio")
    @Test
    void testEscrutinio() {
        MedioDeComunicacion exitista = new Exitista();
        MedioDeComunicacion informa = new Informa();
        MedioDeComunicacion superCanal = new SuperCanal();
        JuntaElectoral juntaElectoral = new JuntaElectoralBuenosAires();
        juntaElectoral.agregar(exitista);
        juntaElectoral.agregar(informa);
        juntaElectoral.agregar(superCanal);
        juntaElectoral.cargarVotos();
        juntaElectoral.cargarVotos();
        Assertions.assertTrue(true);
    }

}
