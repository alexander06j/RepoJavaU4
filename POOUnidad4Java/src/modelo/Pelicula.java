package modelo;

import java.util.ArrayList;

public class Pelicula extends ContenidoAudiovisual {

	// Atributos
	private String estudio;
	private ArrayList<Actor> actores;

	// Constructor
	public Pelicula(String titulo, int duracionEnMinutos, String genero, String estudio) {
		super(titulo, duracionEnMinutos, genero);
		this.estudio = estudio;
		this.actores = new ArrayList<>();
	}

	// Metodo
	public void agregarActor(Actor actor) {
		actores.add(actor);
	}

	// Getters y Setters
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
