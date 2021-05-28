package day36_methods_with_return;

public class Calculator {
    public static void main(String[] args) {
        System.out.println(add(33, 55));
        double result = add(1, 5); // additional variable
        System.out.println("result = " + result);
        System.out.println("Sum of 10 and 30 = " + add(10, 30));
        System.out.println(minus(10, 4));//6
        System.out.println(multiply(10, 4));//40
        System.out.println(divide(10, 4));//2.5

    }

    public static double add(double num1, double num2) {
        double sum = num1 + num2;
        return sum;
    }

    public static double minus(double num1, double num2) {
        double sum = num1 - num2;
        return sum;
    }
    public static double multiply(double num1, double num2) {
        double sum = num1 * num2;
        return sum;
    }
    public static double divide(double num1, double num2) {
        double sum = num1 / num2;
        return sum;
    }
}