package StarWarsInterfacePractice;

/**
 * Created by Cristiana Costa
 * on 2019-07-24
 * Program to
 */

public class Enemy implements Character{

    //properties
    public String weapon = "lightsaber";

    //constructor
    public Enemy(){

    }
    @Override
    public void attack() {
        System.out.println("Thew enemy attacks you!");
    }

    public void heal(){
        System.out.println("The enemy heals himself");
    }

    public void weaponDraw(){
        System.out.println("Draw out wepon ");
    }

    public String getWeapon(){
        return weapon;

    }
} //class
