package Decorator;

public class NotificacaoPadrao implements Notificacao{
    private String conteudo;

    public NotificacaoPadrao(String conteudo) {
        this.conteudo = conteudo;
    }

    @Override
    public void enviar() {
        System.out.println("Enviando notificação: "+conteudo);
    }
}
