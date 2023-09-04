package ar.edu.ciu.objetos2.pattern.templateMethod.model;

import org.apache.commons.lang3.StringUtils;

/**
 * Template Method abstract
 */
public abstract class Empleado {

    public Empleado(Double fijo, Integer ausencias) {
        super();
        this.fijo = fijo;
        this.cantidadDeAusencias = ausencias;
    }

    protected String nombre;
    protected Double fijo;
    protected Integer cantidadDeAusencias;

    protected abstract Double getPresentismo(Double basico);
    protected abstract Double getAdicionales(Double basicoPresentismo);

    public Double getSueldo(Double ipc) {
        Double basico = this.getBasico(ipc);                                        // paso 1 (abstract)
        Double presentismo = this.getPresentismo(basico);                           // paso 2 (concrete)
        Double adicional = this.getAdicionales(basico+presentismo);  				// paso 3 (concrete)
        return this.calculo(basico, presentismo, adicional);                        // paso 4 (abstract)
    }

    protected Double getBasico(Double ipc) {
        Double ajustePorIPC = (this.fijo * ipc) / 100;
        return this.fijo + ajustePorIPC;
    }

    private Double calculo(Double... monto) {
        Double total = 0.0;
        for (int i = 0; i < monto.length; i++) {
            total += monto[i];
        }
        return total;
    }

    public String getNombreInverso() {
        return StringUtils.reverse(this.nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
