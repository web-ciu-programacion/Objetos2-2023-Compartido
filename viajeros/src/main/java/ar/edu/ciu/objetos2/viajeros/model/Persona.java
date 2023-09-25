package ar.edu.ciu.objetos2.viajeros.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public abstract class Persona {

	// atributos
	private String nombre;
	private String apellido;
	private Collection<Viaje> viajesRealizados;
	
	// constructor
	public Persona(String nombre, String apellido) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.viajesRealizados = new ArrayList<Viaje>();
	}
	
	// metodos abstractos
	public abstract Collection<Pais> enQuePaisesResidioEn(Integer anio);

	// metodos
	public void realizarViaje(Pais paisDestino, Integer anio) {
		this.viajesRealizados.add(new Viaje(paisDestino, anio));
	}

	public Collection<Pais> enQuePaisesEstuvo(Integer anio) {
		// collection auxiliar donde agrego los paises que residio y viajo
		Collection<Pais> paises = new ArrayList<Pais>();

		// agrego los paises que residio
		Collection<Pais> paisesResidio = this.enQuePaisesResidioEn(anio);
		paisesResidio.stream()
						.forEach( pais -> paises.add(pais));

		// agrego los paises que viajo
		this.viajesRealizados.stream()
								.filter(viaje -> viaje.getAnio().equals(anio))
								.map(viaje -> viaje.getPaisDestino())
								.forEach( pais -> paises.add(pais));
		return paises;
	}

	public Boolean coincidioCon(Persona otraPersona, Integer anio) {
		Collection<Pais> paisesEstaPersona = this.enQuePaisesEstuvo(anio);
		Collection<Pais> paisesOtraPersona = otraPersona.enQuePaisesEstuvo(anio);
		Collection<Pais> intersection = paisesEstaPersona.stream()
															//.filter(paisesOtraPersona::contains) // Lo mismo de la linea de abajo.
															.filter(p -> paisesOtraPersona.contains(p))
															.collect(Collectors.toList());
		return intersection!=null && intersection.size()>0;
	}

	// gets y sets
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Collection<Viaje> getViajesRealizados() {
		return viajesRealizados;
	}

	public void setViajesRealizados(Collection<Viaje> viajesRealizados) {
		this.viajesRealizados = viajesRealizados;
	}
	
}
