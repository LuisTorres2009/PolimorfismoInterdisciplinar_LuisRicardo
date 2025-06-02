// Extensão da classe abstrata Rocha.
// Representa uma rocha do tipo metamórfica.
public class RochaMetamorfica extends Rocha {

    // Construtor que inicializa os atributos herdados (nome da rocha e local onde foi encontrada)
    public RochaMetamorfica(String nome, String localEncontrado) {
        super(nome, localEncontrado);
    }

    // Implementação do método abstrato que descreve como a rocha metamórfica é formada.
    @Override
    public String comoSaoFormadas() {
        return "As rochas metafórficas são formadas a partir da transformação de outras rochas devido à alta pressão e temperatura.";
    }

    // Implementação do método abstrato que descreve as principais características da rocha metamórfica.
    @Override
    public String caracteristicasPrincipais() {
        return "Apresentam textura foliada ou cristalina, são muito resistentes e densas.";
    }
}