package trabajo6;

public class Main {
    public static void main(String[] args) {
        // Crear la red IoT
        RedIoT redIoT = new RedIoT();

        // Crear dispositivos
        Sensor sensor1 = new Sensor("Sensor Temperatura");
        Camara camara1 = new Camara("Cámara Seguridad");
        Altavoz altavoz1 = new Altavoz("Altavoz Música");

        // Agregar dispositivos a la red
        redIoT.agregarDispositivo(sensor1);
        redIoT.agregarDispositivo(camara1);
        redIoT.agregarDispositivo(altavoz1);

        // Encender y apagar dispositivos
        redIoT.encenderDispositivo("Sensor Temperatura");
        redIoT.encenderDispositivo("Cámara Seguridad");
        redIoT.apagarDispositivo("Cámara Seguridad");
        redIoT.encenderDispositivo("Altavoz Música");


    }
}