package trabajo8;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Crear productos
        ProductoAlimenticio productoAlimenticio = new ProductoAlimenticioImpl("Leche", 1250, LocalDate.of(2024, 9, 15));
        ProductoElectrico productoElectrico = new ProductoElectricoImpl("Ventilador", 35000, 75);
        ProductoRopa productoRopa = new ProductoRopaImpl("Camisa", 12500, "M", "Algodón");

        // Mostrar características de los productos
        System.out.println("Características del Producto Alimenticio:");
        productoAlimenticio.mostrarCaracteristicas();
        System.out.println();

        System.out.println("Características del Producto Eléctrico:");
        productoElectrico.mostrarCaracteristicas();
        System.out.println();

        System.out.println("Características del Producto de Ropa:");
        productoRopa.mostrarCaracteristicas();
    }
}
