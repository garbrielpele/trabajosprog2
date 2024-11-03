package vacacionessol.prog2.service;

import vacacionessol.prog2.Controler.Model.Empleado;
import vacacionessol.prog2.Controler.Model.Vacaciones;
import vacacionessol.prog2.Controler.Model.Manager;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

@Service
public class VacacionesService {

    private Map<Long, Vacaciones> solicitudes = new HashMap<>();

    public Vacaciones solicitarVacaciones(@org.jetbrains.annotations.NotNull Empleado empleado, LocalDate fechaInicio) {
        if (empleado.getDiasVacacionesDisponibles() >= 7) {
            Vacaciones vacaciones = new Vacaciones((long) (solicitudes.size() + 1), empleado, fechaInicio);
            solicitudes.put(vacaciones.getId(), vacaciones);
            empleado.descontarDias(7);
            return vacaciones;
        }
        return null; // No tiene suficientes días disponibles
    }

    public Vacaciones obtenerVacacionesPorId(Long id) {
        return solicitudes.get(id);
    }

    public void aprobarVacaciones(@NotNull Manager manager, Long vacacionesId, int nivelAprobacion) {
        Vacaciones vacaciones = solicitudes.get(vacacionesId);
        Manager.aprobarVacaciones(vacaciones, nivelAprobacion);
    }
}