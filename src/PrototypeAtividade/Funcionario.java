package PrototypeAtividade;

public class Funcionario extends UsuarioPrototype{
    public Funcionario(Funcionario funcionario){

        this.setNome(funcionario.getNome());
        this.setEmail(funcionario.getEmail());
    }
    public Funcionario(String nome, String email){
        this.setNome(nome);
        this.setEmail(email);
    }
    @Override
    public UsuarioPrototype clonar() {
        return new Funcionario(this);
    }

    @Override
    public String exibirInfor() {
        return "ID: "+getDadoEspecifico();
    }
}