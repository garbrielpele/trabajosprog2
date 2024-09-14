
package trabajo9;

import java.util.ArrayList;
import java.util.List;

public class Cuidador {
    private int codigo;
    private String nombre;
    private String especialidad;
    private List<Animal> animales;

    public Cuidador(int codigo, String nombre, String especialidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.animales = new ArrayList<>();
    }

    public void asignarAnimal(Animal animal) {
        animales.add(animal);
    }

    public void mostrarAnimales() {
        System.out.println("Animales que cuida " + nombre + ":");
        for (Animal animal : animales) {
            System.out.println(animal.getNombre() + " (" + animal.getTipo() + ")");
        }
    }

    // Getters y Setters
    public int getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
}
