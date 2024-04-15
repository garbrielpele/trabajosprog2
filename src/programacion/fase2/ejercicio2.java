
package programacion.fase2;
import java.util.Scanner;
public class ejercicio2 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese las notas de los tres parciales:");
        double nota1 = obtenerNota(scanner, "Parcial 1");
        double nota2 = obtenerNota(scanner, "Parcial 2");
        double nota3 = obtenerNota(scanner, "Parcial 3");
        
        double promedio = calcularPromedio(nota1, nota2, nota3);
        
        if (promedio >= 8) {
            System.out.println("El alumno está promocionado con un promedio de " + promedio);
        } else {
            System.out.println("El alumno no está promocionado. Su promedio es " + promedio);
        }
        
        scanner.close();
    }
    
    public static double obtenerNota(Scanner scanner, String nombreParcial) {
        System.out.print("Ingrese la nota del " + nombreParcial + ": ");
        return scanner.nextDouble();
    }
    
    public static double calcularPromedio(double nota1, double nota2, double nota3) {
        return (nota1 + nota2 + nota3) / 3;
    }
}


