package Decorator;

public class NotificacaoComPrioridade extends DecoratorNotificacao{
    public NotificacaoComPrioridade(Notificacao notificacaoDecorator) {
        super(notificacaoDecorator);
    }

    @Override
    public void enviar() {
        super.enviar();
        System.out.println("Marcando notificação como prioridade.");
    }
}