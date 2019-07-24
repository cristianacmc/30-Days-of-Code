import java.util.*;

/**
 * Created by Cristiana Costa
 * on 2019-07-24
 * Program to check if a word is palindrome using queue and stack
 */


public class Palindrome {

    Queue<Character> queue = new LinkedList<Character>();
    Stack<Character> stack = new Stack<Character>();

    // methods
    protected void enqueueChar(char c){
        queue.add(c);
    }

    protected void pushCharacter(char c){
        stack.push(c);
    }

    public char popChar(){
        return stack.pop();
    }

    public char dequeueChar(){
        return queue.remove();
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Word: ");
        String word = scan.nextLine();

        //convert inout string to an array of characters:
        char[] s = word.toCharArray();

        //create a solutuon object:
        Palindrome p = new Palindrome();

        //enqueue/push all chars to thei respective data structures
        for(char c: s){
            p.enqueueChar(c);
            p.pushCharacter(c);
        }

        //pop/dequeue the chars at the head of both data structures and compare them
        boolean isPalindrome = true;
        for(int i = 0; i < s.length/2; i++){
            if(p.popChar() != p.dequeueChar()){
                isPalindrome = false;
            }
        }

        //finally, print weather string s is palindrome or not
        System.out.println("The word, " + word + " is " + ((!isPalindrome)? "not a palindrome." : "a palindrome."));

    } //main

} //class
