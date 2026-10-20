public class FabricaBrasil implements FabricaPais {
    public DocumentoFiscal criarDocumentoFiscal() { return new Nfse(); }
    public Pagamento criarPagamento() { return new Pix(); }
    public Comprovante criarComprovante() { return new ComprovanteCpf(); }
}
