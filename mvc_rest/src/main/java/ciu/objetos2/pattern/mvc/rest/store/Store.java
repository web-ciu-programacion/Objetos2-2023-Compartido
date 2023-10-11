package ciu.objetos2.pattern.mvc.rest.store;

import java.util.ArrayList;
import java.util.Collection;

import ciu.objetos2.pattern.mvc.rest.model.Persona;

public class Store {

	private static Store instance;
	
	private Collection<Persona> personas;
	
	private Store() {
		this.personas = new ArrayList<Persona>();
	}
	
	public static Store getInstance() {
		if (instance==null) {
			instance = new Store();
		}
		return instance;
	}
	
	public Collection<Persona> findAll() {
		return this.personas;
	}
	
	public Persona add(Persona p) {
		this.personas.add(p);
		return p;
	}
}
