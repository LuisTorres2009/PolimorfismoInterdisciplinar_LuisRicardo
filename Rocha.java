// Classe abstrata Rocha.
// Serve como base para diferentes tipos de rochas (Sedimentar, Magmática, Metamórfica).
public abstract class Rocha {
    // Atributos protegidos: nome da rocha e local onde foi encontrada.
    protected String nome;
    protected String localEncontrado;

    // Construtor que inicializa os atributos.
    public Rocha(String nome, String localEncontrado) {
        this.nome = nome;
        this.localEncontrado = localEncontrado;
    }

    // Métodos abstratos que devem ser implementados nas subclasses.
    public abstract String comoSaoFormadas();
    public abstract String caracteristicasPrincipais();

    // Método para exibir informações da rocha.
    public void exibirInformacoes() {
        System.out.println("Rocha: " + nome);
        System.out.println("Formação: " + comoSaoFormadas());
        System.out.println("Características: " + caracteristicasPrincipais());
        System.out.println("Local onde foi encontrada: " + localEncontrado);
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
    }
}