import java.util.Scanner;
import java.util.Collection;
/**
 * Created by Cristiana Costa
 * on 2019-07-31
 * Program to sort the array in ascending order using the Bubble Sort algorithm
 */

public class Sorting {

    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);

        System.out.print("Array size: ");
        int n = scan.nextInt();
        int[] a = new int[n];
        int totalSwaps = 0;

        for(int i = 0; i < n; i++){
            System.out.print("number " + i + ": ");
            a[i] = scan.nextInt();
        }

        for(int index = 0; index < n; index ++) {
            for (int j = 0; j < n - 1; j++) {
                if (a[j] > a[j+1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    totalSwaps++;
                }
            }

            if (totalSwaps == 0) {
                break;
            }
        }

        System.out.println("Array is sorted in "+ totalSwaps + " swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[n-1]);

    } //main

} //class
