package modelo;

import java.util.ArrayList;

public class SerieDeTV extends ContenidoAudiovisual {

	// Atributos
	private int temporadas;
	private ArrayList<Temporada> listaTemporadas;

	// Constructor
	public SerieDeTV(String titulo, int duracionEnMinutos, String genero, int temporadas) {
		super(titulo, duracionEnMinutos, genero);
		this.temporadas = temporadas;
		this.listaTemporadas = new ArrayList<>();
	}

	// Metodo
	public void agregarTemporada(Temporada temporada) {
		listaTemporadas.add(temporada);
	}

	// Getters and Setters
	public int getTemporadas() {
		return temporadas;
	}

	public void setTemporadas(int tempordas) {
		this.temporadas = tempordas;
	}

	@Override
	public void mostrarDetalles() {
		System.out.println("Detalles de la Serie de TV:");
		System.out.println("ID: " + getId());
		System.out.println("Título: " + getTitulo());
		System.out.println("Duración en minutos: " + getDuracionEnMinutos());
		System.out.println("Género: " + getGenero());
		System.out.println("Numero de temporadas: " + getTemporadas());
		System.out.println();

	}

}
