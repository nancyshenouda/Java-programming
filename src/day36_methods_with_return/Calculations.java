package day36_methods_with_return;

public class Calculations {
    public static void main(String[] args) {
        System.out.println("10 + 45 = " + Calculator.add(10,45));
        System.out.println("100 - 40 = " + Calculator.minus(100,40));
        System.out.println("10 * 20 = " + Calculator.multiply(10,20));
        System.out.println("100 / 50 = " + Calculator.divide(100,50));
        
        double d1=634.5;
        double d2=456.5;
        double sum = Calculator.add(d1,d2);
        System.out.println("sum = " + sum);
        double result= Calculator.minus(d1,d2);
        System.out.println("result = " + result);
       
        
    }
}
