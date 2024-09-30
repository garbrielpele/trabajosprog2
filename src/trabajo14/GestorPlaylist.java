package trabajo14;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestorPlaylist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> playlist = new ArrayList<>();
        
        while (true) {
            System.out.print("Introduce el nombre de la cancion a añadir (o 'salir' para terminar): ");
            String cancion = scanner.nextLine();
            
            if (cancion.equalsIgnoreCase("salir")) {
                break;
            }

            try {
                if (playlist.contains(cancion)) {
                    System.out.println("La cancion ya existe en la playlist.");
                    System.out.print("¿Deseas mover la cancion existente al final de la lista? (si/no): ");
                    String respuesta = scanner.nextLine();
                    
                    if (respuesta.equalsIgnoreCase("si")) {
                        playlist.remove(cancion);
                        playlist.add(cancion);
                        System.out.println("La cancion ha sido movida al final de la playlist.");
                    } else {
                        System.out.println("La cancion no ha sido movida.");
                    }
                } else {
                    playlist.add(cancion);
                    System.out.println("Cancion añadida a la playlist.");
                }
            } catch (Exception e) {
                System.out.println("Ocurrió un error: " + e.getMessage());
            }
        }

        System.out.println("Playlist final:");
        for (String cancion : playlist) {
            System.out.println(cancion);
        }

        scanner.close(); // Cierra el escaner
    }
}
