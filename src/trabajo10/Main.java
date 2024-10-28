package trabajo10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el anio al que deseas viajar: ");
        int anioDestino = Integer.parseInt(scanner.nextLine());

        Viaje viaje = new Viaje(anioDestino);
        viaje.realizarViaje();

        scanner.close(); // Cierra el escáner
    }
}