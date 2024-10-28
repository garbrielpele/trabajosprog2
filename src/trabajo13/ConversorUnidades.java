package trabajo13;

import java.util.Scanner;

public class ConversorUnidades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Selecciona el tipo de conversion:");
        System.out.println("1. Longitud");
        System.out.println("2. Peso");
        System.out.println("3. Volumen");
        
        int tipo = scanner.nextInt();
        System.out.print("Introduce el valor a convertir: ");
        double valor = scanner.nextDouble();
        
        switch (tipo) {
            case 1: // Longitud
                LongitudConverter longitudConverter = new LongitudConverter();
                longitudConverter.realizarConversion(scanner, valor);
                break;

            case 2: // Peso
                PesoConverter pesoConverter = new PesoConverter();
                pesoConverter.realizarConversion(scanner, valor);
                break;

            case 3: // Volumen
                VolumenConverter volumenConverter = new VolumenConverter();
                volumenConverter.realizarConversion(scanner, valor);
                break;

            default:
                System.out.println("Tipo de conversion no valido.");
        }

        scanner.close(); // Cierra el escaner
    }
}
