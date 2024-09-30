package trabajo10;
import java.util.Scanner;

public class ViajeEnElTiempo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce el año al que deseas viajar: ");
        int añoDestino = Integer.parseInt(scanner.nextLine());
        
        if (añoDestino < 1900 || añoDestino > 2100) {
            System.out.println("Viajar tan lejos en el tiempo puede tener muchas consecuencias");
        } else {
            System.out.println("estas en el año " + añoDestino + "disfruta tu estadia pero vuelve pronto para minimizar riesgos");
        }
        
        scanner.close(); // Cierra el escaner
    }
}
