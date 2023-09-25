package numero.mayor;

import java.util.Comparator;
import java.util.List;

public class PostJava8 implements Strategy {

	@Override
	public Integer mayorEdad(List<Persona> personas) {
		return personas.stream()
						.max(new Comparator<Persona>() {
							@Override
							public int compare(Persona p0, Persona p1) {
								return p0.getEdad().compareTo(p1.getEdad());
							}
						})
						.get()
						.getEdad();
	}

}
