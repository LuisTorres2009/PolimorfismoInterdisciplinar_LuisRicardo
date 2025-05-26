public abstract class Juros {
    protected double dinheiro;
    protected double taxa;
    protected int tempo;

    public Juros(double dinheiro, double taxa, int tempo) {
        this.dinheiro = dinheiro;
        this.taxa = taxa;
        this.tempo = tempo;
    }

    public abstract double calcularJuros();
    public abstract void exibirDetalhes();
}