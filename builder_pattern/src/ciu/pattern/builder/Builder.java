package ciu.pattern.builder;

import ciu.pattern.builder.model.Auto;

/*
 *  Contrato de todas las opciones de construcción. No es obligatorio la implementación de todas las opciones en 
 *  los Build Concretos, puede que en algunos Concretos el buildX no haga nada o arroje exception.
 */
public interface Builder {

    public void reset();
    public void buildPuertas();
    public void buildMotor();
    public void buildComputadoraDeNavegacion();
    public void buildGPS();
    public void buildRuedaDeAuxilio();
    public Auto build();
}
