package trabajo5;

public class Serie extends ContenidoMultimedia {
    private int capitulos;
    private int temporadas;

    public Serie(String titulo, String ano, String clasificacion, int popularidad, int duracion, int capitulos, int temporadas) {
        this.titulo = titulo;
        this.ano = ano;
        this.clasificacion = clasificacion;
        this.popularidad = popularidad;
        this.duracion = duracion;
        this.capitulos = capitulos;
        this.temporadas = temporadas;
    }

    public int getCapitulos() {
        return capitulos;
    }

    public int getTemporadas() {
        return temporadas;
    }
}
