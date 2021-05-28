package OfficeHours.Practice_03_10_2021;
import java.util.Scanner;
public class MovieDuration {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the movie");
        double movieLength = input.nextDouble();
        double price = 0;

        if (movieLength == 1) {
            price = 8.99;
            System.out.println("price = " + price);
        }

     if(movieLength==1.5){
         price=10.50;
         System.out.println("price = " + price);}
    }
}
