public class FabricaChile implements FabricaPais {
    public DocumentoFiscal criarDocumentoFiscal() { return new BoletaElectronica(); }
    public Pagamento criarPagamento() { return new Webpay(); }
    public Comprovante criarComprovante() { return new ComprovanteRut(); }
}
