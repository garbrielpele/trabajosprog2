package trabajo7;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public abstract class Tarea {
    protected String nombre;
    protected LocalDate fechaInicio;
    protected LocalDate fechaFin;
    protected String responsable;
    
    public Tarea(String nombre, LocalDate fechaInicio, LocalDate fechaFin, String responsable) {
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.responsable = responsable;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public String getResponsable() {
        return responsable;
    }

    public long calcularTiempoInvertido() {
        return ChronoUnit.DAYS.between(fechaInicio, fechaFin) + 1; // +1 para incluir el último día
    }

    public abstract void mostrarDetalles();

    @Override
    public String toString() {
        return "Tarea: " + nombre + "\n" +
               "Inicio: " + fechaInicio + "\n" +
               "Fin: " + fechaFin + "\n" +
               "Responsable: " + responsable + "\n" +
               "Tiempo invertido: " + calcularTiempoInvertido() + " días";
    }
}
