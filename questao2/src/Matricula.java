public class Matricula {
    private String aluno;
    private String documento;
    private double valor;
    private FabricaPais fabrica;

    public Matricula(String aluno, String documento, double valor, FabricaPais fabrica) {
        this.aluno = aluno;
        this.documento = documento;
        this.valor = valor;
        this.fabrica = fabrica;
    }

    public void confirmar() {
        DocumentoFiscal fiscal = fabrica.criarDocumentoFiscal();
        Pagamento pagamento = fabrica.criarPagamento();
        Comprovante comprovante = fabrica.criarComprovante();

        System.out.println(fiscal.descrever(valor));
        System.out.println(pagamento.descrever(valor));
        System.out.println(comprovante.descrever(aluno, documento));
        System.out.println();
    }
}
