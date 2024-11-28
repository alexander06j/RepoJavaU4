package modelo;

import java.util.ArrayList;

public class Investigador extends Documental {

	// Atributos
	private String nombre;
	private ArrayList<Investigador> investigadores;

	// Constructor
	public Investigador(String titulo, int duracionEnMinutos, String genero, String tema, String nombre,
			ArrayList<Investigador> investigadores) {
		super(titulo, duracionEnMinutos, genero, tema);
		this.nombre = nombre;
		this.investigadores = new ArrayList<Investigador>();
	}

	public void agregarInvestigador(Investigador investigador) {
		investigadores.add(investigador);
	}

	// Getters and Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
