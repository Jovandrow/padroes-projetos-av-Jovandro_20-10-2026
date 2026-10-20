public class EmissorFerroviario extends Emissor {
    protected Passagem criarPassagem(String passageiro, double tarifa) {
        return new PassagemFerroviaria(passageiro, tarifa);
    }
}
