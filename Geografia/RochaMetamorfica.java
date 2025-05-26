public class RochaMetamorfica extends Rocha {

    public RochaMetamorfica(String nome, String localEncontrado) {
        super(nome, localEncontrado);
    }

    @Override
    public String comoSaoFormadas() {
        return "As rochas metafórficas são formadas a partir da transformação de outras rochas devido à alta pressão e temperatura.";
    }

    @Override
    public String caracteristicasPrincipais() {
        return "Apresentam textura foliada ou cristalina, são muito resistentes e densas.";
    }
}