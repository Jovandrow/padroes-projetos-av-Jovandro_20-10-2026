public class EmissorAereo extends Emissor {
    protected Passagem criarPassagem(String passageiro, double tarifa) {
        return new PassagemAerea(passageiro, tarifa);
    }
}
