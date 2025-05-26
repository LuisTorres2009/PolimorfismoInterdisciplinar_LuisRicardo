public abstract class Rocha {
    protected String nome;
    protected String localEncontrado;

    public Rocha(String nome, String localEncontrado) {
        this.nome = nome;
        this.localEncontrado = localEncontrado;
    }

    public abstract String comoSaoFormadas();
    public abstract String caracteristicasPrincipais();

    public void exibirInformacoes() {
        System.out.println("Rocha: " + nome);
        System.out.println("Formação: " + comoSaoFormadas());
        System.out.println("Características: " + caracteristicasPrincipais());
        System.out.println("Local onde foi encontrada: " + localEncontrado);
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
    }
}