package day12_boolean_conditional_statements;
import java.util.Scanner;

public class AmazonFreeShipping {
    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
        System.out.println("Enter total price:");
        int totalPrice=scan.nextInt();
        if(totalPrice>=25) {
            System.out.println("Your order is eligible to Free shipping. Your total order is $" + totalPrice);
        }else {
            System.out.println("Your order is not eligible to free shipping. Your total order is $" +totalPrice);
        }
        System.out.println("Thank you for shopping with Amazon");


    }
}
