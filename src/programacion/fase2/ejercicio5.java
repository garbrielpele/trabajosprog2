
package programacion.fase2;
import java.util.Scanner;
public class ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Ingrese la coordenada x: ");
        int x = scanner.nextInt();
        System.out.print("Ingrese la coordenada y: ");
        int y = scanner.nextInt();
        
        
        String cuadrante = determinarCuadrante(x, y);
        
        
        System.out.println("El punto (" + x + ", " + y + ") se ubica en el " + cuadrante + " cuadrante.");
        
        scanner.close();
    }
    
    public static String determinarCuadrante(int x, int y) {
        if (x > 0 && y > 0) {
            return "primer";
        } else if (x < 0 && y > 0) {
            return "segundo";
        } else if (x < 0 && y < 0) {
            return "tercer";
        } else if (x > 0 && y < 0) {
            return "cuarto";
        } else {
            return "origen";
        }
    }

}
