package trabajo13;

import java.util.Scanner;

public class PesoConverter {
    public void realizarConversion(Scanner scanner, double valor) {
        System.out.print("Introduce la unidad a convertir (kilogramos, gramos): ");
        String unidadOrigen = scanner.next();
        System.out.print("Introduce la unidad necesitada (kilogramos, gramos): ");
        String unidadDestino = scanner.next();
        convertirPeso(valor, unidadOrigen, unidadDestino);
    }

    private void convertirPeso(double valor, String origen, String destino) {
        if (origen.equals("kilogramos") && destino.equals("gramos")) {
            System.out.println(valor + " kilogramos = " + (valor * 1000) + " gramos");
        } else if (origen.equals("gramos") && destino.equals("kilogramos")) {
            System.out.println(valor + " gramos = " + (valor / 1000) + " kilogramos");
        } else {
            System.out.println("Error: Unidades incompatibles. Sugerencias: kilogramos <-> gramos");
        }
    }
}
