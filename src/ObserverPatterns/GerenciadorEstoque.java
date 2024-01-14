package ObserverPatterns;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorEstoque implements Assunto{
    private int nivelEstoque;
    private List<Observer> Observers = new ArrayList<>();

    public void setNivelEstoque(int nivelEstoque){
        this.nivelEstoque = nivelEstoque;
        notificar();
    }
    @Override // Adiciona um observador à lista de observadores.
    public void adicionar(Observer observer) {
       Observers.add(observer);
    }
    @Override // Remove um observador da lista de observadores.
    public void remover(Observer observer) {
        Observers.remove(observer);

    }
    @Override // Percorre a lista de observadores e chama o método atualizar em cada um, passando o novo nível do estoque como parâmetro.
    public void notificar() {
        for(Observer observer : Observers ){
           observer.atualizar(nivelEstoque);
        }
    }
}
