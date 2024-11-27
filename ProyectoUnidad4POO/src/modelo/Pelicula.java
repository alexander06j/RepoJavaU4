package modelo;

import java.util.ArrayList;

public class Pelicula extends ContenidoAudiovisual {

	// Atributos
	private String estudio;
	private ArrayList<Actor>actores; //Asosiacion con Actor
	

	// Constructor
	public Pelicula(String titulo, int duracionEnMinutos, String genero, String estudio) {
		super(titulo, duracionEnMinutos, genero);
		this.estudio = estudio;
		this.actores = new ArrayList<>();//Lista de actores vacia
	}

	//metodo 
	public void agregarActor(Actor actor) {
		actores.add(actor);
	}
	
	// Getters and Setters
	public String getEstudio() {
		return estudio;
	}

	public void setEstudio(String estudio) {
		this.estudio = estudio;
	}

	@Override
	public void mostrarDetalles() {

		System.out.println("Detalles de la película: ");
		System.out.println("ID: " + getId());
		System.out.println("Título: " + getTitulo());
		System.out.println("Duración en minutos: " + getDuracionEnMinutos());
		System.out.println("Género: " + getGenero());
		System.out.println("Estudio: " + estudio);
		System.out.println();
		System.out.println("--------------------------");

	}

}
