package RevisaoFactory;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        FabricaProdutos fabrica = new FabricaConcreta();

        Produto produto1 = fabrica.criarProduto();
        String dado = ler.next();
        produto1.criar();
    }
}