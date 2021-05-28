package OfficeHours.practice_03_08_2021;

import java.util.Scanner;
public class Rectangle {
    public static void main(String[] args) {
       double length=5;
       double width=3;
        System.out.println("What is the rectangle diamentions? ");
        //Calculate the Perimeter 2(l*w)
               // - Calculate the Area (w * l)
        Scanner input=new Scanner(System.in);
        length=input.nextDouble();
        width=input.nextDouble();
        double perimeter=2*(length+width);
        double area=(width*length);
        System.out.println("Perimeter = " + perimeter);
        System.out.println("area = " + area);



    }

}
