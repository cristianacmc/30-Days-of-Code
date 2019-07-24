package StarWarsInterfacePractice;
import java.util.Random;

/**
 * Created by Cristiana Costa
 * on 2019-07-24
 * Program to create the character
 */

public class StarWarsInterfacePractice {

    public static Character summonCharacter(){
        Random rand = new Random();
        if(Math.abs(rand.nextInt()) % 2 == 0){
            return new Enemy();
        } else {
            return new Hero();
        }
    }

    public static void main(String[] args) {
        Enemy darthVader = new Enemy();
        Hero obiWan = new Hero();
        darthVader.attack();
        obiWan.attack();
        darthVader.heal();
        obiWan.heal();
        System.out.println("Enemy weapon: " + darthVader.getWeapon());
        System.out.println("Hero weapon: " + obiWan.getWeapon());

        Character spy = summonCharacter();
        spy.attack();
        spy.heal();
        spy.getWeapon();

    } //main

} //class
