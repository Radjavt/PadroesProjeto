package FactoryMethod;

public interface Transporte {
    void entregar();
}

class Caminhao implements Transporte {
    @Override
    public void entregar() {
        System.out.println("Entrega por caminhão.");
    }
}

class Navio implements Transporte {
    @Override
    public void entregar() {
        System.out.println("Entrega por transporte marítimo.");
    }
}

class Trem implements Transporte {
    @Override
    public void entregar() {
        System.out.println("Entrega por transporte ferroviário.");
    }
}

class Moto implements Transporte {
    @Override
    public void entregar() {
        System.out.println("Entrega por moto.");
    }
}

interface FabricaTransporte {
    Transporte criarTransporte();
}


class FabricaCaminhao implements FabricaTransporte {
    @Override
    public Transporte criarTransporte() {
        return new Caminhao();
    }
}

class FabricaNavio implements FabricaTransporte {
    @Override
    public Transporte criarTransporte() {
        return new Navio();
    }
}

class FabricaTrem implements FabricaTransporte {
    @Override
    public Transporte criarTransporte() {
        return new Trem();
    }
}

class FabricaMoto implements FabricaTransporte {
    @Override
    public Transporte criarTransporte() {
        return new Moto();
    }
}

// Classe de logística que usa o Factory Method
class Logistica {
    public void planejarEntrega(String modo) {
        FabricaTransporte fabrica;

        if (modo.equalsIgnoreCase("caminhao")) {
            fabrica = new FabricaCaminhao();
        } else if (modo.equalsIgnoreCase("navio")) {
            fabrica = new FabricaNavio();
        } else if (modo.equalsIgnoreCase("trem")) {
            fabrica = new FabricaTrem();
        } else if (modo.equalsIgnoreCase("moto")) {
            fabrica = new FabricaMoto();
        } else {
            throw new IllegalArgumentException("Modo de transporte inválido.");
        }

        Transporte transporte = fabrica.criarTransporte();
        transporte.entregar();
    }
}

 class teste {
    public static void main(String[] args) {
        Logistica logistica = new Logistica();

        logistica.planejarEntrega("caminhao");
        logistica.planejarEntrega("navio");
        logistica.planejarEntrega("trem");
        logistica.planejarEntrega("moto");
    }
}