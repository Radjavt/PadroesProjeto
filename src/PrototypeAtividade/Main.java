package PrototypeAtividade;

public class Main {
    public static void main(String[] args) {
        Administrador administrador = new Administrador("Administrado1","administrador@gmail.com");
        Cliente cliente = new Cliente("Cliente1","cliente@gmail.com");
        Funcionario funcionario = new Funcionario("funcionario1","funcionario@gmail.com");

        UsuarioPrototype Funcionario01 = funcionario.clonar();
        Funcionario01.setDadoEspecifico("001F");
        UsuarioPrototype Administrador01 = administrador.clonar();
        Administrador01.setDadoEspecifico("001A");
        UsuarioPrototype Cliente01 = cliente.clonar();
        Cliente01.setDadoEspecifico("001C");

        System.out.println(Funcionario01.exibirInfor());
        System.out.println(Administrador01.exibirInfor());
        System.out.println(Cliente01.exibirInfor());

    }

}