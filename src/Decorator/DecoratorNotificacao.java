package Decorator;

public class DecoratorNotificacao implements Notificacao{
    protected Notificacao notificacaoDecorator;

    public DecoratorNotificacao(Notificacao notificacaoDecorator) {
        this.notificacaoDecorator = notificacaoDecorator;
    }
    @Override
    public void enviar() {
        notificacaoDecorator.enviar();
    }
}