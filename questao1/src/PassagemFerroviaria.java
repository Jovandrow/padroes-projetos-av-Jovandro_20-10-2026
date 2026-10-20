public class PassagemFerroviaria extends Passagem {
    public PassagemFerroviaria(String passageiro, double tarifa) { super(passageiro, tarifa); }
    public String getModal() { return "Ferroviário"; }
    public double getTaxaEmbarque() { return tarifa * 0.05; }
    public String getDocumentos() { return "documento de identidade com foto, comprovante de reserva"; }
}
