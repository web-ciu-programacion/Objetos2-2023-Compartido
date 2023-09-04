package ar.edu.ciu.objetos2.pattern.templateMethod.model;

public class Vendedor extends  Empleado {

    private Integer cantidadDeVentasAlMes;

    public Vendedor(Double fijo, Integer ausencias, Integer ventas) {
        super(fijo, ausencias);
        this.cantidadDeVentasAlMes = ventas;
    }

    @Override
    protected Double getPresentismo(Double basico) {
        Double presentismo = 0.0;
        if (this.cantidadDeAusencias>10) {
            presentismo = (this.cantidadDeAusencias * 100) * -1.0;
        }
        return presentismo;
    }

    @Override
    protected Double getAdicionales(Double basicoPresentismo) {
        return ((basicoPresentismo*10)/100)*this.cantidadDeVentasAlMes;
    }

}
