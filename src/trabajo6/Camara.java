package trabajo6;

public class Camara extends Dispositivo {

    public Camara(String nombre) {
        super(nombre);
    }

    @Override
    public void funcionEspecifica() {
        System.out.println("Cámara " + nombre + " está grabando video.");
    }

    @Override
    public void encender() {
        super.encender();
        System.out.println("Cámara " + nombre + " está grabando.");
    }

    @Override
    public void apagar() {
        super.apagar();
        System.out.println("Cámara " + nombre + " ha dejado de grabar.");
    }
}
