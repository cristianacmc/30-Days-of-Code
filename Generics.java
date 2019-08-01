/**
 * Created by Cristiana Costa
 * on 2019-08-01
 * Program to find the maximum of any two values
 */

public class Generics {

    // T is some tyoe of data that extends comparable (it has a compare to function)
    public static <T extends Comparable <T>> T findMax(T a, T b){
        //this is going to return -1 if a is less than b, 0 if a is equal to b, and 1 if a is greater than b
        int n = a.compareTo(b);
        if(n < 0){
            return b;
        } else {
            return a;
        }

    }

    public static void main(String[] args) {
        System.out.println(findMax(2, 3));
        System.out.println(findMax(3, 3));
        System.out.println(findMax(3, 2));

        System.out.println(findMax(2.0, 3.0));
        System.out.println(findMax('a', 'b'));
        System.out.println(findMax("Hello", "There"));
    } //main

} //class
