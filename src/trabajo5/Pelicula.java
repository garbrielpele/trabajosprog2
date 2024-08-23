package trabajo5;

public class Pelicula extends ContenidoMultimedia {
    private String director;

    public Pelicula(String titulo, String ano, String clasificacion, int popularidad, int duracion, String director) {
        this.titulo = titulo;
        this.ano = ano;
        this.clasificacion = clasificacion;
        this.popularidad = popularidad;
        this.duracion = duracion;
        this.director = director;
    }

    public String getDirector() {
        return director;
    }
}

