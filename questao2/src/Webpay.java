public class Webpay implements Pagamento {
    public String descrever(double valor) { return String.format("Pagamento via Webpay: CLP %.2f", valor); }
}
