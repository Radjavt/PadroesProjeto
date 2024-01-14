package EstruturaFacade;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorLivros {
    List<Livro> livros = new ArrayList<>();

    public boolean adicionarLivros(String titulo, String autor){
        Livro livro = new Livro(titulo, autor);
        return livros.add(livro);
    }

    public Livro buscarLivro(String titulo) throws LivroNaoEncontradoException{
        for (Livro livro:livros) {
           if(livro.titulo.equals(titulo)){
               return livro;
           }
        }
        throw new LivroNaoEncontradoException("Livro não encontrado"+titulo);
    }
}
