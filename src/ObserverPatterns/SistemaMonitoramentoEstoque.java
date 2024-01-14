package ObserverPatterns;

public class SistemaMonitoramentoEstoque {
    public static void main(String[] args) {
        GerenciadorEstoque gerenciadorEstoque = new GerenciadorEstoque();
        Observer atualizadorPreco = new AtualizadorPreco();
        Observer gerenteReabastecimento = new GerenteReabastecimento();

        gerenciadorEstoque.adicionar(atualizadorPreco);
        gerenciadorEstoque.adicionar(gerenteReabastecimento);

        gerenciadorEstoque.setNivelEstoque(0);
    }
}