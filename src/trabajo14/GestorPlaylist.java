package trabajo14;

import java.util.Scanner;

public class GestorPlaylist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PlaylistManager playlistManager = new PlaylistManager();
        
        while (true) {
            System.out.print("Introduce el nombre de la cancion a añadir (o 'salir' para terminar): ");
            String cancion = scanner.nextLine();
            
            if (cancion.equalsIgnoreCase("salir")) {
                break;
            }

            playlistManager.addOrMoveCancion(cancion, scanner);
        }

        System.out.println("Playlist final:");
        playlistManager.mostrarPlaylist();

        scanner.close(); // Cierra el escaner
    }
}
