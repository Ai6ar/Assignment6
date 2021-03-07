package Abstract_Factory;

public class ArtDecoSofa implements Sofa{
    @Override
    public void hasLegs() {
        System.out.println("Artdeco sofa has four legs;");
    }

    @Override
    public void setOn() {
        System.out.println("Can sit on Artdeco sofa");
    }

    @Override
    public void hasSeats() {
        System.out.println("Artdeco sofa has five seats;");
    }

    @Override
    public void lieOn() {
        System.out.println("Can lie on Artdeco sofa");
    }
}
