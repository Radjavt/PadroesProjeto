package EstruturaFacade;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorEmprestimos {
    List<Emprestimo> emprestimos = new ArrayList<>();

    public boolean realizarEmprestimo(Livro livro, Usuario usuario, String dataEmprestimo) throws LivroNaoEncontradoException, UsuarioNaoEncontradoException{
       if(!livroExiste(livro)){
          throw new LivroNaoEncontradoException("Livro não encontrado: "+livro.titulo);
       }
       if(!usuarioCadastrado(usuario)){
         throw new UsuarioNaoEncontradoException("Usuario não encontrado: "+usuario.id);
       }
       Emprestimo emprestimo = new Emprestimo(livro, usuario, dataEmprestimo);
       return emprestimos.add(emprestimo);
    }

    private boolean usuarioCadastrado(Usuario usuario) {
        return true;
    }

    private boolean livroExiste(Livro livro) {
        return true;
    }
}