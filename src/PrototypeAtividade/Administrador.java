package PrototypeAtividade;

public class Administrador extends UsuarioPrototype {
    public Administrador(Administrador administrador){

        this.setNome(administrador.getNome());
        this.setEmail(administrador.getEmail());
    }
    public Administrador(String nome, String email){
        this.setNome(nome);
        this.setEmail(email);
    }
    @Override
    public UsuarioPrototype clonar() {
        return new Administrador(this);
    }

    @Override
    public String exibirInfor() {
        return "ID: "+getDadoEspecifico();
    }

}