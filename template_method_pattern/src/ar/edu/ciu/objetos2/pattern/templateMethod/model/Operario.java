package ar.edu.ciu.objetos2.pattern.templateMethod.model;

/**
 * Template Method concrete 1
 */
public class Operario extends Empleado {

    private Integer horasExtras;

    public Operario(Double fijo, Integer ausencias, Integer horasExtras) {
        super(fijo, ausencias);
        this.horasExtras = horasExtras;
    }

    @Override
    protected Double getPresentismo(Double basico) {
        Double presentismo = 0.0;
        if (this.cantidadDeAusencias>1) {
            presentismo = ((basico * this.cantidadDeAusencias) / 100) * -1;
        } else if (this.cantidadDeAusencias==0) {
            presentismo = ((basico * 2) / 100);
        }
        return presentismo;
    }

    @Override
    protected Double getAdicionales(Double basicoPresentismo) {
        Double extras = 0.0;
        if (this.horasExtras>5) {
            extras = ((basicoPresentismo*3)/100)*this.horasExtras;
        }
        return extras;
    }

}
