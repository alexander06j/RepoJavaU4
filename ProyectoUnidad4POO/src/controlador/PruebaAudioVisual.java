package controlador;

import java.util.ArrayList;

import modelo.ContenidoAudiovisual;
import modelo.Documental;
import modelo.FileManager;
import modelo.Pelicula;
import modelo.SerieDeTV;

public class PruebaAudioVisual {

	public static void main(String[] args) {

		String rutaArchivo = "contenidos.csv";
		ArrayList<ContenidoAudiovisual> contenidos = FileManager.LeerContenidosDesdeArchivo();

//
//		System.out.println("¡¡HELLO!!");

//		// Crear instancias de las subclases
//		ContenidoAudiovisual[] contenidos = new ContenidoAudiovisual[3];
//		contenidos[0] = new Pelicula("Avatar", 125, "Accion", "20th Century Studios");
//		contenidos[1] = new SerieDeTV("Game of Thrones", 60, "Fantasy", 8);
//		contenidos[2] = new Documental("Cosmos", 45, "Science", "Astronomy");

		// Mostrar los detalles de cada contenido audiovisual
		for (ContenidoAudiovisual contenido : contenidos) {
			contenido.mostrarDetalles();

		}

	}

}
