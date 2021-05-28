package day10_shorthand_operators;

import java.util.Scanner;
public class WeatherChange {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("How is the weather today?");
        //String weather = scan.next();
        // for String we only do scan.next(), no need to add the String part after =
        scan.nextLine();
        String weather = scan.nextLine(); //this will print the entire line and not just the first letter
        System.out.println(weather + " - is a nice day today!");
    }
}
