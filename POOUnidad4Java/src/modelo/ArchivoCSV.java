package modelo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ArchivoCSV {
	
	//Metodo de lectura
	public static List<ContenidoAudiovisual> leerDesdeArchivo(String rutaArchivo) throws IOException {
		List<ContenidoAudiovisual> contenidos = new ArrayList<>();
		
		try(BufferedReader br = new BufferedReader(new FileReader("C:\\Documentosgeneral\\Archivo.txt"))){
			String linea;
			while((linea = br.readLine()) !=null) {
				String[] datos = linea.split(",");
				//Identificar el tipo de contenido y crear instancias
				if (datos[0].equalsIgnoreCase("Pelicula")) {
					contenidos.add(new Pelicula(datos[1], Integer.parseInt(datos[2]), datos[3], datos[4]));
				}else if(datos[0].equalsIgnoreCase("SerieDeTV")) {
					contenidos.add(new SerieDeTV(datos[1], Integer.parseInt(datos[2]), datos[3], Integer.parseInt(datos[4])));
				}else if(datos[0].equalsIgnoreCase("Documental")) {
					contenidos.add(new Documental(datos[1], Integer.parseInt(datos[2]), datos[3], datos[4]));
				}
			}
		}
		return contenidos;
	}

	public static void escribirEnArchivo(String rutaArchivo, List<ContenidoAudiovisual> contenidos) throws IOException{
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Documentosgeneral\\Archivo.txt"))){
			for(ContenidoAudiovisual contenido : contenidos) {
				if(contenido instanceof Pelicula) {
					Pelicula pelicula = (Pelicula) contenido;
					bw.write(String.format("Pelicula,%s,%d,%s,%s,%s\n",pelicula.getTitulo(), pelicula.getDuracionEnMinutos(), pelicula.getGenero(), pelicula.getEstudio()));
				} else if (contenido instanceof SerieDeTV) {
					SerieDeTV serie = (SerieDeTV) contenido;
					bw.write(String.format("SerieDeTV,%s,%d,%s,%d\n", serie.getTitulo(), serie.getDuracionEnMinutos(), serie.getGenero(), serie.getTemporadas()));
				}else if (contenido instanceof Documental) {
					Documental documental = (Documental) contenido;
					bw.write(String.format("Documental,%s,%d,%s,%s\n", documental.getTitulo(), documental.getDuracionEnMinutos(), documental.getGenero(), documental.getTema()));
				}
				
			}
		}
	}
	
}
