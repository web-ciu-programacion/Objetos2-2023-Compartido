package ar.edu.ciu.objetos2.teoria.interfaces.model;

public class Loro extends Mascota implements Vendible {

    protected static Short promedioDeVida = (short)15;
    protected static Integer pesoPromedio = 480;

    private Boolean habla;
    private Integer edadLimiteReproductor;

    public Boolean getHabla() {
        return habla;
    }

    public void setHabla(Boolean habla) {
        this.habla = habla;
    }

    @Override
    public Double getPrecioBase() {
        return 1500.00;
    }

    @Override
    public Double getPrecioFinal() {
        double precio = this.getPrecioBase();
        if (this.habla)
            precio += this.getPrecioBase();
        if (this.edadLimiteReproductor>this.getEdad())
            precio += this.getPrecioBase()*2;
        return precio;
    }

    @Override
    public Boolean getEdadOptima() {
        return this.getEdad()<(promedioDeVida/3);
    }

    public Integer getEdadLimiteReproductor() {
        return edadLimiteReproductor;
    }

    public void setEdadLimiteReproductor(Integer edadLimiteReproductor) {
        this.edadLimiteReproductor = edadLimiteReproductor;
    }

    @Override
    protected Boolean estaEnPesoPromedio() {
        return this.peso>(pesoPromedio-80) && this.peso<(pesoPromedio+80);
    }
}
