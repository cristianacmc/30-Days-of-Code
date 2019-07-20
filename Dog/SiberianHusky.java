package Dog;

/**
 * Created by Cristiana Costa
 * on 2019-05-03
 * Program to create the subclass SiberianHusky
 */

public class SiberianHusky extends Canine {

    SiberianHusky(String customName, String customColor, char mF, int customAge){
        super(customName, customColor, mF, customAge);
    }

    // abstract method implementation
    protected String getBreed(){
        return " Siberian Husky";
    }


} //class
