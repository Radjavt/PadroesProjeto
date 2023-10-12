package RevisaoFactory;

public class ProdutoB implements Produto{
    @Override
    public void criar() {
        System.out.println("Produto B criado com sucesso.");
    }
}