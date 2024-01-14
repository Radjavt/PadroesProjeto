package EstruturaFacade;

public class Emprestimo {
    Livro livro;
    Usuario usuario;
    String dataEmprestimo;

    public Emprestimo(Livro livro, Usuario usuario, String dataEmprestimo) {
        this.livro = livro;
        this.usuario = usuario;
        this.dataEmprestimo = dataEmprestimo;
    }
}