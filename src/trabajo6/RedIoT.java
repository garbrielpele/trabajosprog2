
package trabajo6;


import java.util.ArrayList;
import java.util.List;

public class RedIoT {
    private List<Dispositivo> dispositivos;

    public RedIoT() {
        this.dispositivos = new ArrayList<>();
    }

    public void agregarDispositivo(Dispositivo dispositivo) {
        dispositivos.add(dispositivo);
        System.out.println(dispositivo.getNombre() + " agregado a la red.");
    }

    public void encenderDispositivo(String nombre) {
        for (Dispositivo dispositivo : dispositivos) {
            if (dispositivo.getNombre().equals(nombre)) {
                dispositivo.encender();
                return;
            }
        }
        System.out.println("Dispositivo no encontrado: " + nombre);
    }

    public void apagarDispositivo(String nombre) {
        for (Dispositivo dispositivo : dispositivos) {
            if (dispositivo.getNombre().equals(nombre)) {
                dispositivo.apagar();
                return;
            }
        }
        System.out.println("Dispositivo no encontrado: " + nombre);
    }

    public void mostrarEstadoDispositivo(String nombre) {
        for (Dispositivo dispositivo : dispositivos) {
            if (dispositivo.getNombre().equals(nombre)) {
                System.out.println("Estado de " + nombre + ": " + dispositivo.obtenerEstado());
                return;
            }
        }
        System.out.println("Dispositivo no encontrado: " + nombre);
    }

    public void mostrarHistorialDispositivo(String nombre) {
        for (Dispositivo dispositivo : dispositivos) {
            if (dispositivo.getNombre().equals(nombre)) {
                System.out.println("Historial de " + nombre + ":");
                for (String registro : dispositivo.obtenerHistorial()) {
                    System.out.println("- " + registro);
                }
                return;
            }
        }
        System.out.println("Dispositivo no encontrado: " + nombre);
    }
}
