package Behavioral.Observer;

public class EmailService implements OrderPlacedSubscriber {

    EmailService(){
        Amazon amazon = Amazon.getInstance();
        amazon.registerSubscriber(this);
    }

    @Override
    public void announceOrderPlaced() {
        System.out.println("Sending Email");
    }
}
