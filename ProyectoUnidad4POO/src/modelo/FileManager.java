package modelo;

import java.io.*;
import java.util.ArrayList;

public class FileManager {

	public static ArrayList<ContenidoAudiovisual> LeerContenidosDesdeArchivo(String rutaArchivo) {

		ArrayList<ContenidoAudiovisual> contenidos = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
			String linea;
			while ((linea = br.readLine()) != null) {
				String[] partes = linea.split(",");
				String tipo = partes[0];
				if (tipo.equals("Pelicula")) {
					contenidos.add(new Pelicula(partes[1], Integer.parseInt(partes[2]), partes[3], partes[4]));
				} else if (tipo.equals("SerieDeTV")) {
					contenidos.add(new SerieDeTV(partes[1], Integer.parseInt(partes[2]), partes[3],
							Integer.parseInt(partes[4])));
				} else if (tipo.equals("Documental")) {
					contenidos.add(new Documental(partes[1], Integer.parseInt(partes[2]), partes[3], partes[4]));
				}
			}
		} catch (IOException e) {
			System.out.println("Error al leer el archivo: " + e.getMessage());

		}
		return contenidos;
	}

	public static void guardarContenidosEnArchivo(String rutaArchivo, ArrayList<ContenidoAudiovisual> contenidos) {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(rutaArchivo))) {
			for (ContenidoAudiovisual contenido : contenidos) {
				if (contenido instanceof Pelicula) {
					Pelicula pelicula = (Pelicula) contenido;
					bw.write(String.format("Pelicula, %s,%d,%s\n", pelicula.getTitulo(),
							pelicula.getDuracionEnMinutos(), pelicula.getGenero(), pelicula.getEstudio()));
				} else if (contenido instanceof SerieDeTV) {
					SerieDeTV serie = (SerieDeTV) contenido;
					bw.write(String.format("SerieDeTV,%s,%d,%s,%d\n", serie.getTitulo(), serie.getDuracionEnMinutos(),
							serie.getDuracionEnMinutos(), serie.getGenero(), serie.getTemporadas()));
				} else if (contenido instanceof Documental) {
					Documental documental = (Documental) contenido;
					bw.write(String.format("Documental,%s,%d;%s,%s\n", documental.getTitulo(),
							documental.getDuracionEnMinutos(), documental.getGenero(), documental.getTema()));
				}
			}
		} catch (IOException e) {
			System.out.println("Error al guardar el archivo: " + e.getMessage());
		}
	}

}
