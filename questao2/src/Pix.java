public class Pix implements Pagamento {
    public String descrever(double valor) { return String.format("Pagamento via Pix: R$ %.2f", valor); }
}
