// Classe que representa a energia mecânica (Epot + Ecin)
public class EnergiaM extends Energia {

    // Construtor que recebe massa, altura e velocidade
    public EnergiaM(double m, double g, double h, double v) {
        this.m = m;
        this.g = 9.8; // gravidade fixa
        this.h = h;
        this.v = v;
    }

    // Implementação do cálculo da energia mecânica
    @Override
    public double calcularEnergia() {
        return (m * g * h) + (m * (v * v) * 0.5);
    }

    // Exibição dos resultados com divisão das componentes
    @Override
    public void exibirResultados() {
        System.out.println("Massa (KG): " + String.format("%.2f", m));
        System.out.println("Altura (M): " + String.format("%.2f", h));
        System.out.println("Velocidade (M/S): " + String.format("%.2f", v));
        System.out.println("Energia Potencial (J): " + String.format("%.2f", m * g * h));
        System.out.println("Energia Cinética (J): " + String.format("%.2f", (m * v * v * 0.5)));
        System.out.println("Energia Mecânica: " + String.format("%.2f", calcularEnergia()));
        System.out.println();
    }
}