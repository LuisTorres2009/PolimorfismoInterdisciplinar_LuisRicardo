// Extensão da classe abstrata Rocha.
// Representa uma rocha do tipo sedimentar.
public class RochaSedimentar extends Rocha {

    // Construtor que inicializa os atributos herdados (nome da rocha e local encontrado)
    public RochaSedimentar(String nome, String localEncontrado) {
        super(nome, localEncontrado);
    }

    // Implementação do método abstrato que descreve a formação da rocha sedimentar.
    @Override
    public String comoSaoFormadas() {
        return "As rochas sedimentares são formadas pela compactação e cimentação de sedimentos em ambientes aquáticos ou continentais.";
    }

    // Implementação do método abstrato que descreve as características da rocha sedimentar.
    @Override
    public String caracteristicasPrincipais() {
        return "Possuem camadas visíveis, são mais porosas e de fácil erosão.";
    }
}