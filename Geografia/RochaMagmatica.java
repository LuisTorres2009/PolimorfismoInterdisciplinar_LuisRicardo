public class RochaMagmatica extends Rocha {

    public RochaMagmatica(String nome, String localEncontrado) {
        super(nome, localEncontrado);
    }

    @Override
    public String comoSaoFormadas() {
        return "As rochas magmáticas são formadas a partir do resfriamento e solidificação do magma, podendo ocorrer dentro da crosta ou na superfície.";
    }

    @Override
    public String caracteristicasPrincipais() {
        return "São compactas, duras e podem apresentar cristais visíveis.";
    }
}