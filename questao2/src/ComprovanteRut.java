public class ComprovanteRut implements Comprovante {
    public String descrever(String aluno, String rut) {
        return "Comprovante de matrícula - " + aluno + " (RUT " + rut + ")";
    }
}
