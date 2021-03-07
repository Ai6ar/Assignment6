package Abstract_Factory;

public class VictorianChair implements Chair{

    @Override
    public void setOn() {
        System.out.println("Can sit on victorian chair");
    }

    @Override
    public void hasSeats() {
        System.out.println("Victorian chair has one seat");
    }
}