package numero.mayor;

import java.util.List;

public class PreJava8 implements Strategy {

	@Override
	public Integer mayorEdad(List<Persona> personas) {
		Integer mayor = personas.get(0).getEdad();
		for (Persona persona : personas) {
			if (persona.getEdad()>mayor) {
				mayor = persona.getEdad();
			}
		}
		return mayor;
	}

}
