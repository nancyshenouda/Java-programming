package day37_methods_overloading;

import java.util.Arrays;

public class OverLoadMain {
    public static void main(String[] args) {
        System.out.println("Hello from real main method");
        main(5,5);
        System.out.println(Arrays.toString(args));
        // we write the values of the args(arguments) in the edit configurations under arguments
        // it will show in the console as an Array

    }
    public static void main(int num1, int num2){
        System.out.println("Sum = " + (num1 + num2));
    }
}
