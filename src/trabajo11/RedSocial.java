package trabajo11;

public class RedSocial {
    private VerificacionEdad verificacionEdad;

    public RedSocial() {
        verificacionEdad = new VerificacionEdad();
    }

    public void verificarEdad(int edad) {
        verificacionEdad.verificarEdad(edad);
    }
}
