package StarWarsInterfacePractice;

/**
 * Created by Cristiana Costa
 * on 2019-07-24
 * Program to create a Hero class
 */

public class Hero implements Character{

    public String weapon = "The Force";


    public void attack(){
        System.out.println("The hero attacks the eneny");
    }

    public void heal(){
        System.out.println("The hero heals you");
    }

    public String getWeapon(){
        return weapon;

    }



} //class
