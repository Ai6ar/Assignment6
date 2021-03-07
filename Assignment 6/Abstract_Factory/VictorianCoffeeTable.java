package Abstract_Factory;

public class VictorianCoffeeTable implements CoffeeTable {

    @Override
    public void hasCoffee() {
        System.out.println("Victorian coffee table has multiple coffee");
    }

    @Override
    public void hasCup() {
        System.out.println("Victorian coffee table has four cups");
    }
}

