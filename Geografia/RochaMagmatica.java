// Extensão da classe abstrata Rocha.
// Representa uma rocha do tipo magmática.
public class RochaMagmatica extends Rocha {

    // Construtor que inicializa os atributos herdados (nome da rocha e local onde foi encontrada)
    public RochaMagmatica(String nome, String localEncontrado) {
        super(nome, localEncontrado);
    }

    // Implementação do método abstrato que descreve como a rocha magmática é formada.
    @Override
    public String comoSaoFormadas() {
        return "As rochas magmáticas são formadas a partir do resfriamento e solidificação do magma, podendo ocorrer dentro da crosta ou na superfície.";
    }

    // Implementação do método abstrato que descreve as principais características da rocha magmática.
    @Override
    public String caracteristicasPrincipais() {
        return "São compactas, duras e podem apresentar cristais visíveis.";
    }
}
