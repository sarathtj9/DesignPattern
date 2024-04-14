package Structural.Decorator;

public class ChocolateCone implements IceCream{

    //It will behave as baseon and addon also
    private IceCream iceCream;

    public ChocolateCone(){

    }

    public ChocolateCone(IceCream iceCream){
        this.iceCream =iceCream;
    }

    @Override
    public String getDescription() {
        if (iceCream != null) {
            return iceCream.getDescription() + " + Chocolate Cone";
        }
        return "Chocolate Cone";
    }

    @Override
    public int getCost() {
        if (iceCream != null) {
            return iceCream.getCost() + 30;
        }
        return 30;
    }
}
