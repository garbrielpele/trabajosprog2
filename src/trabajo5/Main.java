package trabajo5;

public class Main {
    public static void main(String[] args) {
        // Crear el catálogo
        Catalogo catalogo = new Catalogo();

        // Crear contenidos
        Pelicula pelicula1 = new Pelicula("Inception", "2010", "Ciencia Ficción", 4, 2, "Christopher Nolan");
        Pelicula pelicula2 = new Pelicula("The Shawshank Redemption", "1994", "Drama", 5, 2, "Frank Darabont");
        Pelicula pelicula3 = new Pelicula("The Matrix", "1999", "Acción", 4, 2, "Lana Wachowski, Lilly Wachowski");

        Serie serie1 = new Serie("Breaking Bad", "2008", "Drama", 5, 1, 62, 5);
        Serie serie2 = new Serie("Stranger Things", "2016", "Ciencia Ficción", 4, 1, 34, 4);
        Serie serie3 = new Serie("Game of Thrones", "2011", "Fantasia", 5, 1, 73, 8);

        Documental documental1 = new Documental("Planet Earth", "2006", "Naturaleza", 5, 4, "Vida Salvaje");
        Documental documental2 = new Documental("The Social Dilemma", "2020", "Tecnología", 4, 2, "Redes Sociales");
        Documental documental3 = new Documental("13th", "2016", "Política", 4, 2, "Sistema Penal en EE.UU.");

        // Añadir contenidos al catálogo
        catalogo.añadirPelicula(pelicula1);
        catalogo.añadirPelicula(pelicula2);
        catalogo.añadirPelicula(pelicula3);

        catalogo.añadirSerie(serie1);
        catalogo.añadirSerie(serie2);
        catalogo.añadirSerie(serie3);

        catalogo.añadirDocumental(documental1);
        catalogo.añadirDocumental(documental2);
        catalogo.añadirDocumental(documental3);

        // Buscar serie
        catalogo.buscarSeriePorTitulo("Stranger Things");

        // Eliminar documental
        catalogo.eliminarDocumental(documental2);

        // Crear usuario
        Usuario usuario = new Usuario("gabriel", "383700174");

        // Añadir a favoritos y historial
        usuario.agregarAFavoritos(pelicula1);
        usuario.agregarAFavoritos(serie1);
        usuario.agregarAHistorial(documental1);
        usuario.agregarAHistorial(pelicula2);

        // Mostrar favoritos y historial
        usuario.mostrarFavoritos();
        usuario.mostrarHistorial();
    }
}
