public class Main {
    public static void main(String[] args) throws Exception {
        Usuario gustavo = new Usuario("Gustavo", "Aluno", "20230006414@estudantes.ifpr.edu.br");
        Livro senhorDosAneis = new Livro("Senhor dos Aneis", "Num sei", "Nsei", "fantasia", true);
        Emprestimo emprestimo = new Emprestimo("2024-07-05","2024-07-12",gustavo,senhorDosAneis,0);
        Reserva reserva = new Reserva(gustavo, "2024-07-05", senhorDosAneis);
        Relatorio relatorio = new Relatorio(senhorDosAneis, senhorDosAneis);
    }
}
