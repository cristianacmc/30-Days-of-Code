package Dog;

/**
 * Created by Cristiana Costa
 * on 2019-05-03
 * Program to create an abstract class Canine
 */

// superclass
public abstract class Canine {

    //instance variable
    String name;
    String color;
    String gender;
    int age;

    Canine(){

    }

    Canine(String customName, String customColor, char mF, int customAge){
        name = customName;
        color = customColor;
        gender = (mF == 'M') ? "Male " : "Female";
        age = customAge;
    }

    //abstract method declaration
    protected abstract String getBreed();


    // abstract method
    protected void printInfo(){
        System.out.println(name + " is " + ((age %10 == 8)? "an ": "a ")+ age + " year old " + gender + getBreed()+ " with a color " + "coat.");
    }


} //class
