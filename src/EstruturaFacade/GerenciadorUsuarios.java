package EstruturaFacade;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorUsuarios {
    List<Usuario> usuarios = new ArrayList<>();

    public boolean cadastrarUsuario(String nome, int id){
        Usuario usuario = new Usuario(nome,id);
        return usuarios.add(usuario);
    }

    public Usuario buscarUsuario(int id) throws UsuarioNaoEncontradoException{
        for (Usuario usuario: usuarios) {
           if(usuario.id == id){
               return usuario;
           }
        }
        throw new UsuarioNaoEncontradoException("Usuario não encontrado: "+id);
    }
}