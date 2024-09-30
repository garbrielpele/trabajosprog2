package trabajo11;
import java.util.Scanner;

public class VerificacionEdad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce tu edad: ");
        
        try {
            int edad = Integer.parseInt(scanner.nextLine());
            
            if (edad < 13) {
                System.out.println("Eres menor de la edad permitida. No puedes registrarte en esta red social.");
                System.out.println("Por favor, visita las siguientes paginas para mas opciones:");
                System.out.println("1. https://www.kidfriendlysite.com");
                System.out.println("2. https://www.teensocial.com");
            } else {
                System.out.println("Bienvenido a la red social");
            }
        } catch (NumberFormatException e) {
            System.out.println("Por favor, introduce un numero valido para la edad.");
        } finally {
            scanner.close(); // Cierra el escaner
        }
    }
}

