package trabajo8;

import java.time.LocalDate;

public interface ProductoAlimenticio extends Producto {
    LocalDate getFechaVencimiento();
    boolean estaProximoAVencer();
}
