package challenges;
import java.util.Scanner;
/**
 * Created by Cristiana Costa
 * on 2019-04-17
 * Program to
 */

public class ArraysDS {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("N: ");
        int N = scan.nextInt();

        int[] A = new int[N];

        for(int i=0; i < A.length; i++){
            System.out.print("A[" + i + "]:");
            A[i] = scan.nextInt();
        }

        for(int i = A.length-1; i>=0; i--){
            System.out.print(A[i]);
            if(i > 0){
                System.out.print(" ");
            }
        }
    } //main

} //class
