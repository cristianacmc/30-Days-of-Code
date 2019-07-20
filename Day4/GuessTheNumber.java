package Day4;
import java.util.Scanner;
import java.util.Random;

/**
 * Created by Cristiana Costa on 2019-03-02
 * COMMENTS ABOUT PROGRAM HERE
 * Program to
 */

public class GuessTheNumber {

    Scanner scan = new Scanner(System.in);
    int theNumber;
    int max;

    public GuessTheNumber() {
        Random rand = new Random();
        max = 100;
        theNumber = Math.abs(rand.nextInt()) % (max + 1);
    }

    public void play() {
        while (true) {
            int move = scan.nextInt();
            if (move > theNumber) {
                System.out.println("Your number is too big");
            } else if (move < theNumber) {
                System.out.println("Your number is too small");
            } else {
                System.out.println("YOU GOT IT BRO");
                break;
            }
        }
    }

    public static void main(String[] args) {
        GuessTheNumber guessGame = new GuessTheNumber();

    } //main

} //class
