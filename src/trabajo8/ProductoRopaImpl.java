package trabajo8;

public class ProductoRopaImpl implements ProductoRopa {
    private String nombre;
    private double precio;
    private String talla;
    private String material;

    public ProductoRopaImpl(String nombre, double precio, String talla, String material) {
        this.nombre = nombre;
        this.precio = precio;
        this.talla = talla;
        this.material = material;
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
    public String getTalla() {
        return talla;
    }

    @Override
    public String getMaterial() {
        return material;
    }

    @Override
    public void mostrarCaracteristicas() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Talla: " + talla);
        System.out.println("Material: " + material);
    }
}
