package EstruturaFacade;

import java.util.List;

public class BibliotecaFacade {
    private GerenciadorLivros gerenciadorLivros;
    private GerenciadorUsuarios gerenciadorUsuarios;
    private GerenciadorEmprestimos gerenciadorEmprestimos;

    public BibliotecaFacade(){
        this.gerenciadorLivros = new GerenciadorLivros();
        this.gerenciadorUsuarios = new GerenciadorUsuarios();
        this.gerenciadorEmprestimos = new GerenciadorEmprestimos();
    }

    public boolean adicionarLivros(String titulo, String autor){
        return gerenciadorLivros.adicionarLivros(titulo, autor);
    }

    public boolean adicionarUsuarios(String nome, int id){
        return gerenciadorUsuarios.cadastrarUsuario(nome,id);
    }

    public boolean realizarEmprestimo(String tituloLivro, int idUsuario, String dataEmprestimo){
        try {
            Livro livro = gerenciadorLivros.buscarLivro(tituloLivro);
            Usuario usuario = gerenciadorUsuarios.buscarUsuario(idUsuario);
            return gerenciadorEmprestimos.realizarEmprestimo(livro, usuario, dataEmprestimo);
        }catch (LivroNaoEncontradoException | UsuarioNaoEncontradoException e){
            System.out.println("Erro: "+ e.getMessage());
            return false;
        }
    }
}