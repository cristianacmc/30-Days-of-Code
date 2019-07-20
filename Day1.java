import java.util.Scanner;

/**
 * Created by Cristiana Costa
 * on 2019-05-04
 * Program to receive 3 variables and print their sum as concatenation
 */

public class Day1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int i = 4, first;
        double d = 4.0, second;
        String s = "HackerRank ", t;

        System.out.println("Enter a int: ");
        first = scan.nextInt();

        System.out.println("Enter a double: ");
        second = scan.nextDouble();

        System.out.println("Enter a String: ");
        scan.nextLine();
        t = scan.nextLine();


        System.out.println(i + first);
        System.out.println(d + second);
        System.out.println(s + t);




    } //main

} //class
