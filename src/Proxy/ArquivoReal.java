package Proxy;

public class ArquivoReal implements Arquivo{
    private String nome;

    public ArquivoReal(String nome) {
        this.nome = nome;
    }

    @Override
    public void ler() {
        System.out.println("Lendo o arquivo"+nome);
    }
    @Override
    public void escrever() {
        System.out.println("Escrevendo no arquivo"+nome);
    }
}
