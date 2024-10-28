package trabajo12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce el consumo total: ");
        
        try {
            double consumo = Double.parseDouble(scanner.nextLine());
            System.out.print("Introduce el monto de la propina: ");
            double propina = Double.parseDouble(scanner.nextLine());
            
            CalculadoraPropinas calculadora = new CalculadoraPropinas(consumo);
            String resultado = calculadora.verificarPropina(propina);
            System.out.println(resultado);
        } catch (NumberFormatException e) {
            System.out.println("Por favor, introduce un numero valido.");
        } finally {
            scanner.close(); // Cierra el escaner
        }
    }
}

