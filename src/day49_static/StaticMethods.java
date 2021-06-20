package day49_static;

public class StaticMethods {

    int num = 10;
    static int count = 5;

    public static void displayMessage(String message) {
        System.out.println("message: " + message);
        //System.out.println("num = " + num); //ERROR: num is instance variable. static methods cannot access instance variables
        System.out.println("count = " + count); //no error. count is static variable
    }

    public static void anotherStaticMethod() {
        System.out.println("another static method");
        displayMessage("wooden spoon");
    }

    public void instanceMethod() {
        System.out.println("instanceMethod");
        System.out.println("num = " + num); // instance method can access the instance variable
        System.out.println("count = " + count); // instance method can access the static variable
        displayMessage("hello from instance method");
    }
    //StaticMethods.instanceMethod(); //> no it needs an object to call it.
    //StaticMethods stm = new StaticMethods();
    //stm.instanceMethod();

}


