package trabajo8;

import java.time.LocalDate;

public class ProductoAlimenticioImpl implements ProductoAlimenticio {
    private String nombre;
    private double precio;
    private LocalDate fechaVencimiento;

    public ProductoAlimenticioImpl(String nombre, double precio, LocalDate fechaVencimiento) {
        this.nombre = nombre;
        this.precio = precio;
        this.fechaVencimiento = fechaVencimiento;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public double getPrecio() {
        return precio;
    }

    @Override
    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    @Override
    public boolean estaProximoAVencer() {
        LocalDate hoy = LocalDate.now();
        LocalDate fechaLimite = hoy.plusDays(7); // Considera productos próximos a vencer en 7 días
        return fechaVencimiento.isBefore(fechaLimite);
    }

    @Override
    public void mostrarCaracteristicas() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Fecha de Vencimiento: " + fechaVencimiento);
        System.out.println("Próximo a vencer: " + (estaProximoAVencer() ? "Sí" : "No"));
    }
}
