package modelo;

public class Actor extends Pelicula {

	// Atributos
	private String nombreActor;

	public Actor(String titulo, int duracionEnMinutos, String genero, String estudio, String nombreActor) {
		super(titulo, duracionEnMinutos, genero, estudio);
		this.nombreActor = nombreActor;
	}

	public String getNombreActor() {
		return nombreActor;
	}

	public void setNombreActor(String nombreActor) {
		this.nombreActor = nombreActor;
	}

}
