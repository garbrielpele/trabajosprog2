
package programacion.fase2;
import java.util.Scanner;

public class ProgramacionFase2{
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int nota = obtenerNota(scanner);
        verificarNota(nota);
        
        scanner.close();
    }
    
    public static int obtenerNota(Scanner scanner) {
        System.out.print("Ingrese la nota del alumno: ");
        return scanner.nextInt();
    }
    
    public static void verificarNota(int nota) {
        if (nota < 4) {
            System.out.println("Desaprobado");
        } else if (nota >= 4 && nota < 10) {
            System.out.println("Aprobado");
        } else if (nota == 10) {
            System.out.println("Sobresaliente");
        } else {
            System.out.println("La nota ingresada no es válida");
        }
    }
}
