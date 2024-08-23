package trabajo7;

import java.util.ArrayList;
import java.util.List;

public class Proyecto {
    private String nombre;
    private List<Tarea> tareas;

    public Proyecto(String nombre) {
        this.nombre = nombre;
        this.tareas = new ArrayList<>();
    }

    public void agregarTarea(Tarea tarea) {
        tareas.add(tarea);
    }

    public void generarInformeProgreso() {
        System.out.println("Informe de Progreso del Proyecto: " + nombre);
        for (Tarea tarea : tareas) {
            tarea.mostrarDetalles();
            System.out.println();
        }
    }
}
