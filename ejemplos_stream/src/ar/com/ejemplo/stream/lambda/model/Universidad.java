package ar.com.ejemplo.stream.lambda.model;

import java.util.ArrayList;
import java.util.Collection;

import ar.com.ejemplo.stream.lambda.factory.PaisesFactory;
import ar.com.ejemplo.stream.lambda.factory.SexoFactory;

public class Universidad {

	// atributos
	private Collection<Estudiante> estudiantes;

	// constructor
	public Universidad() {
		super();
		this.estudiantes = new ArrayList<Estudiante>();
		this.inicializar();
	}

	// metodos
	private void inicializar() {
		this.agregarEstudieante(new Estudiante("1-00001-01", "Romero", "Madero", SexoFactory.getMasculino(), PaisesFactory.getArgentina()));
		this.agregarEstudieante(new Estudiante("9-09001-99", "Alicia", "La Patricia", SexoFactory.getFemenina(), PaisesFactory.getBolivia()));
		this.agregarEstudieante(new Estudiante("1-09002-05", "Gregorio", "Pompim", SexoFactory.getMasculino(), PaisesFactory.getArgentina()));
		this.agregarEstudieante(new Estudiante("1-09003-05", "Abel", "Flegenal", SexoFactory.getMasculino(), PaisesFactory.getArgentina()));
		this.agregarEstudieante(new Estudiante("1-09004-01", "Alfonsina", "Storni", SexoFactory.getFemenina(), PaisesFactory.getArgentina()));
		this.agregarEstudieante(new Estudiante("1-09005-01", "Carlos", "Obrero", SexoFactory.getMasculino(), PaisesFactory.getArgentina()));
		this.agregarEstudieante(new Estudiante("1-09006-01", "Mauricio", "Parasito", SexoFactory.getMasculino(), PaisesFactory.getArgentina()));
		this.agregarEstudieante(new Estudiante("9-09006-99", "Pepe", "Mujica", SexoFactory.getMasculino(), PaisesFactory.getUruguay()));
	}

	public void agregarEstudieante(Estudiante estuduante) {
		this.estudiantes.add(estuduante);
	}

	// gets
	public Collection<Estudiante> getEstudiantes() {
		return estudiantes;
	}

}
