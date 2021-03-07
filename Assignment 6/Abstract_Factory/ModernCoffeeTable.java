package Abstract_Factory;

public class ModernCoffeeTable implements CoffeeTable{
    @Override
    public void hasCoffee() {
        System.out.println("Modern coffee table has multiple coffee");
    }

    @Override
    public void hasCup() {
        System.out.println("Modern coffee table has six cups");
    }
}
