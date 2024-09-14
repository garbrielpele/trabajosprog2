
package trabajo9;

public class Dieta {
    private int codigo;
    private String descripcion;

    public Dieta(int codigo, String descripcion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
    }

    // Getters y Setters
    public int getCodigo() { return codigo; }
    public String getDescripcion() { return descripcion; }
}
