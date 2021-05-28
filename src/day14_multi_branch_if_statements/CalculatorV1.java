package day14_multi_branch_if_statements;

import com.sun.xml.internal.xsom.XSUnionSimpleType;

public class CalculatorV1 {
    public static void main(String[] args) {
        double  num1=10;
        double  num2=40;
        char operator='/';

         if(operator=='+') {
             System.out.println(num1 + num2);
         }else if(operator=='-'){
             System.out.println(num1-num2);
         }else if(operator== '*') {
             System.out.println(num1 * num2);
         }else if(operator=='/'){
             System.out.println(num1/num2);
         }else{
             System.out.println("Invalid result - " + operator);
         }

    }
}
