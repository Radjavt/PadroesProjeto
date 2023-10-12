package BuilderMethod;

public interface PersonagemBuilder {
    void construirNome(String nome);
    void construirArma(String arma);
    void construirClasse(String classe);
    void construirNivel(int nivel);
    Personagem getPersonagem();
}