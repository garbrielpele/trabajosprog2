package trabajo6;

public class Sensor extends Dispositivo {

    public Sensor(String nombre) {
        super(nombre);
    }

    @Override
    public void funcionEspecifica() {
        System.out.println("Sensor " + nombre + " mide la temperatura.");
    }

    @Override
    public void encender() {
        super.encender();
        System.out.println("Sensor " + nombre + " está midiendo.");
    }

    @Override
    public void apagar() {
        super.apagar();
        System.out.println("Sensor " + nombre + " ha dejado de medir.");
    }
}
