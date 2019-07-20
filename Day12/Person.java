package Day12;

/**
 * Created by Cristiana Costa
 * on 2019-04-29
 * Program to create the super class Person
 */

public class Person {

    //instance variables
    private String firstName;
    private String lastName;
    private int id;

    //constructor methods
    Person(String customFirstName, String customLastName, int customId ){
        firstName = customFirstName;
        lastName = customLastName;
        id = customId;
    }

    //print person data
    public void printPerson(){
        System.out.println(
                "Name: " + lastName + ", " + firstName +
                        "\nID: " + id);
    }

    public static void main(String[] args) {
    } //main

} //class
