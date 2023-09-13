package ar.edu.ciu.objetos2.composite.model;

import java.util.ArrayList;
import java.util.List;

public abstract class CuentaPersonal implements Cuenta {

    protected List<Movimiento> movimientos;

    public CuentaPersonal() {
        super();
        this.movimientos = new ArrayList<Movimiento>();
    }

    public void add(Movimiento movimiento) {
        this.movimientos.add(movimiento);
    }

}
