package linkedlist;

import jdk.dynalink.NoSuchDynamicMethodException;

/**
 * Created by Cristiana Costa
 * on 2019-06-28
 * Program to remove and add nodes
 */

public class LinkedList {
    //properties
    Node head;      //is the first node
    int count = 0;

    //constructors
    /*protected LinkedList(){
        head = null;
        count = 0;
    }*/

    protected LinkedList(Node newHead){
        head = newHead;
        count = 1;
    }

    // methods
    // add
    public void add(int newData){
        Node temp = new Node(newData);
        Node current = head;
        while(current.getNext() != null ){
            current = current.getNext();
        }
        current.setNext(temp);
        count ++;

    }

    //get the index in the list
    //if the input is invalid we return something invalid too
    public int get(int index){
        if(index <= 0){
            return -1;
        }
        Node current  = head;
        for(int i = 1; i < index; i++){
            current = current.getNext();
        }
        return current.getData();
    }

    //size
    public int size(){
        return count;
    }

    //isEmpty
    public boolean isEmpty(){
        return head == null;
    }

    //remove from the back of the list
    public void remove(){
        Node current = head;
        while(current.getNext().getNext() != null){
            current  = current.getNext();
        }
        current.setNext(null);
        count --;
    }


    public static void main(String[] args) {
    } //main

} //class
