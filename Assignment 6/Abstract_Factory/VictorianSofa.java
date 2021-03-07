package Abstract_Factory;

public class VictorianSofa implements Sofa{
    @Override
    public void hasLegs() {
        System.out.println("Victorian sofa has eight legs");
    }

    @Override
    public void setOn() {
        System.out.println("Victorian sofa has four seats");
    }

    @Override
    public void hasSeats() {
        System.out.println("Can sit on victorian sofa");
    }

    @Override
    public void lieOn() {
        System.out.println("Victorian sofa has one seat");
    }
}
