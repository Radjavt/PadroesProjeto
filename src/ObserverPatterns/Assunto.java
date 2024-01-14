package ObserverPatterns;

public interface Assunto {
    void adicionar(Observer observer);
    void remover(Observer Observer);
    void notificar();
}
