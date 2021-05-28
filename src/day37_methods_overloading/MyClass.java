package day37_methods_overloading;

public class MyClass {
    public static void main(String[] args) {
        System.out.println(myMethod(4,5,1));
    }
    // methods overloading must have SAME name but different parameters.
    public static int myMethod(int num1, int num2){
        return num1+num2;
    }
    public static int myMethod(int num1, int num2, int num3) {
        return num1*num2*num3;
    }
    public static String myMethod(String word){
        return word;

    }
    public static double myMethod(double num1) {
        return num1;
    }
    public static void myMethod(double num1, boolean b){


    }
    public static void myMethod(boolean b, double num){

    }
    }

