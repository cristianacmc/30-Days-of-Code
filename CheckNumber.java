import java.util.Scanner;
/**
 * Created by Cristiana Costa
 * on 2019-05-04
 * Program to check if number is weird or not
 */

public class CheckNumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String result;

        System.out.println("Number: ");
        int n = scan.nextInt();

        if(n % 2 != 0){
            result = "Weird";
        } else if ((n % 2 == 0) && (n >= 2) &&(n <= 5)){
            result = "Not Weird";
        } else if ((n % 2 == 0) && (n >= 6) &&(n <= 20)){
            result = "Weird";
        } else {
            result = "Not Weird";
        }

        System.out.println(result);


    } //main

} //class
