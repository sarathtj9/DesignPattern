package Behavioral.Strategy;

public class PathCalculatorFactory {

    public static PathCalculatorStrategy getPathCalculator(String mode){
        if(mode.equals("Car")){
            return new CarPathCalculator();
        }else if(mode.equals("Bike")){
            return new BikePathCalculator();
        }
        else
            return new WalkPathCalculator();
    }
}
