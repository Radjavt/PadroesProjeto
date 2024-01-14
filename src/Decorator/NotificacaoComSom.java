package Decorator;

import java.sql.SQLOutput;

public class NotificacaoComSom extends DecoratorNotificacao{
    public NotificacaoComSom(Notificacao notificacaoDecorator) {
        super(notificacaoDecorator);
    }

    @Override
    public void enviar() {
        super.enviar();
        System.out.println("Enviando notificação com som: "+notificacaoDecorator);
    }
}
