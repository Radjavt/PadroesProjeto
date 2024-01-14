package Decorator;

public class NotificacaoComLog extends DecoratorNotificacao{
    public NotificacaoComLog(Notificacao notificacaoDecorator) {
        super(notificacaoDecorator);
    }

    @Override
    public void enviar() {
        super.enviar();
        System.out.println("Registrando notificação em um arquivo de log.");
    }
}