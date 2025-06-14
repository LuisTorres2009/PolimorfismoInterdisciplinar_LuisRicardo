
// Extensão da classe abstrata
public class JurosCarencia extends Juros {

    // Número de meses em que os juros não serão aplicados
    private int carencia;

    // Construtor que inicializa os atributos herdados e o período de carência
    public JurosCarencia(double dinheiro, double taxa, int tempo, int carencia) {
        super(dinheiro, taxa, tempo);
        this.carencia = carencia;
    }

    // Método abstrato para calcular os juros
    @Override
    public double calcularJuros() {
        if (getTempo() <= carencia) return 0;
        return getDinheiro() * getTaxa() / 100 * (getTempo() - carencia);
    }

    // Método abstrato para exibir os detalhes do cálculo
    @Override
    public void exibirDetalhes() {
        System.out.println("Juros Simples com carência");
        System.out.println(String.format("Dinheiro: R$ %.2f", getDinheiro()));
        System.out.println(String.format("Taxa: %.2f", getTaxa()));
        System.out.println(String.format("Tempo: %d meses", getTempo()));
        System.out.println(String.format("Carência: %d meses", carencia));
        System.out.println(String.format("Juros: R$ %.2f", calcularJuros()));
        System.out.println(String.format("Valor final: R$ %.2f", getDinheiro() + calcularJuros()));
        System.out.println();
    }    
}
