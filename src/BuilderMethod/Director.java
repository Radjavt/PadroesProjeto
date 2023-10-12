package BuilderMethod;

public class Director {
    public void construirPersonagem(PersonagemBuilder builder, String nome, String arma,String classe, int nivel){
        builder.construirNome(nome);
        builder.construirArma(arma);
        builder.construirClasse(classe);
        builder.construirNivel(nivel);

    }
}