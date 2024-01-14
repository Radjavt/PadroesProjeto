package ObserverPatterns;

public class AtualizadorPreco implements Observer{
    @Override
    public void atualizar(int nivelEstoque) {
        if(nivelEstoque <= 10){
            System.out.println("Atualizador de Preço: Ajustando preços devido ao baixo estoque!");
        }
    }
}
