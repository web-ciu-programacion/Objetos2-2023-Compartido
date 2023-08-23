package ar.edu.ciu.objetos2.teoria.interfaces.model;

public class Gato extends Mascota {

    protected static Integer pesoPromedio = 480;

    @Override
    protected Boolean estaEnPesoPromedio() {
        return this.peso>(pesoPromedio-80) && this.peso<(pesoPromedio+80);
    }
}
