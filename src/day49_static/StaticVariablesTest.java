package day49_static;

public class StaticVariablesTest {
    public static void main(String[] args) {
        // We can call these variables from the other class because they are all static
        System.out.println("Name: " + StaticVariables.name);
        System.out.println("userName: " + StaticVariables.userName);
        System.out.println("Age: " + StaticVariables.age);
        System.out.println("Price: " + StaticVariables.price);
    }
}
