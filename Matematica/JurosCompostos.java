public class JurosCompostos extends Juros {
    public JurosCompostos(double dinheiro, double taxa, int tempo) {
        super(dinheiro, taxa, tempo);
    }

    @Override
    public double calcularJuros() {
        return dinheiro * Math.pow(1 + taxa / 100, tempo) - dinheiro;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Juros Compostos");
        System.out.println(String.format("Dinheiro: R$ %.2f", dinheiro));
        System.out.println(String.format("Taxa: %.2f", taxa));
        System.out.println(String.format("Tempo: %d meses", tempo));
        System.out.println(String.format("Juros: R$ %.2f", calcularJuros()));
        System.out.println(String.format("Valor final: R$ %.2f", dinheiro + calcularJuros()));
        System.out.println();
    }    
}