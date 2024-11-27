package modelo;

public abstract class ContenidoAudiovisual {

	// atributos
	private static int contar = 0;
	private String titulo;
	private int duracionEnMinutos;
	private String genero;
	private int id;

	// Constructor
	public ContenidoAudiovisual(String titulo, int duracionEnMinutos, String genero) {
		this.id = contar++;
		this.titulo = titulo;
		this.duracionEnMinutos = duracionEnMinutos;
		this.genero = genero;
		
	}

	// Getters and Setters
	public static int getContar() {
		return contar;
	}

	public static void setContar(int contar) {
		ContenidoAudiovisual.contar = contar;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getDuracionEnMinutos() {
		return duracionEnMinutos;
	}

	public void setDuracionEnMinutos(int duracionEnMinutos) {
		this.duracionEnMinutos = duracionEnMinutos;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	//Metodo abstracto
	public abstract void mostrarDetalles();
}
