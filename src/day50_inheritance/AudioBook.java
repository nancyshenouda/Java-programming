package day50_inheritance;

public class AudioBook extends Book{
    int length;
    String narrator;

    public void listen(){
        System.out.println("listening to AudioBook: " + title);
        System.out.println("Author = " + author);
        System.out.println("Length: " + length);
        System.out.println("Price = " + price);
        System.out.println("Narrator: " + narrator);

    }
}
