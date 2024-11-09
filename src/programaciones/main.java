package programaciones;

public class main {
    public static void main(String[] args) {
        empleado empleado = new empleado("Gabriel Pelegrina", "45513873", 30);
        System.out.println(empleado.mostrarDetalles());

        desarrollador desarrollador = new desarrollador("Ruiz luca", "45567545", 35, "Java", 20, 15);
        System.out.println(desarrollador.mostrarDetalles());

        gerente gerente = new gerente("Ivan police", "1000", 4, 5, 5000);
        System.out.println(gerente.mostrarDetalles());
    }
}
