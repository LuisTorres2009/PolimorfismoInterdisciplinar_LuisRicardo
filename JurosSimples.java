// Extensão da classe abstrata
public class JurosSimples extends Juros {
    // Construtor que inicializa os atributos herdados da superclasse
    public JurosSimples(double dinheiro, double taxa, int tempo) {
        super(dinheiro, taxa, tempo);
    }
    // Método abstrato para calcular os juros simples
    @Override
    public double calcularJuros() {
        return dinheiro * taxa / 100 * tempo;
    }
    //método abstrato para exibir os detalhes do cálculo
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