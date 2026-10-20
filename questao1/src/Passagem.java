public abstract class Passagem {
    protected String passageiro;
    protected double tarifa;

    public Passagem(String passageiro, double tarifa) {
        this.passageiro = passageiro;
        this.tarifa = tarifa;
    }

    public abstract String getModal();
    public abstract double getTaxaEmbarque();
    public abstract String getDocumentos();

    public String getPassageiro() { return passageiro; }
}
