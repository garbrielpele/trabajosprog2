class OperacionesMatematicas {
    // las operaciones con esteros
    public static int suma(int a, int b) {
        return a + b;
    }

    public static int resta(int a, int b) {
        return a - b;
    }

    public static int multiplicacion(int a, int b) {
        return a * b;
    }

   public static double division(int a, int b) {
        if (b != 0) {
            return (double) a / b; // para que la division auqnue se introduzcan numeros enteros de el resultado en decimales
        } else {
            System.out.println("Error: No se puede realizar.");
            return 0.0;
        }
    }

    //metodo para decimales
    public static double suma(double a, double b) {
        return a + b;
    }

    public static double resta(double a, double b) {
        return a - b;
    }

    public static double multiplicacion(double a, double b) {
        return a * b;
    }

    public static double division(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: no se puede realizar.");
            return 0.0;
        }
    }

    public static void main(String[] args) {
        //se ingresa los valores enteros y se devuelve los resultados
        int entero1 = 27;
        int entero2 = 8;
        System.out.println("la suma con enteros es: " + suma(entero1, entero2));
        System.out.println("la resta con enteros es: " + resta(entero1, entero2));
        System.out.println("la multiplicacion con enteros es: " + multiplicacion(entero1, entero2));
        System.out.println("la division con enteros es: " + division(entero1, entero2));

        // se ingresa los decimales y se devuelve el resultado
        double decimal1 = 27.5;
        double decimal2 = 8.5;
        System.out.println("Suma de decimales es: " + suma(decimal1, decimal2));
        System.out.println("Resta de decimales es: " + resta(decimal1, decimal2));
        System.out.println("Multiplicacion de decimales es: " + multiplicacion(decimal1, decimal2));
        System.out.println("Division de decimales es: " + division(decimal1, decimal2));
    }
}

