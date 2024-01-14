package Decorator;

public class NotificacaoComImagem extends DecoratorNotificacao{
    public NotificacaoComImagem(Notificacao notificacaoDecorator) {
        super(notificacaoDecorator);
    }

    @Override
    public void enviar() {
        super.enviar();
        System.out.println("Enviando notificação com som: "+ notificacaoDecorator);
    }
}