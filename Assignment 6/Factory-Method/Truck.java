package factory_method;

public class Truck implements Transport{
    @Override
    public void deliver() {
        System.out.println("Delivered by TRUCK");
    }
}

