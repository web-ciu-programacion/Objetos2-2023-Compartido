package ar.edu.ciu.objetos2.imperio.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Imperio {

    private List<Ciudadano> ciudadanos;

    public Imperio() {
        super();
        this.ciudadanos = new ArrayList<>();
    }

    public void agregar(Ciudadano ciudadano) {
        if (!this.existeLegajo(ciudadano.getLegajo())) {
            this.ciudadanos.add(ciudadano);
        } else {
            System.out.println("Legajo: " + ciudadano.getLegajo() + " existente.");
        }
    }

    private boolean existeLegajo(String legajo) {
        return this.ciudadanos.stream()
                                  .map(Ciudadano::getLegajo)
                                  .anyMatch(leg -> leg.equals(legajo));
    }

    public Integer getCantidadDeCiudadanos() {
        return this.ciudadanos.size();
    }

    public Double getPoderDeAtaque() {
        return this.getMilicias().stream()
                                    .mapToDouble(m -> m.poderDeGenerarDanio(SiluetaGuerrera.getInstance()))
                                    .sum();
    }

    private List<Milicia> getMilicias() {
    	return this.ciudadanos.stream()
    								.filter(c -> c.getTipoCiudadano()==TipoCiudadano.MILICIA)
    								.map( m -> (Milicia)m)
    								.collect(Collectors.toList());
    }

    private List<Militar> getMilitares() {
    	return this.ciudadanos.stream()
    								.filter(c -> c.getTipoCiudadano()==TipoCiudadano.MILICIA || c.getTipoCiudadano()==TipoCiudadano.ALDEANO)
    								.map( m -> (Milicia)m)
    								.collect(Collectors.toList());
    }

    public Double getPoderDeDefensa() {
        return this.getMilitares().stream()
                						.mapToDouble(m -> m.poderDeGenerarDanio(SiluetaGuerrera.getInstance()))
                						.sum();
    }
    
    public List<Ciudadano> getCiudadanos() {
    	return this.ciudadanos;
    }
}