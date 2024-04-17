package Behavioral.Observer;

import java.util.ArrayList;
import java.util.List;

public class Amazon {

    //Publisher
    private static Amazon instance=null;

    private List<OrderPlacedSubscriber> orderPlacedSubscribers = new ArrayList<>();

    private Amazon(){

    }

    public static Amazon getInstance(){
        if(instance==null){
            instance = new Amazon();
        }
        return instance;
    }

    void registerSubscriber(OrderPlacedSubscriber orderPlacedSubscriber) {
        orderPlacedSubscribers.add(orderPlacedSubscriber);
    }

    void unRegisterSubscriber(OrderPlacedSubscriber orderPlacedSubscriber) {
        orderPlacedSubscribers.remove(orderPlacedSubscriber);
    }
    public void OrderPlaced(){

        for(OrderPlacedSubscriber orderPlacedSubscriber: orderPlacedSubscribers){
            orderPlacedSubscriber.announceOrderPlaced();
        }
    }
}
