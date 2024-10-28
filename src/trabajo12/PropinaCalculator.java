package trabajo12;

public class PropinaCalculator {
    private double consumo;

    public PropinaCalculator(double consumo) {
        this.consumo = consumo;
    }

    public double calcularPropinaMinima() {
        return consumo * 0.10; // 10% del consumo
    }

    public boolean esPropinaValida(double propina) {
        return propina >= calcularPropinaMinima();
    }

    public double getConsumo() {
        return consumo;
    }
}

