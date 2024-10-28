package trabajo10;

public class Viaje {
    private int anioDestino;

    public Viaje(int anioDestino) {
        this.anioDestino = anioDestino;
    }

    public void realizarViaje() {
        if (anioDestino < 1900 || anioDestino > 2100) {
            System.out.println("Viajar tan lejos en el tiempo puede tener muchas consecuencias");
        } else {
            System.out.println("Estás en el año " + anioDestino + ". Disfruta tu estadía, pero vuelve pronto para minimizar riesgos.");
        }
    }
}
