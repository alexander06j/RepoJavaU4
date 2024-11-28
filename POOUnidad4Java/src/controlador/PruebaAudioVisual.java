package controlador;
import modelo.*;
import java.io.*;
import java.util.*;

public class PruebaAudioVisual {
	
	private static List<ContenidoAudiovisual> contenidos = new ArrayList<>();
    private static final String RUTA_ARCHIVO = "C:\\Documentosgeneral\\Archivo.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            mostrarMenu();
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1 -> cargarDatos();
                case 2 -> guardarDatos();
                case 3 -> mostrarDetalles();
                case 4 -> agregarContenido(scanner);
                case 5 -> System.out.println("Saliendo del sistema...");
                default -> System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 5);

        scanner.close();
    }

    private static void mostrarMenu() {
        System.out.println("\n=== Menú de Contenidos Audiovisuales ===");
        System.out.println("1. Cargar datos desde archivo");
        System.out.println("2. Guardar datos en archivo");
        System.out.println("3. Mostrar detalles de los contenidos");
        System.out.println("4. Agregar nuevo contenido");
        System.out.println("5. Salir");
        System.out.println("=======================================");
    }

    private static void cargarDatos() {
        try (BufferedReader br = new BufferedReader(new FileReader(RUTA_ARCHIVO))) {
            contenidos.clear();
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                switch (datos[0].toLowerCase()) {
                    case "pelicula" -> contenidos.add(new Pelicula(datos[1], Integer.parseInt(datos[2]), datos[3], datos[4]));
                    case "seriedetv" -> contenidos.add(new SerieDeTV(datos[1], Integer.parseInt(datos[2]), datos[3], Integer.parseInt(datos[4])));
                    case "documental" -> contenidos.add(new Documental(datos[1], Integer.parseInt(datos[2]), datos[3], datos[4]));
                    default -> System.out.println("Tipo desconocido en el archivo: " + datos[0]);
                }
            }
            System.out.println("Datos cargados correctamente.");
        } catch (IOException e) {
            System.err.println("Error al cargar los datos: " + e.getMessage());
        }
    }

    private static void guardarDatos() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(RUTA_ARCHIVO))) {
            for (ContenidoAudiovisual contenido : contenidos) {
                if (contenido instanceof Pelicula pelicula) {
                    bw.write(String.format("Pelicula,%s,%d,%s,%s%n", pelicula.getTitulo(), pelicula.getDuracionEnMinutos(), pelicula.getGenero(), pelicula.getEstudio()));
                } else if (contenido instanceof SerieDeTV serie) {
                    bw.write(String.format("SerieDeTV,%s,%d,%s,%d%n", serie.getTitulo(), serie.getDuracionEnMinutos(), serie.getGenero(), serie.getTemporadas()));
                } else if (contenido instanceof Documental documental) {
                    bw.write(String.format("Documental,%s,%d,%s,%s%n", documental.getTitulo(), documental.getDuracionEnMinutos(), documental.getGenero(), documental.getTema()));
                }
            }
            System.out.println("Datos guardados correctamente.");
        } catch (IOException e) {
            System.err.println("Error al guardar los datos: " + e.getMessage());
        }
    }

    private static void mostrarDetalles() {
        if (contenidos.isEmpty()) {
            System.out.println("No hay contenidos para mostrar.");
            return;
        }
        for (ContenidoAudiovisual contenido : contenidos) {
            contenido.mostrarDetalles();
        }
    }

    private static void agregarContenido(Scanner scanner) {
        System.out.println("Seleccione el tipo de contenido a agregar:");
        System.out.println("1. Película");
        System.out.println("2. Serie de TV");
        System.out.println("3. Documental");

        int tipo = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer

        System.out.print("Título: ");
        String titulo = scanner.nextLine();
        System.out.print("Duración en minutos: ");
        int duracion = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer
        System.out.print("Género: ");
        String genero = scanner.nextLine();

        switch (tipo) {
            case 1 -> {
                System.out.print("Estudio: ");
                String estudio = scanner.nextLine();
                contenidos.add(new Pelicula(titulo, duracion, genero, estudio));
            }
            case 2 -> {
                System.out.print("Número de temporadas: ");
                int temporadas = scanner.nextInt();
                contenidos.add(new SerieDeTV(titulo, duracion, genero, temporadas));
            }
            case 3 -> {
                System.out.print("Tema: ");
                String tema = scanner.nextLine();
                contenidos.add(new Documental(titulo, duracion, genero, tema));
            }
            default -> System.out.println("Opción no válida.");
        }

        System.out.println("Contenido agregado correctamente.");
    }

}
