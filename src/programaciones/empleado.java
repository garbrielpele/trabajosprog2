package programaciones;

public class empleado {
    private String nombre;
    private String dni;
    protected double salarioBase;

    public empleado(String nombre, String dni, double salarioBase) {
        this.nombre = nombre;
        this.dni = dni;
        this.salarioBase = salarioBase;
    }

    public double calcularSalario() {
        return salarioBase;
    }

    public String mostrarDetalles() {
        return "Nombre: " + nombre + ", DNI: " + dni + ", Salario Base: " + salarioBase;
    }
}
