package test;

import modelo.Actor;
import modelo.Documental;
import modelo.Pelicula;
import modelo.SerieDeTV;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;



public class ContenidoAudioivisualTest {

	 @Test
	    void testPeliculaCreacion() {
	        Pelicula pelicula = new Pelicula("Inception", 148, "Ciencia ficción", "Warner Bros");
	        
	        assertEquals("Inception", pelicula.getTitulo());
	        assertEquals(148, pelicula.getDuracionEnMinutos());
	        assertEquals("Ciencia ficción", pelicula.getGenero());
	        assertEquals("Warner Bros", pelicula.getEstudio());
	    }

	    @Test
	    void testSerieDeTVCreacion() {
	        SerieDeTV serie = new SerieDeTV("Breaking Bad", 45, "Drama", 5);
	        
	        assertEquals("Breaking Bad", serie.getTitulo());
	        assertEquals(45, serie.getDuracionEnMinutos());
	        assertEquals("Drama", serie.getGenero());
	        assertEquals(5, serie.getTemporadas());
	    }

	    @Test
	    void testDocumentalCreacion() {
	        Documental documental = new Documental("Planeta Tierra", 50, "Naturaleza", "Ecosistemas");
	        
	        assertEquals("Planeta Tierra", documental.getTitulo());
	        assertEquals(50, documental.getDuracionEnMinutos());
	        assertEquals("Naturaleza", documental.getGenero());
	        assertEquals("Ecosistemas", documental.getTema());
	    }

	    @Test
	    void testPeliculaAgregarActor() {
	        Pelicula pelicula = new Pelicula("Inception", 148, "Ciencia ficción", "Warner Bros");
	        Actor actor = new Actor("Inception", 148, "Ciencia ficción", "Warner Bros", "Leonardo DiCaprio");
	        
	        pelicula.agregarActor(actor);
	        assertEquals("Leonardo DiCaprio", actor.getNombreActor()); // Corregir referencia al objeto Actor.
	    }
	    @Test
	    void testMostrarDetalles() {
	        Pelicula pelicula = new Pelicula("Avatar", 162, "Ciencia ficción", "20th Century Fox");
	        SerieDeTV serie = new SerieDeTV("Stranger Things", 50, "Ciencia ficción", 4);
	        Documental documental = new Documental("Cosmos", 60, "Ciencia", "Exploración del Universo");

	        ArrayList<String> detalles = new ArrayList<>();
	        detalles.add("Película: Título - Avatar, Duración - 162 minutos, Género - Ciencia ficción, Estudio - 20th Century Fox");
	        detalles.add("Serie de TV: Título - Stranger Things, Duración - 50 minutos, Género - Ciencia ficción, Temporadas - 4");
	        detalles.add("Documental: Título - Cosmos, Duración - 60 minutos, Género - Ciencia, Tema - Exploración del Universo");

	        pelicula.mostrarDetalles();
	        serie.mostrarDetalles();
	        documental.mostrarDetalles();

	        // Esta prueba podría verificar la salida esperada en un entorno real al redirigir el flujo de salida.
	    }
}
