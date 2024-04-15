
package programacion.fase2;

import java.util.Scanner;
public class ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de triángulos: ");
        int cantidadTriangulos = scanner.nextInt();
        
        int equilateros = 0;
        int isoceles = 0;
        int escalenos = 0;
        
        int menorCantidad = Integer.MAX_VALUE;
        String tipoMenorCantidad = "";
        
        for (int i = 1; i <= cantidadTriangulos; i++) {
            System.out.println("\nTriángulo #" + i + ":");
            System.out.print("Ingrese el lado 1: ");
            double lado1 = scanner.nextDouble();
            System.out.print("Ingrese el lado 2: ");
            double lado2 = scanner.nextDouble();
            System.out.print("Ingrese el lado 3: ");
            double lado3 = scanner.nextDouble();
            
            if (esEquilatero(lado1, lado2, lado3)) {
                equilateros++;
            } else if (esIsoceles(lado1, lado2, lado3)) {
                isoceles++;
            } else {
                escalenos++;
            }
        }
        
        
        if (equilateros < menorCantidad) {
            menorCantidad = equilateros;
            tipoMenorCantidad = "equilátero";
        }
        if (isoceles < menorCantidad) {
            menorCantidad = isoceles;
            tipoMenorCantidad = "isósceles";
        }
        if (escalenos < menorCantidad) {
            menorCantidad = escalenos;
            tipoMenorCantidad = "escaleno";
        }
        
       
        System.out.println("\nCantidad de triángulos:");
        System.out.println("Equiláteros: " + equilateros);
        System.out.println("Isósceles: " + isoceles);
        System.out.println("Escalenos: " + escalenos);
        
        System.out.println("\nEl tipo de triángulo con menor cantidad es: " + tipoMenorCantidad + " (" + menorCantidad + " triángulos)");
        
        scanner.close();
    }
    
    public static boolean esEquilatero(double lado1, double lado2, double lado3) {
        return lado1 == lado2 && lado2 == lado3;
    }
    
    public static boolean esIsoceles(double lado1, double lado2, double lado3) {
        return lado1 == lado2 || lado1 == lado3 || lado2 == lado3;
    }

}
