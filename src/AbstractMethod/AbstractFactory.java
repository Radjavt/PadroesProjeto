package AbstractMethod;

import FactoryMethod.MovelFactory;

interface Cadeira{
    void retornar();
}

interface Sofa{
    void retornar();
}

interface Mesa{
    void retornar();
}

class CadeiraModerna implements Cadeira{

    @Override
    public void retornar() {
        System.out.println("Cadeira Moderna");
    }
}

class CadeiraVitoriano implements Cadeira{

    @Override
    public void retornar() {
        System.out.println("Cadeira Vitoriano");
    }
}

class CadeiraArtDeco implements Cadeira{

    @Override
    public void retornar() {
        System.out.println("Cadeira ArtDeco");
    }
}

class SofaModerna implements Sofa{
    @Override
    public void retornar() {
        System.out.println("Sofa Moderno");
    }
}

class SofaVitoriano implements Sofa{
    @Override
    public void retornar() {
        System.out.println("Sofa Vitoriano");
    }
}

class SofaArtDeco implements Sofa{
    @Override
    public void retornar() {
        System.out.println("Sofa ArtDeco");
    }
}

class MesaModerna implements Mesa{
    @Override
    public void retornar() {
        System.out.println("Mesa Moderna");
    }
}

class MesaVitoriano implements Mesa{
    public void retornar() {
        System.out.println("Mesa Vitoriano");
    }
}

class MesaArtDeco implements Mesa{
    public void retornar() {
        System.out.println("Mesa ArtDeco");
    }
}

interface FabricaMovel{
    MovelFactory criarMovel();
}

class FabricaCadeira implements FabricaMovel{
    @Override
    public MovelFactory criarMovel() {
        return null;
    }
}
public class AbstractFactory {
    public static void main(String[] args) {

    }
}


