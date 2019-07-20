import java.util.Random;

/**
 * Created by Cristiana Costa on 2019-02-27
 * COMMENTS ABOUT PROGRAM HERE
 * Program to toss a coin and check if it is head or tail
 */

public class CoinToss {

    public String tossACoin() {
        Random rand = new Random();
        int toss = Math.abs(rand.nextInt()) % 2;    //access the absolute method in the Math class to get the absolute value from a random int and get the remainder it divided by 2

        //check to see if the remainder is 0 or 1 and return a string
        if (toss == 0) {
            return "HEADS";
        } else {
            return "TAILS";
        }
    }
    public static void main(String[] args) {
        CoinToss game = new CoinToss();     //create an instance of the class tossACoin
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());

    } //main

} //class
