package trabajo7;

import java.time.LocalDate;

public class TareaGeneral extends Tarea {

    public TareaGeneral(String nombre, LocalDate fechaInicio, LocalDate fechaFin, String responsable) {
        super(nombre, fechaInicio, fechaFin, responsable);
    }

    @Override
    public void mostrarDetalles() {
        System.out.println(this);
    }
}
