package Abstract_Factory;

public class ArtDecoCoffeeTable implements CoffeeTable {

    @Override
    public void hasCoffee() {
        System.out.println("Artdeco coffee table has multiple coffee");
    }

    @Override
    public void hasCup() {
        System.out.println("Artdeco coffee table has six cups");
    }
}
