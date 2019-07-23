import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Cristiana Costa
 * on 2019-07-23
 * Program to show how queues work
 */

public class Queuey {

    LinkedList queue;

    //making a queue instance
    protected Queuey(){
        queue = new LinkedList();
    }

    //is our queue empty?
    protected boolean isEmpty(){
        return queue.isEmpty();
    }

    //what is the size of our queue?
    protected int size(){
        return queue.size();
    }

    //enqueuing an item
    protected void enqueue(int n){
        queue.addLast(n);
    }

    //dequeueing an item
    protected int dequeue(){
        return (int) queue.remove(0);
    }

    //Peek at the fisrt item
    protected int peek(){
        return (int) queue.get(0);
    }

    public static void main(String[] args) {
        Queuey numberQueue = new Queuey();
        numberQueue.enqueue(5);
        numberQueue.enqueue(6);
        numberQueue.enqueue(7);
        System.out.println("Peek at first item: " + numberQueue.peek());
        System.out.println("First out: " + numberQueue.dequeue());
        System.out.println("Peek at second item: " + numberQueue.peek());
        System.out.println("Second out: " + numberQueue.dequeue());
        System.out.println("Peek at thrid item: " + numberQueue.peek());
        System.out.println("Third out: " + numberQueue.dequeue());
        System.out.println();

    } //main

} //class
