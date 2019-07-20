package linkedlist;

/**
 * Created by Cristiana Costa
 * on 2019-06-28
 * Program to create a sequence of nodes
 */

public class Node{
    //properties - defining the nodes
    Node next;
    int data;

    //constructors
    Node(int newData){
        data = newData;
        next = null;
    }

    Node(Node newNext, int newData){
        data = newData;
        next = newNext;
    }

    //getters and setters
    public int getData(){
        return data;
    }

    public Node getNext(){
        return next;
    }

    public void setNext(Node newNode){
        next = newNode;
    }

    public void setData(int newData){
        data = newData;
    }




    //methods



    public static void main(String[] args) {
    } //main

} //class
