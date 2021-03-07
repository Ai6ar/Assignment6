package Abstract_Factory;

public class ArtDecoChair implements Chair {

    @Override
    public void setOn() {
        System.out.println("Can sit on Artdeco");
    }

    @Override
    public void hasSeats() {
        System.out.println("Artdeco chair has two seats");
    }
}
