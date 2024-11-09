package programaciones;

public class gerente extends empleado {
    private int antiguedad;
    private double bonusGestion;

    public gerente(String nombre, String dni, double salarioBase, int antiguedad, double bonusGestion) {
        super(nombre, dni, salarioBase);
        this.antiguedad = 50;
        this.bonusGestion = 100;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + antiguedad + bonusGestion;
    }

    @Override
    public String mostrarDetalles() {
        return super.mostrarDetalles() + ", Antigüedad: " + antiguedad
                + ", Bonus Gestión: " + bonusGestion + ", Salario Total: " + calcularSalario();
    }
}
