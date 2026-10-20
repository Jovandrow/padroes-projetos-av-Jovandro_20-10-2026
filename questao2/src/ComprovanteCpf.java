public class ComprovanteCpf implements Comprovante {
    public String descrever(String aluno, String cpf) {
        return "Comprovante de matrícula - " + aluno + " (CPF " + cpf + ")";
    }
}
