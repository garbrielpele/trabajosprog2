package trabajo5;

import java.util.ArrayList;
import java.util.List;

public class Catalogo {
    private List<Pelicula> peliculas;
    private List<Serie> series;
    private List<Documental> documentales;

    public Catalogo() {
        this.peliculas = new ArrayList<>();
        this.series = new ArrayList<>();
        this.documentales = new ArrayList<>();
    }

    public void añadirPelicula(Pelicula pelicula) {
        peliculas.add(pelicula);
        System.out.println("Película añadida: " + pelicula.getTitulo());
    }

    public void añadirSerie(Serie serie) {
        series.add(serie);
        System.out.println("Serie añadida: " + serie.getTitulo());
    }

    public void añadirDocumental(Documental documental) {
        documentales.add(documental);
        System.out.println("Documental añadido: " + documental.getTitulo());
    }

    public void buscarSeriePorTitulo(String titulo) {
        boolean encontrada = false;
        for (Serie serie : series) {
            if (serie.getTitulo().equalsIgnoreCase(titulo)) {
                encontrada = true;
                System.out.println("Serie encontrada: " + serie.getTitulo());
                break;
            }
        }
        if (!encontrada) {
            System.out.println("Serie no encontrada: " + titulo);
        }
    }

    public void eliminarDocumental(Documental documental) {
        if (documentales.remove(documental)) {
            System.out.println("Documental eliminado: " + documental.getTitulo());
        } else {
            System.out.println("Documental no encontrado: " + documental.getTitulo());
        }
    }
}
