package Structural.Decorator;

public class OrangeCone implements IceCream{

    //It will only behave as a baseon

    @Override
    public String getDescription(){
        return "Orange Cone";
    }

    @Override
    public int getCost() {
        return 10;
    }
}
