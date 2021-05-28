package day09_scanner_practice;

import java.util.Scanner;
public class GroceryShopping {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("*** Target Receipt ****");
        System.out.println("Enter Price for milk: ");
        double price1=scan.nextDouble();

        System.out.println("Enter Price for bread");
        double price2=scan.nextDouble();

        System.out.println("Enter price for bread ");
        double price3=scan.nextDouble();

        double total=price1+price2+price3;
        System.out.println("Total $" + total);







    }
}
