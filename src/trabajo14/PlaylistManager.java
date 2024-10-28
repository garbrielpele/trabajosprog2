package trabajo14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PlaylistManager {
    private List<String> playlist;

    public PlaylistManager() {
        this.playlist = new ArrayList<>();
    }

    public void addOrMoveCancion(String cancion, Scanner scanner) {
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

    public void mostrarPlaylist() {
        for (String cancion : playlist) {
            System.out.println(cancion);
        }
    }
}
