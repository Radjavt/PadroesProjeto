package FactoryMethod;

public interface MovelFactory {
    void crateMovel(String estilo);
}

class Cadeira implements MovelFactory{
    @Override
    public void crateMovel(String estilo) {
        if (estilo.equalsIgnoreCase("Moderno")){
        System.out.println("Cadeira Moderna");
    } else if (estilo.equalsIgnoreCase("ArtEDeco")){
        System.out.println("Cadeira ArtEDeco");
    } else if (estilo.equalsIgnoreCase("Vitoriano")){
            System.out.println("Cadeira Vitoriano");
        }
    }
}
class Sofa implements MovelFactory{
    @Override
    public void crateMovel(String estilo) {
        if (estilo.equalsIgnoreCase("Moderno")){
            System.out.println("Sofa Moderno");
        } else if (estilo.equalsIgnoreCase("ArtEDeco")){
            System.out.println("Sofa ArtEDeco");
        } else if (estilo.equalsIgnoreCase("Vitoriano")){
            System.out.println("Sofa Vitoriano");
        }
    }
}
class MesadeCentro implements MovelFactory{
    @Override
    public void crateMovel(String estilo) {
        if (estilo.equalsIgnoreCase("Moderno")){
            System.out.println("Mesa de centro Moderna");
        } else if (estilo.equalsIgnoreCase("ArtEDeco")){
            System.out.println("Mesa de centro ArtEDeco");
        } else if (estilo.equalsIgnoreCase("Vitoriano")){
            System.out.println("Mesa de centro Vitoriano");
        }
    }
}

interface FabricaMovel{
    MovelFactory criarMovel();
}

class FabricaCadeira implements FabricaMovel{
    @Override
    public MovelFactory criarMovel() {
        return new Cadeira();
    }
}

class FabricaSofa implements FabricaMovel{
    @Override
    public MovelFactory criarMovel() {
        return new Sofa();
    }
}

class FabricaMesadeCentro implements FabricaMovel{
    @Override
    public MovelFactory criarMovel() {
        return new MesadeCentro();
    }
}

class Estilo{
    public void planejarMovel(String movel, String estiloMovel){
        FabricaMovel fabrica;
        if (movel.equalsIgnoreCase("Cadeira")){
            fabrica = new FabricaCadeira();
            MovelFactory movelFactory = fabrica.criarMovel();
            movelFactory.crateMovel(estiloMovel);
        } else if (movel.equalsIgnoreCase("MesadeCentro")){
            fabrica = new FabricaMesadeCentro();
            MovelFactory movelFactory = fabrica.criarMovel();
            movelFactory.crateMovel(estiloMovel);
        } else if (movel.equalsIgnoreCase("Sofa")){
            fabrica = new FabricaSofa();
            MovelFactory movelFactory = fabrica.criarMovel();
            movelFactory.crateMovel(estiloMovel);
        } else {
            throw new IllegalArgumentException("Movel indisponivel.");
        }

    }
}

class Main {
    public static void main(String[] args) {
        Estilo estilo = new Estilo();

        estilo.planejarMovel("Sofa", "ArtEDeco");
        estilo.planejarMovel("Cadeira", "Moderno");
        estilo.planejarMovel("MesadeCentro", "Vitoriano");

    }
}