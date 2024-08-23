package trabajo8;

public class ProductoElectricoImpl implements ProductoElectrico {
    private String nombre;
    private double precio;
    private int potencia;

    public ProductoElectricoImpl(String nombre, double precio, int potencia) {
        this.nombre = nombre;
        this.precio = precio;
        this.potencia = potencia;
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
    public int getPotencia() {
        return potencia;
    }

    @Override
    public void mostrarCaracteristicas() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Potencia: " + potencia + " vatios");
    }
}
