package Day12;

/**
 * Created by Cristiana Costa
 * on 2019-04-29
 * Program to create the subclass Student
 */

public class Student extends Person {

    // class variable
    protected int [] scores;

    //constructor
    Student(String customFirstName, String customLastName, int customId, int [] customScores ){

        super(customFirstName, customLastName, customId);
        scores = customScores;

    }

    protected char calculateGrade(){
        int average = 0;
        char grade;
        for(int index = 0; index < scores.length; index ++){
            average += scores[index];
        }
        average /= scores.length;

        if (average >= 90){
            return 'O';
        } else if (average >= 80) {
            return 'E';
        } else if (average >= 70) {
            return 'A';
        } else if (average >= 55) {
            return 'P';
        } else if (average >= 40) {
            return 'D';
        } else {
            return 'T';
        }

    }

    public static void main(String[] args) {
    } //main

} //class
