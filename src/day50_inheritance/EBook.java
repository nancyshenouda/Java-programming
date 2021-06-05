package day50_inheritance;

public class EBook extends Book{

    int size;
    int pages;
    public void readBook(){
        System.out.println("We are reading " + title);
        System.out.println("type: " + type);
        System.out.println("Author: " + author);
        System.out.println("Size: " + size);
        System.out.println("Pages: " + pages);
    }





}
