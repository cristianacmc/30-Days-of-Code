import java.util.Scanner;

/**
 * Created by Cristiana Costa
 * on 2019-08-01
 * Program to print an array of generics
 */

public class Printer <T>{
    public static<E> void printArray(E[] array){
        for(E element: array){
            System.out.println(element);
        }
    }



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Array size: ");
        int n = scan.nextInt();
        Integer[] intArray = new Integer[n];
        for (int i=0; i < n; i++){
            System.out.print("Number " + i + ": ");
            intArray[i] = scan.nextInt();
        }

        System.out.print("String array size: ");
        int s = scan.nextInt();
        String[] stringArray = new String[n];
        for(int i = 0; i < s; i++){
            System.out.print("Word " + i + " :");
            stringArray[i] = scan.next();
        }

        Printer<Integer> intPrinter = new Printer<Integer>();
        Printer<String> StringPrinter = new Printer<String>();
        intPrinter.printArray(intArray);
        StringPrinter.printArray(stringArray);
        
        if(Printer.class.getDeclaredMethods().length > 1){
            System.out.println("The Printer class should only have 1 method named printArray.");
        }



    } //main

} //class
