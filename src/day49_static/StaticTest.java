package day49_static;

public class StaticTest {
    // we have to add static to string to print it down
    static String word= "Java";

    public static void main(String[] args) {
        //1) static method can be called using class name
        StaticMethods.displayMessage("wooden spoon");
        //1)  instance method needs an object to be called
        //StaticMethod.instanceMethod();Error
        StaticMethods stm = new StaticMethods();
        stm.instanceMethod();

        //2) static method can only access other static variable and methods
        System.out.println(word);
    }
}
