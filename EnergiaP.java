// Classe que representa o cálculo da energia potencial (mgh)
public class EnergiaP extends Energia {

    // Construtor que recebe massa e altura
    public EnergiaP(double m, double g, double h) {
        this.m = m;
        this.g = 9.8; // gravidade fixa
        this.h = h;
    }

    // Implementação do cálculo da energia potencial
    @Override
    public double calcularEnergia() {
        return m * g * h;
    }

    // Exibição dos resultados
    @Override
    public void exibirResultados() {
        System.out.println("Massa (KG): " + String.format("%.2f", m));
        System.out.println("Altura (M): " + String.format("%.2f", h));
        System.out.println("Energia Potencial (J): " + String.format("%.2f", calcularEnergia()));
        System.out.println();
    }
}