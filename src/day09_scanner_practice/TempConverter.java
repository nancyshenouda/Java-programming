package day09_scanner_practice;

import java.util.Scanner;
public class TempConverter {
    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
        System.out.println("***** Temperature Converter ******");
        System.out.println("Enter the Feh degree: ");
        double FahDegree= scan.nextDouble();
        double formula=((FahDegree-32)*5/9);
        System.out.println(FahDegree + " Fahrenheit degrees equals "+ formula + " Celsius");


    }

}
