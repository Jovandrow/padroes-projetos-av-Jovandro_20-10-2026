public class PassagemRodoviaria extends Passagem {
    public PassagemRodoviaria(String passageiro, double tarifa) { super(passageiro, tarifa); }
    public String getModal() { return "Rodoviário"; }
    public double getTaxaEmbarque() { return tarifa * 0.03; }
    public String getDocumentos() { return "documento de identidade com foto"; }
}
