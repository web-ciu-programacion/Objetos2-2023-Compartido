package ar.edu.ciu.objetos2.teoria.interfaces.model;

import java.time.LocalDate;
import java.time.Period;

/**
 * Observar que en la clase Mascota me interesa información para que el animal tenga un estado de salud
 * dentro de los parametros normales.
 */
public abstract class Mascota {

    protected String descripcion;
    protected LocalDate fechaDeNacimiento;
    protected String alimento;
    protected Integer cantidadAlimentoDiario;
    protected Integer peso;

    protected abstract Boolean estaEnPesoPromedio();

    public int getEdad() {
        LocalDate ahora = LocalDate.now();
        Period periodo = Period.between(this.fechaDeNacimiento, ahora);
        return periodo.getYears();
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public Integer getCantidadAlimentoDiario() {
        return cantidadAlimentoDiario;
    }

    public void setCantidadAlimentoDiario(Integer cantidadAlimentoDiario) {
        this.cantidadAlimentoDiario = cantidadAlimentoDiario;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

}
