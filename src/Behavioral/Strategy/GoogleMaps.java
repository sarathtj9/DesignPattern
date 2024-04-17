package Behavioral.Strategy;

public class GoogleMaps {

    public void findPath(String from, String to,String mode){
        PathCalculatorStrategy pathCalculatorStrategy= PathCalculatorFactory.getPathCalculator(mode);

        pathCalculatorStrategy.findPath(from,to);
        }
    }
