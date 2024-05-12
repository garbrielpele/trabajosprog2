

import java.util.Scanner;
import java.lang.Math;


 
 

public class ej2tp3 {

    
    

  public static void main(String[] args) {
      Scanner leer = new Scanner (System.in);

      double inversionfutura;
      double inversionactual = 10.000;
      double tasa = 0.06;

      for( int año=1; año<=5;año++){
          inversionfutura = inversionactual*Math.pow(1 + tasa, año);
          System.out.println("En el anio "+año+" la inversion fue de "+inversionfutura);
          System.out.println("la inversion redondeada del anio "+año+" es de:"+Math.round(inversionfutura));

      }


  }
}
