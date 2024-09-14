package trabajo9;
public class Animal {
    private int codigo;
    private String nombre;
    private int edad;
    private double peso;
    private String tipo;  // Mamífero, Reptil, Ave, Otro
    private Dieta dieta;  // Objeto Dieta
    private Habitad habitad;  // Objeto Habitad

    public Animal(int codigo, String nombre, int edad, double peso, String tipo, Dieta dieta, Habitad habitad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.tipo = tipo;
        this.dieta = dieta;
        this.habitad = habitad;
    }

    // Getters y Setters
    public int getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }
    public double getPeso() { return peso; }
    public String getTipo() { return tipo; }
    public Dieta getDieta() { return dieta; }
    public Habitad getHabitad() { return habitad; }

    public void setDieta(Dieta dieta) { this.dieta = dieta; }
    public void setHabitad(Habitad habitad) { this.habitad = habitad; }
}

