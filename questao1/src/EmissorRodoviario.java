public class EmissorRodoviario extends Emissor {
    protected Passagem criarPassagem(String passageiro, double tarifa) {
        return new PassagemRodoviaria(passageiro, tarifa);
    }
}
