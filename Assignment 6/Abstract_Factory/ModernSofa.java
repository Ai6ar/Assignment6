package Abstract_Factory;

public class ModernSofa implements Sofa{
    @Override
    public void hasLegs() {
        System.out.println("Modern sofa has four legs;");
    }

    @Override
    public void setOn() {
        System.out.println("Can sit on modern sofa");
    }

    @Override
    public void hasSeats() {
        System.out.println("Modern sofa has five seats;");
    }

    @Override
    public void lieOn() {
        System.out.println("Can lie on modern sofa");
    }
}
