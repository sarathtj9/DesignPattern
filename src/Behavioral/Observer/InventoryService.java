package Behavioral.Observer;

public class InventoryService implements OrderPlacedSubscriber{

    InventoryService(){
        Amazon amazon= Amazon.getInstance();
        amazon.registerSubscriber(this);
    }

    @Override
    public void announceOrderPlaced() {
        System.out.println("Inventory Service ");
    }
}
