package Structural.Decorator;

public class Client {
    public static void main(String[] args) {
        IceCream iceCream =
                new ChocoChip(
                        new StrawberryScoop(
                                new ChocolateCone(
                                        new ChocoChip(
                                                new OrangeCone()
                                        )
                                )
                        )
                );

        System.out.println(iceCream.getDescription());
        System.out.println(iceCream.getCost());
    }
}
