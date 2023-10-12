package RevisaoFactory;
public class FabricaConcreta implements FabricaProdutos{

    @Override
    public Produto criarProduto() {
        System.out.println("Descreva o produto que você deseja criar: ");
        return new ProdutoA();
    }
}