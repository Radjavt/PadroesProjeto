package Decorator;

public class Main {
    public static void main(String[] args) {
        Notificacao notificacaoBase = new NotificacaoPadrao("Conteúdo de notificação");

        Notificacao notificacaoDecorator1 = new NotificacaoComSom(notificacaoBase);
        Notificacao notificacaoDecorator2 = new NotificacaoComImagem(notificacaoDecorator1);
        Notificacao notificacaoDecorator3 = new NotificacaoComPrioridade(notificacaoDecorator2);
        Notificacao notificacaoDecorator4 = new NotificacaoComLog(notificacaoDecorator3);

        notificacaoDecorator4.enviar();
    }
}
