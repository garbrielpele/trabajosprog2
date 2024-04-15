
package programacion.fase2;

import java.util.Scanner;
public class ejercicio4 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario que ingrese la fecha
        System.out.println("Ingrese la fecha (dia, mes, año):");
        System.out.print("Dia: ");
        int dia = scanner.nextInt();
        System.out.print("Mes: ");
        int mes = scanner.nextInt();
        System.out.print("Año: ");
        int anio = scanner.nextInt();
        
        // Determinar el trimestre
        int trimestre = -1;
        if (mes >= 1 && mes <= 3) {
            trimestre = 1;
        } else if (mes >= 4 && mes <= 6) {
            trimestre = 2;
        } else if (mes >= 7 && mes <= 9) {
            trimestre = 3;
        } else if (mes >= 10 && mes <= 12) {
            trimestre = 4;
        }
        
        // Mostrar el resultado
        if (trimestre != -1) {
            System.out.println("La fecha corresponde al trimestre " + trimestre + ".");
        } else {
            System.out.println("La fecha ingresada no es valida.");
        }
        
        scanner.close();
    }

}
