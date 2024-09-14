
package trabajo9;

import java.util.ArrayList;
import java.util.List;

public class Habitad {
    private int codigo;
    private String nombre;
    private List<Animal> animales;

    public Habitad(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.animales = new ArrayList<>();
    }

    public void agregarAnimal(Animal animal) {
        animales.add(animal);
        animal.setHabitad(this);
    }

    public void mostrarAnimales() {
        System.out.println("Animales en el hábitat " + nombre + ":");
        for (Animal animal : animales) {
            System.out.println(animal.getNombre() + " (" + animal.getTipo() + ")");
        }
    }

    // Getters y Setters
    public int getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
}
