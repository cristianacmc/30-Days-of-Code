package Books;

/**
 * Created by Cristiana Costa
 * on 2019-05-03
 * Program to create the subclass MyBook that inherits from the superclass Book
 */

public class MyBook extends Book {
    int price;

    MyBook (String customTitle, String customAuthor, int customPrice){
        super(customTitle, customAuthor);
        price = customPrice;
    }

    protected void display(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }


} //class
