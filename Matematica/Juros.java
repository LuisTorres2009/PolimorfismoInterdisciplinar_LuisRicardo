// Classe abstrata de Juros.
// Serve como base para diferentes tipos de juros (simples, compostos, etc.).
public abstract class Juros {
    // Atributos protegidos 
    private double dinheiro;
    private double taxa;
    private int tempo;

    // Construtor que inicializa os atributos do cálculo de juros.
    public Juros(double dinheiro, double taxa, int tempo) {
        this.dinheiro = dinheiro;
        this.taxa = taxa;
        this.tempo = tempo;
    }

    public double getDinheiro() {
        return dinheiro;
    }

    public double getTaxa() {
        return taxa;
    }

    public int getTempo() {
        return tempo;
    }

    
    // Métodos abstratos para a execução das ações necessárias
    public abstract double calcularJuros();
    public abstract void exibirDetalhes();
    public boolean verificar() {
        if (dinheiro <= 0 || taxa < 0 || tempo <= 0) {
            return false;
        } else {
            return true;
        }
    }
}

