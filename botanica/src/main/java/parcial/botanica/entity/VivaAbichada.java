package parcial.botanica.entity;

import java.util.ArrayList;
import java.util.Collection;

/*
 * Este estado no es singleton ya que las plagas puden diferir
 * entre las hojas abichadas.
 */
public class VivaAbichada extends VivaSana {

	private Collection<Plaga> plagas;
	
	public VivaAbichada() {
		this.plagas = new ArrayList<Plaga>();
	}

	private Double clorofilaConsumidaPorPlagas(Hoja hoja) {
		return this.plagas.stream()
							.mapToDouble(plaga -> plaga.colorofilaConsumida(hoja))
							.sum();
	}

	@Override
	public Double cantidadDeClorofila(Hoja hoja) {
		Double cantidadDeClorofila = this.cantidadDeClorofilaEstandard(hoja) - this.clorofilaConsumidaPorPlagas(hoja);
		return cantidadDeClorofila>0?cantidadDeClorofila:0;
	}
	
	public void agregarPlaga(Plaga plaga) {
		this.plagas.add(plaga);
	}
}