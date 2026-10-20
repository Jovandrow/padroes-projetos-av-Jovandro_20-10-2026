public class Main {
    public static void main(String[] args) {
        Emissor aereo = new EmissorAereo();
        Emissor rodoviario = new EmissorRodoviario();
        Emissor ferroviario = new EmissorFerroviario();

        aereo.emitir("Ana", 1000.00);
        rodoviario.emitir("Bruno", 200.00);
        ferroviario.emitir("Carla", 500.00);
    }
}
