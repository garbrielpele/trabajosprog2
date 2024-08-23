package trabajo6;

import java.util.ArrayList;
import java.util.List;

public class Historial {
    private List<String> registros;

    public Historial() {
        this.registros = new ArrayList<>();
    }

    public void agregarRegistro(String registro) {
        registros.add(registro);
    }

    public List<String> obtenerRegistros() {
        return new ArrayList<>(registros);
    }
}
