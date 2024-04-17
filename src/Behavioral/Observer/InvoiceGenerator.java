package Behavioral.Observer;

public class InvoiceGenerator implements OrderPlacedSubscriber{

    InvoiceGenerator(){
        Amazon amazon= Amazon.getInstance();
        amazon.registerSubscriber(this);
    }

    @Override
    public void announceOrderPlaced() {
        System.out.println("Invoice generated");
    }
}
