package vacacionessol.prog2;

import ch.qos.logback.core.model.Model;
import vacacionessol.prog2.Controler.Model.Empleado;
import vacacionessol.prog2.Controler.Model.Manager;
import vacacionessol.prog2.Controler.Model.Vacaciones;
import vacacionessol.prog2.service.VacacionesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.time.LocalDate;

@RestController
@RequestMapping("/vacaciones")
public class
VacacionesController {

    @Autowired
    private VacacionesService vacacionesService;

    @PostMapping("/solicitar")
    public Vacaciones solicitarVacaciones(@RequestParam Long empleadoId, @RequestParam String nombre, @RequestParam String fechaInicio) {
        Empleado empleado = new Empleado(empleadoId, nombre);
        LocalDate inicio = LocalDate.parse(fechaInicio);
        return vacacionesService.solicitarVacaciones(empleado, inicio);
    }

    @PostMapping("/aprobar")
    public String aprobarVacaciones(@RequestParam Long gestorId, @RequestParam String nombreManager, @RequestParam Long vacacionesId, @RequestParam int nivelAprobacion) {
        Manager manager = new Manager(Managerid, nombreManager);
        vacacionesService.aprobarVacaciones(Manager, vacacionesId, nivelAprobacion);
        return "Aprobación nivel " + nivelAprobacion + " realizada por " + nombreManager;
    }

    @GetMapping("/ver/{id}")
    public Vacaciones verVacaciones(@PathVariable Long id) {
        return vacacionesService.obtenerVacacionesPorId(id);
    }

    @Controller
    public class VacacionesViewController {

        @GetMapping("/vacaciones/solicitud")
        public String mostrarSolicitudVacacionesForm(Model model) {
            return "solicitudVacaciones";  // Renderiza la página solicitudVacaciones.html
        }

        @GetMapping("/vacaciones/aprobar")
        public String mostrarAprobacionVacacionesForm(Model model) {
            return "aprobarVacaciones";  // Renderiza la página aprobarVacaciones.html
        }
    }
}