package trabajo12;

public class CalculadoraPropinas {
    private PropinaCalculator propinaCalculator;

    public CalculadoraPropinas(double consumo) {
        propinaCalculator = new PropinaCalculator(consumo);
    }

    public String verificarPropina(double propina) {
        double propinaMinima = propinaCalculator.calcularPropinaMinima();
        if (propinaCalculator.esPropinaValida(propina)) {
            return "Gracias por la propina, vuelva pronto.";
        } else {
            return String.format("La propina es menor al 10%% del consumo. " +
                                 "Se sugiere una propina minima de: %.2f", propinaMinima);
        }
    }
}
