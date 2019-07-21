package hotchocolate;

/**
 * Created by Cristiana Costa
 * on 2019-07-21
 * Program to check if the temperature of the drink and throw exceptions
 */

public class HotChocolate {
    static final double tooHot = 185;
    static final double tooCold = 160;

    //method
    public static void drinkHotChocolate(double cocoaTemp) throws TooHotException, TooColdException{
        if(cocoaTemp >= tooHot){
            throw new TooHotException();
        } else if (cocoaTemp <= tooCold){
            throw new TooColdException();

        }
    }

    public static void main(String[] args) {
        double currentCocoaTemp = 200;
        try{
            drinkHotChocolate(currentCocoaTemp);
            System.out.println("That coca was good");
        } catch(TooHotException e1){
            System.out.println("That's too Hot!");
        } catch(TooColdException e2){
            System.out.println("Thats so cold!");
        }
        System.out.println("And it's gone!");
    } //main

} //class
