package modelo;

public class Temporada {

	// Atributos
	private int numero;
	private int episodios;

	// Constructor
	public Temporada(int numero, int episodios) {
		this.numero = numero;
		this.episodios = episodios;
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
