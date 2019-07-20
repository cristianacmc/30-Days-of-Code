package Day12;
import java.util.Scanner;

/**
 * Created by Cristiana Costa
 * on 2019-04-29
 * Program to test the class Person
 */

public class TestPerson {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("First Name: ");
        String firstName = scan.next();

        System.out.print("Last Name: ");
        String lastName = scan.next();

        System.out.print("Enter your ID: ");
        int id = scan.nextInt();

        System.out.print("Enter the number of scores: ");
        int numScores = scan.nextInt();

        int[] testScores = new int[numScores];

        for(int index = 0; index < numScores; index ++){
            System.out.print("Enter scores " + (index + 1) + ": ");
            testScores[index] = scan.nextInt();
        }

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculateGrade());

    } //main

} //class
