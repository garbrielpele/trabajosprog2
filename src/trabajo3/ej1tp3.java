
import java.util.Scanner;


 

public class ej1tp3 {

    
     
  public static void main(String[] args) {
      Scanner leer = new Scanner (System.in);
      int hornoelectrico;
      int Lavarropa;
      int secarropa;
      int Cocina;
      int pavaelectrica;
      System.out.println("ingrese la cantidad de energia anual para conocer el ahorro: ");
      double energiaanual = leer.nextDouble();
      energiaanual = Math.sqrt(energiaanual);
      System.out.println("Usted posee un ahorro de: "+energiaanual);
      System.out.println("Ingrese el consumo del horno electrico");
      hornoelectrico = leer.nextInt();
      System.out.println("Ingrese el consumo del Lavarropa");
      Lavarropa =leer.nextInt();
      System.out.println("Ingrese el consumo de la secarropa");
      secarropa = leer.nextInt();
      System.out.println("Ingrese el consumo de la Cocina");
      Cocina = leer.nextInt();
      System.out.println("Ingrese el consumo de la pava electrica");
      pavaelectrica = leer.nextInt();
      System.out.println("El maximo consumo de los electrodomestico del hogar es de: ");
      System.out.println(Math.max(hornoelectrico,Math.max(Lavarropa,Math.max(secarropa,Math.max(Cocina,pavaelectrica)))));
      System.out.println("El minimo consumo de los electrodomesticos del hogar es de:");
      System.out.println(Math.min(hornoelectrico,Math.min(Lavarropa,Math.min(secarropa,Math.min(Cocina,pavaelectrica)))));}
}







 


