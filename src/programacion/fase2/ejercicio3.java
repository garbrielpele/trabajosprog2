
package programacion.fase2;

import java.util.Scanner;
public class ejercicio3 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un numero positivo de 1 o 2 digitos: ");
        double numero = scanner.nextDouble();
        
      
        if(numero > 0 && numero < 10 && numero % 1 == 0) {
            System.out.println("El numero tiene un digito.");
        } 
      
        else if(numero >= 10 && numero < 100) {
            System.out.println("El número tiene dos digitos.");
        } 
       
        else {
            System.out.println("El numero no cumple con los requisitos.");
        }
        
        scanner.close();
    }
}
