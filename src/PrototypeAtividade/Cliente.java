package PrototypeAtividade;

public class Cliente extends UsuarioPrototype{
    public Cliente(Cliente cliente){

        this.setNome(cliente.getNome());
        this.setEmail(cliente.getEmail());

    }
    public Cliente(String nome, String email){
        this.setNome(nome);
        this.setEmail(email);
    }

    @Override
    public UsuarioPrototype clonar() {
        return new Cliente(this);
    }

    @Override
    public String exibirInfor() {
        return "ID: "+getDadoEspecifico();
    }


}