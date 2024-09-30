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
                System.out.print("Introduce la unidad a convertir (metros, kilometros): ");
                String unidadOrigenL = scanner.next();
                System.out.print("Introduce la unidad necesitada (metros, kilometros): ");
                String unidadDestinoL = scanner.next();
                convertirLongitud(valor, unidadOrigenL, unidadDestinoL);
                break;

            case 2: // Peso
                System.out.print("Introduce la unidad a convertir (kilogramos, gramos): ");
                String unidadOrigenP = scanner.next();
                System.out.print("Introduce la unidad necesitada (kilogramos, gramos): ");
                String unidadDestinoP = scanner.next();
                convertirPeso(valor, unidadOrigenP, unidadDestinoP);
                break;
                

            case 3: // Volumen
                System.out.print("Introduce la unidad a convertir (litros, mililitros): ");
                String unidadOrigenV = scanner.next();
                System.out.print("Introduce la unidad necesitada (litros, mililitros): ");
                String unidadDestinoV = scanner.next();
                convertirVolumen(valor, unidadOrigenV, unidadDestinoV);
                break;

            default:
                System.out.println("Tipo de conversion no valido.");
        }

        scanner.close(); // Cierra el escaner
    }

    private static void convertirLongitud(double valor, String origen, String destino) {
        if (origen.equals("metros") && destino.equals("kilometros")) {
            System.out.println(valor + " metros = " + (valor / 1000) + " kilometros");
        } else if (origen.equals("kilometros") && destino.equals("metros")) {
            System.out.println(valor + " kilometros = " + (valor * 1000) + " metros");
        } else {
            System.out.println("Error: Unidades incompatibles. Sugerencias: metros <-> kilometros");
        }
    }

    private static void convertirPeso(double valor, String origen, String destino) {
        if (origen.equals("kilogramos") && destino.equals("gramos")) {
            System.out.println(valor + " kilogramos = " + (valor * 1000) + " gramos");
        } else if (origen.equals("gramos") && destino.equals("kilogramos")) {
            System.out.println(valor + " gramos = " + (valor / 1000) + " kilogramos");
        } else {
            System.out.println("Error: Unidades incompatibles. Sugerencias: kilogramos <-> gramos");
        }
    }

    private static void convertirVolumen(double valor, String origen, String destino) {
        if (origen.equals("litros") && destino.equals("mililitros")) {
            System.out.println(valor + " litros = " + (valor * 1000) + " mililitros");
        } else if (origen.equals("mililitros") && destino.equals("litros")) {
            System.out.println(valor + " mililitros = " + (valor / 1000) + " litros");
        } else {
            System.out.println("Error: Unidades incompatibles. Sugerencias: litros <-> mililitros");
        }
    }
}
