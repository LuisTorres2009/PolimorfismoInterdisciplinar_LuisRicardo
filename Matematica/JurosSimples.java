public class JurosSimples extends Juros {
    
    public JurosSimples(double dinheiro, double taxa, int tempo) {
        super(dinheiro, taxa, tempo);
    }

    @Override
    public double calcularJuros() {
        return dinheiro * taxa / 100 * tempo;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Juros Simples");
        System.out.println(String.format("Dinheiro: R$ %.2f", dinheiro));
        System.out.println(String.format("Taxa: %.2f", taxa));
        System.out.println("Tempo: " + tempo + " meses");
        System.out.println(String.format("Juros: R$ %.2f", calcularJuros()));
        System.out.println(String.format("Valor final: R$ %.2f", dinheiro + calcularJuros()));
        System.out.println();
    }    
}