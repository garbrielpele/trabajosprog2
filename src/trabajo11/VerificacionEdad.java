package trabajo11;

public class VerificacionEdad {
    public void verificarEdad(int edad) {
        if (edad < 13) {
            System.out.println("Eres menor de la edad permitida. No puedes registrarte en esta red social.");
            System.out.println("Por favor, visita las siguientes paginas para mas opciones:");
            System.out.println("1. https://www.kidfriendlysite.com");
            System.out.println("2. https://www.teensocial.com");
        } else {
            System.out.println("Bienvenido a la red social");
        }
    }
}

