package programaciones;

public class desarrollador extends empleado {
    private String lenguajePrincipal;
    private int horasExtras;
    private double HoraExtra;

    public desarrollador(String nombre, String dni, double salarioBase, String lenguajePrincipal, int horasExtras, double tarifaHoraExtra) {
        super(nombre, dni, salarioBase);
        this.lenguajePrincipal = lenguajePrincipal;
        this.horasExtras = horasExtras;
        this.HoraExtra = 2;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + (horasExtras * HoraExtra);
    }

    @Override
    public String mostrarDetalles() {
        return super.mostrarDetalles() + ", Lenguaje Principal: " + lenguajePrincipal
                + ", Horas Extras: " + horasExtras + ", Salario Total: " + calcularSalario();
    }
}
