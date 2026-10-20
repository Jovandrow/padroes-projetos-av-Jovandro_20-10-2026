public class PassagemAerea extends Passagem {
    public PassagemAerea(String passageiro, double tarifa) { super(passageiro, tarifa); }
    public String getModal() { return "Aéreo"; }
    public double getTaxaEmbarque() { return tarifa * 0.08; }
    public String getDocumentos() { return "documento de identidade com foto, bilhete eletrônico (e-ticket)"; }
}
