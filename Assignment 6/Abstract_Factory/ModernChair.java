package Abstract_Factory;

public class ModernChair implements Chair {
    @Override
    public void setOn() {
        System.out.println("Can sit on Modern chair");
    }

    @Override
    public void hasSeats() {
        System.out.println("Modern chair has two seats");
    }
}
