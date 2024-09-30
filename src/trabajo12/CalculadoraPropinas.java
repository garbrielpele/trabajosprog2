package trabajo12;
import java.util.Scanner;

public class CalculadoraPropinas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce el consumo total: ");
        
        try {
            double consumo = Double.parseDouble(scanner.nextLine());
            System.out.print("Introduce el monto de la propina: ");
            double propina = Double.parseDouble(scanner.nextLine());
            
            double propinaMinima = consumo * 0.10; // 10% del consumo
            
            if (propina < propinaMinima) {
                System.out.printf("La propina es menor al 10%% del consumo. " +
                                  "Se sugiere una propina minima de: %.2f\n", propinaMinima);
            } else {
                System.out.println("Gracias por la propina,vuelva pronto");
            }
        } catch (NumberFormatException e) {
            System.out.println("Por favor, introduce un numero valido.");
        } finally {
            scanner.close(); // Cierra el escaner
        }
    }
}
