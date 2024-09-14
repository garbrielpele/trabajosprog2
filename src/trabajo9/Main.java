
package trabajo9;

public class Main {
    public static void main(String[] args) {
        // Crear algunas dietas
        Dieta dieta1 = new Dieta(1, "Frutas y vegetales");
        Dieta dieta2 = new Dieta(2, "Carnes");

        // Crear algunos hábitats
        Habitad habitacionTropical = new Habitad(1, "Selva Tropical");
        Habitad habitacionDesierto = new Habitad(2, "Desierto");

        // Crear algunos animales
        Animal tigre = new Animal(1, "Tigre", 5, 200.0, "Mamifero", dieta2, habitacionTropical);
        Animal tucan = new Animal(2, "Tucan", 3, 1.5, "Ave", dieta1, habitacionTropical);

        // Asignar animales a los hábitats
        habitacionTropical.agregarAnimal(tigre);
        habitacionTropical.agregarAnimal(tucan);

        // Crear cuidadores
        Cuidador cuidadorJohn = new Cuidador(1, "gabriel", "Mamiferos");
        Cuidador cuidadorJane = new Cuidador(2, "lucas", "Aves");

        // Asignar animales a los cuidadores
        cuidadorJohn.asignarAnimal(tigre);
        cuidadorJane.asignarAnimal(tucan);

        // Mostrar animales en hábitat tropical
        habitacionTropical.mostrarAnimales();

        // Mostrar animales que cuida cada cuidador
        cuidadorJohn.mostrarAnimales();
        cuidadorJane.mostrarAnimales();
    }
}
