package Proxy;

public class Main {
    public static void main(String[] args) {
        Arquivo arquivo = new ProxyArquivo("Arquivo.png","proprietario");
        arquivo.ler();
        arquivo.escrever();
    }
}
