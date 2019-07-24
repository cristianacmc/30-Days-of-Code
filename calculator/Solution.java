package calculator;
import java.util.Scanner;

/**
 * Created by Cristiana Costa
 * on 2019-07-24
 */

public class Solution {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Number: ");
        int n = scan.nextInt();

        AdvancedArithmetic myCalc = new Calculator();
        int sum = myCalc.divisorSum(n);
        System.out.println("I implemented: " + myCalc.getClass().getInterfaces()[0].getName() );
        System.out.println(sum);

    }
}


