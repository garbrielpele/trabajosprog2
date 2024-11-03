package vacacionessol.prog2.Controler.Model;

public class Empleado {
    private Long id;
    private String nombre;
    private int diasDisponibles;

    public Empleado(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.diasDisponibles = 7;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDiasVacacionesDisponibles() {
        return diasDisponibles;
    }

    public void setDiasVacacionesDisponibles(int diasDisponibles) {
        this.diasDisponibles = diasDisponibles;
    }

    public void descontarDias(int dias) {
        this.diasDisponibles -= dias;
    }
}