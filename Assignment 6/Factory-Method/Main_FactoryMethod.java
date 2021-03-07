package factory_method;

public class Main_FactoryMethod {
    public static void main(String[] args) {
        Factory tf = new Factory();

        Transport ship = tf.getTransport(Transports.SHIP);
        ship.deliver();

        Transport truck = tf.getTransport(Transports.TRUCK);
        truck.deliver();
    }
}

