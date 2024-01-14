package EstruturaFacade;

public class TesteFacade {
    public static void main(String[] args) {
        BibliotecaFacade biblioteca = new BibliotecaFacade();

        boolean livroAdicionado = biblioteca.adicionarLivros("Harry Potter e o Calice de Fogo","J.K RowLing");
        boolean usuarioCadastrado = biblioteca.adicionarUsuarios("Radija",1);

        if(livroAdicionado && usuarioCadastrado){
            boolean emprestimoRealizado = biblioteca.realizarEmprestimo("Harry Potter e o Calice de Fogo",1,"2023-12-19");
            if(emprestimoRealizado){
                System.out.println("Emprestimo realizado com sucesso!");
            }else {
                System.out.println("Falha ao realizar o emprestimo.");
            }
        }
    }
}