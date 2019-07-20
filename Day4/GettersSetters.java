package Day4;

import java.util.TreeMap;

/**
 * Created by Cristiana Costa on 2019-02-23
 * COMMENTS ABOUT PROGRAM HERE
 * Program to represent a car object
 */

public class GettersSetters {

    //properties fields of the car
    int maxSpeed = 100;
    int minSpeed = 0;
    double weight = 4079;
    boolean isTheCarOn = false;
    char condition = 'A';
    String nameOfCar = "Lucy";
    double maxFuel = 16;
    double currentFuel = 8;
    double mpg = 26.4;
    int numberOfPeopleInCar = 1;

    public void printVariables() {
        System.out.println(maxSpeed);
        System.out.println(minSpeed);
        System.out.println(weight);
        System.out.println(isTheCarOn);
        System.out.println(condition);
        System.out.println(nameOfCar);
        System.out.println(numberOfPeopleInCar);
    }

    public void wreckCar() {

        condition = 'C';
    }

    public void upgradeMinSpeed() {
        minSpeed = maxSpeed;
        maxSpeed += 1;
    }

    public void getIn() {
        numberOfPeopleInCar++;
    }

    public void getOut() {
        numberOfPeopleInCar--;
    }

    public double howManyMilesTillOutOfGas() {
        return currentFuel * mpg;
    }

    public double maxMilesPerFillUp() {
        return maxFuel * mpg;
    }


    public GettersSetters(int customMaxSpeed, double customWeight, boolean customIsTheCarOn) {
        maxSpeed = customMaxSpeed;
        weight = customWeight;
        isTheCarOn = customIsTheCarOn;
    }

    //getters  setters
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public int getMinSpeed() {
        return this.minSpeed;
    }

    public double getMpg() {
        return this.mpg;
    }

    //setters
    public void setMaxSpeed(int newMaxSpeed) {
        this.maxSpeed = newMaxSpeed;
    }

    public void upgradeMaxSpeed() {
        setMaxSpeed(getMaxSpeed() + 10);
    }

    public static void main(String[] args) {
        System.out.println("Birthday Car");
        GettersSetters birthdayPresentCar = new GettersSetters(500, 5000.545, true);
        birthdayPresentCar.printVariables();
        birthdayPresentCar.getIn();
        birthdayPresentCar.getIn();
        birthdayPresentCar.getIn();
        System.out.println("Miles left: " + birthdayPresentCar.howManyMilesTillOutOfGas());
        System.out.println("Max miles: " + birthdayPresentCar.maxMilesPerFillUp());
        birthdayPresentCar.printVariables();
        System.out.println("Christmas Car");
        GettersSetters christmasPresent = new GettersSetters(550, 2000.2, false);
        christmasPresent.getOut();
        christmasPresent.printVariables();


    } //main

} //class