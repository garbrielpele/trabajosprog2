package trabajo5;

public class ContenidoMultimedia {
    protected String titulo;
    protected String ano;
    protected String clasificacion;
    protected int popularidad;
    protected int duracion;

    public String getTitulo() {
        return titulo;
    }

    public String getAno() {
        return ano;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public int getPopularidad() {
        return popularidad;
    }

    public int getDuracion() {
        return duracion;
    }

    public void reproducir() {
        System.out.println("Reproduciendo: " + titulo);
    }

    public void pausar() {
        System.out.println("Pausa en: " + titulo);
    }

    public void mostrarPopularidad() {
        String estrellas = "*".repeat(Math.min(popularidad, 5));
        System.out.println("Popularidad de " + titulo + ": " + estrellas);
    }

    public void mostrarDuracion() {
        String duracionTexto;
        if (duracion <= 1) {
            duracionTexto = "1 hora";
        } else if (duracion <= 2) {
            duracionTexto = "2 horas";
        } else if (duracion <= 3) {
            duracionTexto = "3 horas";
        } else if (duracion <= 4) {
            duracionTexto = "4 horas";
        } else {
            duracionTexto = "Desconocida";
        }
        System.out.println("Duración de " + titulo + ": " + duracionTexto);
    }
}
