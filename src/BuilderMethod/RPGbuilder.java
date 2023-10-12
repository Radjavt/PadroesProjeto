package BuilderMethod;

public class RPGbuilder {
    public static void main(String[] args) {
       PersonagemBuilder builder = new PersonagemBuilderImpl();
       Director director = new Director();

       director.construirPersonagem(builder, "Rei Vermelho","Fogo","Guerreiro", 10);
       Personagem personagem01 = builder.getPersonagem();
       System.out.println(personagem01);


       director.construirPersonagem(builder, "Deusa Negra","Livro Mortal","Bruxa",15);
       Personagem personagem02 = builder.getPersonagem();
       System.out.println(personagem02);
    }
}