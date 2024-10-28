package trabajo13;

import java.util.Scanner;

public class VolumenConverter {
    public void realizarConversion(Scanner scanner, double valor) {
        System.out.print("Introduce la unidad a convertir (litros, mililitros): ");
        String unidadOrigen = scanner.next();
        System.out.print("Introduce la unidad necesitada (litros, mililitros): ");
        String unidadDestino = scanner.next();
        convertirVolumen(valor, unidadOrigen, unidadDestino);
    }

    private void convertirVolumen(double valor, String origen, String destino) {
        if (origen.equals("litros") && destino.equals("mililitros")) {
            System.out.println(valor + " litros = " + (valor * 1000) + " mililitros");
        } else if (origen.equals("mililitros") && destino.equals("litros")) {
            System.out.println(valor + " mililitros = " + (valor / 1000) + " litros");
        } else {
            System.out.println("Error: Unidades incompatibles. Sugerencias: litros <-> mililitros");
        }
    }
}
