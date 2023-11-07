package Proxy;

public class ProxyArquivo implements Arquivo{
    private ArquivoReal arquivoReal;
    private String nomeArquivo;
    private String usuario;

    public ProxyArquivo(String nomeArquivo, String usuario) {
        this.nomeArquivo = nomeArquivo;
        this.usuario = usuario;
    }

    @Override
    public void ler() {
        if (temAcesso()) {
            if (arquivoReal == null) {
                arquivoReal = new ArquivoReal(nomeArquivo);
            }
            arquivoReal.ler();
        } else {
            System.out.println("Acesso negado ao arquivo " + nomeArquivo);
        }
    }

    @Override
    public void escrever() {
        if (temAcesso()) {
            if (arquivoReal == null) {
                arquivoReal = new ArquivoReal(nomeArquivo);
            }
            arquivoReal.escrever();
        } else {
            System.out.println("Acesso negado ao arquivo " + nomeArquivo);
        }
    }

    private boolean temAcesso(){
        return usuario.equalsIgnoreCase("proprietario");
    }
}