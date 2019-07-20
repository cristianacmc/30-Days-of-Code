import java.util.Scanner;
/**
 * Created by Cristiana Costa
 * on 2019-05-04
 * Program to check the person age
 */

public class Person {

    //instance variable
    private int age;

    Person(int initialAge){
        if (initialAge > 0){
            age = initialAge;
        } else {
            System.out.print("Age is not valid, setting age to 0.\" ");
            age = 0;
        }
    }

    protected void yearPasses(){
        age++;
    }

    protected void amIOld() {
        if (age >= 18) {
            System.out.println("You are old..");
        } else if (age >= 13) {
            System.out.println("You are a teenager");
        } else {
            if(age > 0){
                System.out.println("You are young");
            }
        }
    }




    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Age: ");
        int customAge = scan.nextInt();

        Person p = new Person(customAge);
        p.amIOld();
        p.yearPasses();

    } //main

} //class
