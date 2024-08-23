package trabajo7;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Crear el proyecto
        Proyecto proyecto = new Proyecto("Desarrollo de Software");

        // Crear tareas
        Tarea tarea1 = new TareaGeneral("Diseño de programas", LocalDate.of(2024, 1, 10), LocalDate.of(2024, 1, 20), "Gabriel");
        Tarea tarea2 = new TareaGeneral("Desarrollo de clases", LocalDate.of(2024, 1, 21), LocalDate.of(2024, 2, 15), "Lucas");
        Tarea tarea3 = new TareaGeneral("Desarrollo de clases abstractas", LocalDate.of(2024, 2, 16), LocalDate.of(2024, 3, 10), "Ivan");
        Tarea tarea4 = new TareaGeneral("Desarrollo de interfaz",LocalDate.of(2024,5,18),LocalDate.of(2024,6,2),"Siri");
        // Agregar tareas al proyecto
        proyecto.agregarTarea(tarea1);
        proyecto.agregarTarea(tarea2);
        proyecto.agregarTarea(tarea3);
        proyecto.agregarTarea(tarea4);
        // Generar informe de progreso
        proyecto.generarInformeProgreso();
    }
}
