import java.util.Scanner;

class Empleado {
    private String nombre;
    private String apellido;
    private int edad;
    private double sueldo;

  
    public Empleado(String nombre, String apellido, int edad, double sueldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sueldo = sueldo;
    }

    
    public void mostrarInformacionCompleta(boolean incluirSueldo) {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + edad);
        if (incluirSueldo) {
            System.out.println("Sueldo: $" + sueldo);
        }     
    }

    
    public void incrementarSueldo(double cantidad) {
        sueldo += cantidad;
        System.out.println("Sueldo incrementado. Nuevo sueldo: $" + sueldo);
    }

    public void incrementarSueldoPorcentaje(double porcentaje) {
        double incremento = sueldo * (porcentaje / 100);
        sueldo += incremento;
        System.out.println("Sueldo incrementado en " + porcentaje + "%. Nuevo sueldo: $" + sueldo);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//pedimos todos los datos del empleado

        System.out.println("Ingrese el nombre del empleado:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese el apellido del empleado:");
        String apellido = scanner.nextLine();

        System.out.println("Ingrese la edad del empleado:");
        int edad = scanner.nextInt();

        System.out.println("Ingrese el sueldo del empleado:");
        double sueldo = scanner.nextDouble();

       
        Empleado empleado = new Empleado(nombre, apellido, edad, sueldo);

        
        empleado.mostrarInformacionCompleta(true);

        
        empleado.incrementarSueldo(1035);//elejimos valor para aumentar el sueldo

        
        empleado.incrementarSueldoPorcentaje(0);//elejimos porcentaje para aumentar el sueldo este se suma al sueldo ya aumentado en la fila anterior
          //para aumentar de una sola manera se coloca 0 en cualquiera de los dos
        scanner.close();
    }
}
