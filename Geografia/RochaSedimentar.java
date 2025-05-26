public class RochaSedimentar extends Rocha {

    public RochaSedimentar(String nome, String localEncontrado) {
        super(nome, localEncontrado);
    }

    @Override
    public String comoSaoFormadas() {
        return "As rochas sedimentares são formadas pela compactação e cimentação de sedimentos em ambientes aquáticos ou continentais.";
    }

    @Override
    public String caracteristicasPrincipais() {
        return "Possuem camadas visíveis, são mais porosas e de fácil erosão.";
    }
}