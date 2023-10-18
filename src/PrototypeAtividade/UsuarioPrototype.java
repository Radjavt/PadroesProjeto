package PrototypeAtividade;

public abstract class UsuarioPrototype{

    private String nome;
    private String email;

    private String dadoEspecifico;

    public UsuarioPrototype(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    protected UsuarioPrototype() {
    }

    public abstract UsuarioPrototype clonar();

    public abstract String exibirInfor();

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDadoEspecifico() {
        return dadoEspecifico;
    }

    public void setDadoEspecifico(String dadoEspecifico) {
        this.dadoEspecifico = dadoEspecifico;
    }
}