package Structural.Flyweight;


@ExtrinsicState
public class UserExtrinsicState {
    private Colour colour;

    public int getCurrentGameStreak() {
        return currentGameStreak;
    }

    private int currentGameStreak;
    private UserIntrinsicState user;


}
