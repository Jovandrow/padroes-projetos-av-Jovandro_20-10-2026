public abstract class Emissor {
    // Factory Method
    protected abstract Passagem criarPassagem(String passageiro, double tarifa);

    public void emitir(String passageiro, double tarifa) {
        Passagem p = criarPassagem(passageiro, tarifa);
        System.out.println("Modal: " + p.getModal());
        System.out.println("Passageiro: " + p.getPassageiro());
        System.out.printf("Taxa de embarque: R$ %.2f%n", p.getTaxaEmbarque());
        System.out.println("Documentos: " + p.getDocumentos());
        System.out.println();
    }
}
