public class JurosCarencia extends Juros {
    private int carencia;

    public JurosCarencia(double dinheiro, double taxa, int tempo, int carencia) {
        super(dinheiro, taxa, tempo);
        this.carencia = carencia;
    }

    @Override
    public double calcularJuros() {
        if (tempo <= carencia) return 0;
        return dinheiro * taxa / 100 * (tempo - carencia);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Juros Simples com carência");
        System.out.println(String.format("Dinheiro: R$ %.2f", dinheiro));
        System.out.println(String.format("Taxa: %.2f", taxa));
        System.out.println(String.format("Tempo: %d meses", tempo));
        System.out.println(String.format("Carência: %d meses", carencia));
        System.out.println(String.format("Juros: R$ %.2f", calcularJuros()));
        System.out.println(String.format("Valor final: R$ %.2f", dinheiro + calcularJuros()));
        System.out.println();
    }    
}