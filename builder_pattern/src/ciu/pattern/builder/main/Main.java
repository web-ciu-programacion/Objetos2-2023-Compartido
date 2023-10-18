package ciu.pattern.builder.main;

import ciu.pattern.builder.AutoCivilBuilder;
import ciu.pattern.builder.AutoDeportivoBuilder;
import ciu.pattern.builder.Builder;
import ciu.pattern.builder.Director;
import ciu.pattern.builder.model.Auto;

public class Main {

	public static void main(String[] args) {
		Director director = new Director();
        Builder builder = new AutoDeportivoBuilder();
        director.construirAutoDeportivo(builder);
        Auto autoDeportivo = builder.build();

        builder = new AutoCivilBuilder();
        director.construirAutoCivil(builder);
        Auto autoCivil = builder.build();
//        Auto autoCivil2 = builder.build();
//        Auto autoCivil3 = builder.build();
//        Auto autoCivil4 = builder.build();

        System.out.println(autoDeportivo.toString());
        System.out.println(autoCivil.toString());
	}

}
