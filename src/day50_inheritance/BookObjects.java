package day50_inheritance;

public class BookObjects {
    public static void main(String[] args) {

        Book book = new Book();
        book.title = "Intro to Java";
        book.author = "Nancy Shenouda";
        book.type = "Programming";
        book.price = 85.0;

        System.out.println("Title = " + book.title);
        System.out.println("Author = " + book.author);
        System.out.println("Type = " + book.type);
        System.out.println("Price = " + book.price);


        AudioBook audioBook = new AudioBook();
        audioBook.title = "Selenium";
        audioBook.type = "IT";
        audioBook.narrator = "Mariam";
        audioBook.price = 99.9;
        audioBook.author = "Ramy";
        audioBook.length = 100;

        audioBook.listen();
        System.out.println("******************");
        EBook eBook = new EBook();
        eBook.title= book.title;
        eBook.type = book.type;
        eBook.author= book.author;
        eBook.price= book.price;
        eBook.size = 2;
        eBook.pages= 140;

        eBook.readBook();


    }
}
