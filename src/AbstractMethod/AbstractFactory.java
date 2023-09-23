package AbstractMethod;

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
    Cadeira criarCadeira();
    Sofa criarSofa();
    Mesa criarMesa();

}

class FabricaMovelModerno implements FabricaMovel{
    @Override
    public Cadeira criarCadeira() {
        return new CadeiraModerna();
    }

    @Override
    public Sofa criarSofa() {
        return new SofaModerna();
    }

    @Override
    public Mesa criarMesa() {
        return new MesaModerna();
    }
}

class FabricaMovelArtDeco implements FabricaMovel{

    @Override
    public Cadeira criarCadeira() {
        return new CadeiraArtDeco();
    }

    @Override
    public Sofa criarSofa() {
        return new SofaArtDeco();
    }

    @Override
    public Mesa criarMesa() {
        return new MesaArtDeco();
    }
}

class FabricaMovelVitoriano implements FabricaMovel{

    @Override
    public Cadeira criarCadeira() {
        return new CadeiraVitoriano();
    }

    @Override
    public Sofa criarSofa() {
        return new SofaVitoriano();
    }

    @Override
    public Mesa criarMesa() {
        return new MesaVitoriano();
    }
}

public class AbstractFactory {
    public static void main(String[] args) {
        FabricaMovel fabricaModerna = new FabricaMovelModerno();
        FabricaMovel fabricaArtDeco = new FabricaMovelArtDeco();
        FabricaMovel fabricaVitoriano = new FabricaMovelVitoriano();

        Cadeira cadeiraModerna = fabricaModerna.criarCadeira();
        Sofa sofaArtDeco = fabricaArtDeco.criarSofa();
        Mesa mesaVitoriano = fabricaVitoriano.criarMesa();


        cadeiraModerna.retornar();
        sofaArtDeco.retornar();
        mesaVitoriano.retornar();
    }
}