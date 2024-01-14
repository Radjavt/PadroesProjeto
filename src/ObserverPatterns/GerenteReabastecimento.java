package ObserverPatterns;

public class GerenteReabastecimento implements Observer{
    @Override
    public void atualizar(int nivelEstoque) {
        if(nivelEstoque == 0){
            System.out.println("Gerente de Reabastecimento: Estoque esgotado! Iniciando processo de reabastecimento.");
        }
    }
}
