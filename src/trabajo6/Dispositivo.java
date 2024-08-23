package trabajo6;

import java.util.List;

public abstract class Dispositivo {
    protected String nombre;
    protected boolean encendido;
    protected Historial historial;

    public Dispositivo(String nombre) {
        this.nombre = nombre;
        this.encendido = false;
        this.historial = new Historial();
    }

    public String getNombre() {
        return nombre;
    }

    public void encender() {
        if (!encendido) {
            encendido = true;
            historial.agregarRegistro("Encendido");
            System.out.println(nombre + " encendido.");
        }
    }

    public void apagar() {
        if (encendido) {
            encendido = false;
            historial.agregarRegistro("Apagado");
            System.out.println(nombre + " apagado.");
        }
    }

    public String obtenerEstado() {
        return encendido ? "Encendido" : "Apagado";
    }

    public List<String> obtenerHistorial() {
        return historial.obtenerRegistros();
    }

    public abstract void funcionEspecifica();
}
