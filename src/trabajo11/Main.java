package trabajo11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RedSocial redSocial = new RedSocial();
        
        System.out.print("Introduce tu edad: ");
        
        try {
            int edad = Integer.parseInt(scanner.nextLine());
            redSocial.verificarEdad(edad);
        } catch (NumberFormatException e) {
            System.out.println("Por favor, introduce un numero valido para la edad.");
        } finally {
            scanner.close(); // Cierra el escaner
        }
    }
}
