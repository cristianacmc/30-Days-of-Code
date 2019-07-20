import java.util.Scanner;

/**
 * Created by Cristiana Costa
 * on 2019-06-12
 * Program to Given a base-10 integer, n,  to convert it to binary (base-2). Then find and print the base-10
 * integer denoting the maximum number of consecutive 1's in n's binary representation.
 */

public class Binary {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a binaty number: ");
        int n = scan.nextInt();
        int ones = 0;
        int max = 0;

        char[] s = Integer.toBinaryString(n).toCharArray();
        System.out.println(s);


        for (int i = 0;i < s.length; i++){
            if(s[i] == '0'){
                if(max < ones){
                    max = ones;
                }
                ones = 0;
            } else {
                ones ++;
            }
        }

        if (max < ones){
            max = ones;
        }
                System.out.println("max: " + max);

    } //main

} //class
