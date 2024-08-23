package trabajo6;

public class Altavoz extends Dispositivo {

    public Altavoz(String nombre) {
        super(nombre);
    }

    @Override
    public void funcionEspecifica() {
        System.out.println("Altavoz " + nombre + " está reproduciendo música.");
    }

    @Override
    public void encender() {
        super.encender();
        System.out.println("Altavoz " + nombre + " está reproduciendo sonido.");
    }

    @Override
    public void apagar() {
        super.apagar();
        System.out.println("Altavoz " + nombre + " ha dejado de reproducir sonido.");
    }
}
