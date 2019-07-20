package Dog;

/**
 * Created by Cristiana Costa
 * on 2019-05-03
 * Program to create a subclass of canine
 */

 class KleeKai extends Canine {

     KleeKai(String customName, String customColor, char mF, int customAge){
         super(customName, customColor, mF, customAge);
     }

     // abstract method implementation
    protected String getBreed(){
         return " Klee Kai";
    }

} //class
