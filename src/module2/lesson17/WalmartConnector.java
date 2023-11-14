package module2.lesson17;

public class WalmartConnector implements Connector{

    @Override
    public void listen() {
        System.out.println("Listening for Walmart");
    }
}
