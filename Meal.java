import java.util.Scanner;
/**
 * Created by Cristiana Costa
 * on 2019-05-04
 * Program to
 */

public class Meal {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double mealCost;
        int totalCost;

        System.out.print("Enter the meal coast: ");
        mealCost = scan.nextDouble();

        System.out.print("Enter the tip percent: ");
        int tipPercent = scan.nextInt();
        double tip = mealCost * tipPercent/100;
        System.out.println(tip);

        System.out.print("Enter the tax percent: ");
        int taxPercent = scan.nextInt();
        double tax = mealCost * taxPercent/100;
        System.out.println(tax);

        totalCost = (int) Math.round(mealCost + tip + tax);

        System.out.println(totalCost);



    } //main

} //class
