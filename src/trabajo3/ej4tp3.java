
public class ej4tp3 {

    
    public static void main(String[] args) {
      String clave = "clave!12";
        
        if (validarLongitud(clave) && contieneDigito(clave) && contieneCaracterEspecial(clave)) {
            System.out.println("La clave es segura.");
        } else {
            System.out.println("La clave no cumple con los requisitos de seguridad.");
        }
        
        //Generar una clave con mayor seguridad
        String nuevaclave = construirclaveSegura();
        System.out.println("Nueva clave segura generada: " + nuevaclave);
    }
    
    //verifico si la clave tiene por lo menos 8 caracteres
    public static boolean validarLongitud(String clave) {
        return clave.length() >= 8;
    }
    
    // compruebo si almenos posee un numero
    public static boolean contieneDigito(String clave) {
        for (char c : clave.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }
    
    //verifico si contiene caracter especial
    public static boolean contieneCaracterEspecial(String clave) {
        String caracteresEspeciales = "!@#$%^&*";
        for (char c : clave.toCharArray()) {
            if (caracteresEspeciales.contains(String.valueOf(c))) {
                return true;
            }
        }
        return false;
    }
    
    // metodo para clave segura
    public static String construirclaveSegura() {
        String letras = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numeros = "0123456789";
        String caracteresEspeciales = "!@#$%^&*";
        
        StringBuilder claveBuilder = new StringBuilder();
        
        // Agregar una letra como minimo
        claveBuilder.append(letras.charAt((int)(Math.random() * letras.length())));
        
        // Agregar un numero como minimo
        claveBuilder.append(numeros.charAt((int)(Math.random() * numeros.length())));
        
        // Agregar un caracter especial como minimo
        claveBuilder.append(caracteresEspeciales.charAt((int)(Math.random() * caracteresEspeciales.length())));
        
        // completar clave aleatoriamente
        for (int i = 3; i < 12; i++) { // la clave generada es de 12 caracteres
            String conjunto = letras + numeros + caracteresEspeciales;
            claveBuilder.append(conjunto.charAt((int)(Math.random() * conjunto.length())));
        }
        
        return claveBuilder.toString();
    }
}