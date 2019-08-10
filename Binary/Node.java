package Binary;

/**
 * Created by Cristiana Costa
 * on 2019-08-10
 * Program to create a Node class
 */

public class Node {

    int key;
    String name;
    Node leftChild;
    Node rightChild;

    //constructor
    Node(int customKey, String customName){
        key = customKey;
        name = customName;
    }

    public String toString(){
        return name + "has the key " + key;
    }

} //class