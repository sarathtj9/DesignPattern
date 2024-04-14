package Structural.Decorator;

public class ChocoChip implements IceCream{

    private IceCream iceCream;

    public ChocoChip(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public int getCost() {
        if (iceCream != null) { //Always check for NPE.
            return iceCream.getCost() + 5;
        }
        return 0; // Invalid
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + " + Choco Chips";
    }
}
