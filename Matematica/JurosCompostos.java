// Extensão da classe abstrata
public class JurosCompostos extends Juros {
    // Construtor que inicializa os atributos herdados da superclasse
    public JurosCompostos(double dinheiro, double taxa, int tempo) {
        super(dinheiro, taxa, tempo);
    }

    // Método abstrato para calcular os juros compostos
    @Override
    public double calcularJuros() {
        return getDinheiro() * Math.pow(1 + getTaxa() / 100, getTempo()) - getDinheiro();
    }
    //método abstrato para exibir os detalhes do cálculo
    @Override
    public void exibirDetalhes() {
        System.out.println("Juros Compostos");
        System.out.println(String.format("Dinheiro: R$ %.2f", getDinheiro()));
        System.out.println(String.format("Taxa: %.2f", getTaxa()));
        System.out.println(String.format("Tempo: %d meses", getTempo()));
        System.out.println(String.format("Juros: R$ %.2f", calcularJuros()));
        System.out.println(String.format("Valor final: R$ %.2f", getDinheiro() + calcularJuros()));
        System.out.println();
    }    
}