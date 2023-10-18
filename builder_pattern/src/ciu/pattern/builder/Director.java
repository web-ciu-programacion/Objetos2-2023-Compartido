package ciu.pattern.builder;

/*
 *  EL Director solo es responsable de ejecutar los pasos de construcción en una 
 *  secuencia particular.
 */
public class Director {

	// Le puedo pasar cualquier builder para mayor fexibilidad
	public void construirAutoDeportivo(Builder builder) {
		builder.buildPuertas();
		builder.buildMotor();
		builder.buildComputadoraDeNavegacion();
		builder.buildGPS();
		// observar que no llamo al método: buildRuedaDeAuxilio()
		// es la flexibilidad que me permite
	}

	public void construirAutoCivil(Builder builder) {
		builder.buildPuertas();
		builder.buildMotor();
		builder.buildComputadoraDeNavegacion();
		builder.buildGPS();
		builder.buildRuedaDeAuxilio();
	}

}
