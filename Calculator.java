import java.lang.Exception;
import java.math.*;
import java.util.Scanner;

/**
 * Created by Cristiana Costa
 * on 2019-07-21
 * Program to create a Calculator class with a power(n,p) method. If n or p is negative the method must throw an error
 */

public class Calculator {
    public int power(int n, int p) throws Exception{
        if(n <0 || p < 0){
            throw new Exception("n and p should be non-negative");
        }
        return (int)Math.pow(n, p);
    }


    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter the number of tests: ");
    int t = scan.nextInt();

    while(t-- > 0) {
        System.out.print("Enter n: ");
        int n = scan.nextInt();
        System.out.print("Enter p: ");
        int p = scan.nextInt();
        Calculator calc = new Calculator();
        try {
            int ans = calc.power(n, p);
            System.out.println(ans);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    } //main

} //class
