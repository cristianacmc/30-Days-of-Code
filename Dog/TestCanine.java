package Dog;

/**
 * Created by Cristiana Costa
 * on 2019-05-03
 * Program to test the class Canine
 */

public class TestCanine {

    public static void main(String[] args) {

        //instantiate the class Canine
        Canine c = new KleeKai("Lilah", "Grey/White", 'F', 5);
        Canine d = new SiberianHusky("Alaska", "Grey/Black/White", 'F', 16);
        c.printInfo();
        d.printInfo();
    } //main

} //class
