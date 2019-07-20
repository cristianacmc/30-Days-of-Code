package Books;

/**
 * Created by Cristiana Costa
 * on 2019-05-03
 * Program to create an abstract class Book
 */

public abstract class Book {

    // instance variables
    String title;
    String author;


    // constructor methods
    Book(){

    }

    Book(String customTitle, String customAuthor){

        title = customTitle;
        author = customAuthor;
    }

    //abstract method declaration
    protected abstract void display();

} //class
