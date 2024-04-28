import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class ManejoFechas {//nose porque no me dejo poner el nombre del archivo como los otros y me obligo a ponerle .java
    // calculo de dias desde la fecha hasta la actual
    public static int diasTranscurridos(int dia, int mes, int anio) {
        LocalDate fechaInicial = LocalDate.of(anio, mes, dia);
        LocalDate fechaActual = LocalDate.now();
        return (int) ChronoUnit.DAYS.between(fechaInicial, fechaActual);
    }

    //para saber si es bisiesto
    public static boolean esBisiesto(int anio) {
        return (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
    }

    // calcula la diferencia de dias en formato string
    public static int diasTranscurridos(String fecha) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaInicial = LocalDate.parse(fecha, formatter);
        LocalDate fechaActual = LocalDate.now();
        return (int) ChronoUnit.DAYS.between(fechaInicial, fechaActual);
    }

    public static void main(String[] args) {
        //ejemplo ingresando una fecha
        int dia = 27;
        int mes = 12;
        int anio = 2004;
        System.out.println("Dias transcurridos desde " + dia + "/" + mes + "/" + anio + ": " +
                diasTranscurridos(dia, mes, anio));

        // identificar bisiesto
        if (esBisiesto(anio)) {
            System.out.println(anio + " es un anio bisiesto.");
        } else {
            System.out.println(anio + " no es un anio bisiesto.");
        }

        
        String fechaString = "20/03/2023";
        System.out.println("Dias transcurridos desde " + fechaString + ": " +
                diasTranscurridos(fechaString));
    }
}

