public class Main {
    public static void main(String[] args) {
        new Matricula("Maria", "123.456.789-00", 1000.00, new FabricaBrasil()).confirmar();
        new Matricula("Camila", "12.345.678-5", 50000.00, new FabricaChile()).confirmar();
    }
}
