readme_content = """
# Proyecto de Gestión de Contenidos Audiovisuales

Este proyecto es un sistema para gestionar diferentes tipos de contenidos audiovisuales (Películas, Series de TV y Documentales). Fue diseñado y desarrollado siguiendo principios de diseño y desarrollo como SOLID, MVC, y código limpio.

## **1. Estructura del Proyecto**

### **Modelo**
Contiene las clases de negocio que representan los contenidos audiovisuales y sus relaciones:
- `ContenidoAudiovisual` (clase abstracta).
- Subclases: `Pelicula`, `SerieDeTV`, `Documental`.
- Clases asociadas: `Actor`, `Temporada`, `Investigador`.


### **Controlador**
Coordina la lógica entre el Modelo y la Vista. Gestiona las interacciones del usuario.

### **ArchivoCSV**
Gestión de la persistencia de datos:
- Lectura y escritura de archivos CSV para inicializar y guardar datos.

---

## **2. Instrucciones de Clonación y Ejecución**

### **Requisitos Previos**
- Java 17 o superior.
- Apache Maven.
- Git.

### **Clonar el Repositorio**
```bash
git clone <URL del repositorio>
cd proyecto-multimedia
