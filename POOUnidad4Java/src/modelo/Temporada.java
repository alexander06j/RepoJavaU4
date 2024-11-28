package modelo;

import java.util.ArrayList;

public class Temporada extends SerieDeTV {

	// Atributos
	private int numero;
	private int episodios;
	private ArrayList<Temporada> listaTemporadas;

	// Constructor
	public Temporada(String titulo, int duracionEnMinutos, String genero, int temporadas, int numero, int episodios,
			ArrayList<Temporada> listaTemporadas) {
		super(titulo, duracionEnMinutos, genero, temporadas);
		this.numero = numero;
		this.episodios = episodios;
		this.listaTemporadas = new ArrayList<Temporada>();
	}

	// metodo
	public void agregarTemporada(Temporada temporada) {
		listaTemporadas.add(temporada);
	}

	// Getters and Setters
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getEpisodios() {
		return episodios;
	}

	public void setEpisodios(int episodios) {
		this.episodios = episodios;
	}

}
