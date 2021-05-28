package Tasks.Loops_Practice_3;

/*
Given a String book with all the text of your book.
Figure out how much you will make from your book.
Each chapter you have in your book will add 10 $ value to your book.
Go through your book and figure out the value of the book. Ignore case sensitivity.
 */
public class BookValue {
    public static void main(String[] args) {

        String book="Java textbook By Murodil. " +
                "Chapter 1 datatypes and variables. " +
                "Chapter 2 conditional statements. " +
                "chapter 3 String manipulation. " +
                "Chapter 4 Loops. " +
                "Chapter 5 Arrays. " +
                "Chapter 6 Methods. " +
                "chapter 7 ArrayList. " +
                "chapter 8 instance and static. " +
                "Chapter 9 Constructors. " +
                "Chapter 10 Encapsulation and Inheritance. " +
                "Chapter 11 Abstraction and Polymorphism. " +
                "Chapter 12 Exceptions. " +
                "Chapter 13 Collections. " +
                "Chapter 14 Learn more.";
        int value=0;
        book=book.toLowerCase();
        for (int i =0; i<book.length();i++){
            if(book.contains("chapter")){
                book = book.replaceFirst("chapter", "");
                value+=10;
            }
        }
        System.out.println("Book value: " + value + " $");
    }
}
