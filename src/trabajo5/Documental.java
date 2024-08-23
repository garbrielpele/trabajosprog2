package trabajo5;

public class Documental extends ContenidoMultimedia {
    private String tema;

    public Documental(String titulo, String ano, String clasificacion, int popularidad, int duracion, String tema) {
        this.titulo = titulo;
        this.ano = ano;
        this.clasificacion = clasificacion;
        this.popularidad = popularidad;
        this.duracion = duracion;
        this.tema = tema;
    }

    public String getTema() {
        return tema;
    }
}
