package ar.edu.ciu.objetos2.teoria.interfaces.model;

/**
 * Observar que en la interface Vendible me intersa la informacion que determina el precio de venta.
 */
public interface Vendible {

    public Double getPrecioBase();
    public Double getPrecioFinal();
    public Boolean getEdadOptima();

}
