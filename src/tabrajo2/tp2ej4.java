import java.lang.Math;

class FigurasGeometricas {
    static class Cuadrado {
        double lado;

        Cuadrado(double lado) {
            this.lado = lado;
        }

        double calcularArea() {
            return lado * lado;
        }

        double calcularPerimetro() {
            return 4 * lado;
        }
    }

    static class Rectangulo {
        double base;
        double altura;

        Rectangulo(double base, double altura) {
            this.base = base;
            this.altura = altura;
        }

        double calcularArea() {
            return base * altura;
        }

        double calcularPerimetro() {
            return 2 * (base + altura);
        }
    }

    static class Circulo {
        double radio;

        Circulo(double radio) {
            this.radio = radio;
        }

        double calcularArea() {
            return Math.PI * radio * radio;
        }

        double calcularPerimetro() {
            return 2 * Math.PI * radio;
        }
    }

    public static void main(String[] args) {
      
        Cuadrado cuadrado = new Cuadrado(7);
        System.out.println("area del cuadrado: " + cuadrado.calcularArea());
        System.out.println("Perimetro del cuadrado: " + cuadrado.calcularPerimetro());

     
        Rectangulo rectangulo = new Rectangulo(7, 8);
        System.out.println("area del rectangulo: " + rectangulo.calcularArea());
        System.out.println("Perimetro del rectangulo: " + rectangulo.calcularPerimetro());

       
        Circulo circulo = new Circulo(98);
        System.out.println("area del circulo: " + circulo.calcularArea());
        System.out.println("Perimetro del circulo: " + circulo.calcularPerimetro());
    }
}

