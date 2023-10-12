package Prototype;

public abstract class LivroPrototype {
    private String titulo;
    private String categoria;

    private String dedicatoria;

    public String getDedicatoria() {
        return dedicatoria;
    }

    public void setDedicatoria(String dedicatoria) {
        this.dedicatoria = dedicatoria;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public abstract String exibirInfor();

    public abstract LivroPrototype clonar();
}

   class HarryPotterPrototype extends LivroPrototype {
       public HarryPotterPrototype(HarryPotterPrototype harryPotterPrototype) {
           this.setTitulo(harryPotterPrototype.getTitulo());
           this.setCategoria(harryPotterPrototype.getCategoria());
       }

       public HarryPotterPrototype(String titulo, String categoria) {
           this.setCategoria(categoria);
           this.setTitulo(titulo);
       }

       @Override
       public String exibirInfor() {
           return "A dedicatoria vai para " + getDedicatoria();
       }

       @Override
       public LivroPrototype clonar() {
           return new HarryPotterPrototype(this);
       }

}
class Main {
    public static void main(String[] args) {
        HarryPotterPrototype harryPotterPrototype = new HarryPotterPrototype("Harry Potter e a Pedra Filosofal","fantasia");

        LivroPrototype harry = harryPotterPrototype.clonar();
        harry.setDedicatoria("Joana");
        LivroPrototype harry3 = harryPotterPrototype.clonar();
        harry3.setDedicatoria("Fernanda");

        System.out.println(harry.exibirInfor());
        System.out.println(harry3.exibirInfor());
    }
}