package OfficeHours.Practice_03_03_2021;

//Make a class Stage1Calculator
//create a main method
//
//    - Declare two double variables
//    - Declare 5 more double variables for each operation.
//        > Execute all the operation between the first two numbers
//    - Print out operations
//        Ex: if the nums are 5 and 10
//            5 + 10 = 15
//            5 - 10 = -5
//            etc..
public class Stage1Calculator {
    public static void main(String [] args) {
        double num1=5.0;
        double num2=10.0;
        double addition=num1+num2;
        double subtraction=num1-num2;
        double multiplication=num1*num2;
        double division=num1/num2;
        double remainder=num1%num2;

        System.out.println("Calculation for " + num1 + " & " + num2 + " is " +addition);
        System.out.println("Calculation for " + num1 + " minus " + num2 + " is " + subtraction);
        System.out.println(num1 + " * " + num2 + " = " + multiplication);
        System.out.println(num1 + " / " + num2 + " = " + division);
        System.out.println(num1 + " % " + num2 + " = " + remainder);
    }
}
