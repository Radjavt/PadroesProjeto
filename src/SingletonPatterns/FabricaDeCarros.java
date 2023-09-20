package SingletonPatterns;

public class FabricaDeCarros {
    protected int totalCarrosFiat;
    protected int totalCarrosFord;
    protected int totalCarrosVolks;

    public String criarCarroVolks() {
        return new String("Carro Volks #" + totalCarrosVolks++ + " criado."); }

    public String criarCarroFord() {
        return new String("Carro Ford #" + totalCarrosFord++ + " criado."); }
    public String criarCarroFiat() {
        return new String("Carro Fiat #" + totalCarrosFiat++ + " criado."); }
    public String gerarRelatorio() {
        return new String("Total de carros Fiat vendidos: " + totalCarrosFiat + "\nTotal de carros Ford vendidos: " + totalCarrosFord + "\nTotal de carros Volks vendidos: " + totalCarrosVolks); }

}

class teste{
    public static void main(String[] args) {
        FabricaDeCarros fabrica = new FabricaDeCarros();

    }

}

class FabricaDeCarrosSingleton {

    private static FabricaDeCarrosSingleton instancia;
    private FabricaDeCarrosSingleton() {

    }

    public static FabricaDeCarrosSingleton getInstancia () {
        if (instancia == null) {
            instancia = new FabricaDeCarrosSingleton();
        }
        return instancia;
    }
}


