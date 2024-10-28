package trabajo13;

import java.util.Scanner;

public class LongitudConverter {
    public void realizarConversion(Scanner scanner, double valor) {
        System.out.print("Introduce la unidad a convertir (metros, kilometros): ");
        String unidadOrigen = scanner.next();
        System.out.print("Introduce la unidad necesitada (metros, kilometros): ");
        String unidadDestino = scanner.next();
        convertirLongitud(valor, unidadOrigen, unidadDestino);
    }

    private void convertirLongitud(double valor, String origen, String destino) {
        if (origen.equals("metros") && destino.equals("kilometros")) {
            System.out.println(valor + " metros = " + (valor / 1000) + " kilometros");
        } else if (origen.equals("kilometros") && destino.equals("metros")) {
            System.out.println(valor + " kilometros = " + (valor * 1000) + " metros");
        } else {
            System.out.println("Error: Unidades incompatibles. Sugerencias: metros <-> kilometros");
        }
    }
}

