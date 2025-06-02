public class EnergiaC extends Energia {

    // Construtor que recebe massa e velocidade
    public EnergiaC(double m, double v) {
        this.m = m;
        this.v = v;
    }

    // Implementação do cálculo da energia cinética
    @Override
    public double calcularEnergia() {
        return m * (v * v) * 0.5;
    }

    // Exibição dos resultados
    @Override
    public void exibirResultados() {
        System.out.println("Massa (KG): " + String.format("%.2f", m));
        System.out.println("Velocidade (M/S): " + String.format("%.2f", v));
        System.out.println("Energia Cinética (J): " + String.format("%.2f", calcularEnergia()));
        System.out.println();
    }
}