package trabajo5;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nombre;
    private String contrasena;
    private List<ContenidoMultimedia> favoritos;
    private List<ContenidoMultimedia> historial;

    public Usuario(String nombre, String contrasena) {
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.favoritos = new ArrayList<>();
        this.historial = new ArrayList<>();
    }

    public void agregarAFavoritos(ContenidoMultimedia contenido) {
        if (!favoritos.contains(contenido)) {
            favoritos.add(contenido);
            System.out.println(contenido.getTitulo() + " añadido a favoritos.");
        }
    }

    public void agregarAHistorial(ContenidoMultimedia contenido) {
        if (!historial.contains(contenido)) {
            historial.add(contenido);
            System.out.println(contenido.getTitulo() + " añadido al historial.");
        }
    }

    public void mostrarFavoritos() {
        System.out.println("Favoritos de " + nombre + ":");
        for (ContenidoMultimedia contenido : favoritos) {
            System.out.println("- " + contenido.getTitulo());
        }
    }

    public void mostrarHistorial() {
        System.out.println("Historial de " + nombre + ":");
        for (ContenidoMultimedia contenido : historial) {
            System.out.println("- " + contenido.getTitulo());
        }
    }
}
