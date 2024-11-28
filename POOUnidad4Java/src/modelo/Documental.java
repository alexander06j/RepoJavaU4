package modelo;

import java.util.ArrayList;

public class Documental extends ContenidoAudiovisual {

	// Atributos
	private String tema;
	private ArrayList<Investigador> investigadores;// Composicion con Investigador

	// Constructor
	public Documental(String titulo, int duracionEnMinutos, String genero, String tema) {
		super(titulo, duracionEnMinutos, genero);
		this.tema = tema;
		this.investigadores = new ArrayList<>();
	}

	// metodo
	public void agregarInvestigador(Investigador investigador) {
		investigadores.add(investigador);
	}

	// getters y setters
	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	// Implementación del método abstracto mostrarDetalles para Documentales
	@Override
	public void mostrarDetalles() {

		System.out.println("Detalles del Documental:");
		System.out.println("ID: " + getId());
		System.out.println("Título: " + getTitulo());
		System.out.println("Duración en minutos: " + getDuracionEnMinutos());
		System.out.println("Género: " + getGenero());
		System.out.println("Tema del documental: " + getTema());
		System.out.println();

	}

}
