package BuilderMethod;

public class Personagem {
    private String nome;
    private String arma;
    private String classe;
    private int nivel;

    public Personagem(String nome, String arma, String classe, int nivel) {
        this.nome = nome;
        this.arma = arma;
        this.classe = classe;
        this.nivel = nivel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return "Personagem (" +
                "nome: " + nome +
                ", arma: " + arma +
                ", classe: " + classe +
                ", nivel: " + nivel +
                ')';
    }
}