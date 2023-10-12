package BuilderMethod;

public class PersonagemBuilderImpl implements PersonagemBuilder {

    private String nome;
    private String arma;
    private String classe;
    private int nivel;
    @Override
    public void construirNome(String nome) {
    this.nome = nome;
    }

    @Override
    public void construirArma(String arma) {
    this.arma = arma;
    }

    @Override
    public void construirClasse(String classe) {
    this.classe = classe;
    }

    @Override
    public void construirNivel(int nivel) {
    this.nivel = nivel;
    }

    @Override
    public Personagem getPersonagem() {
        return new Personagem(nome, arma, classe, nivel);
    }
}