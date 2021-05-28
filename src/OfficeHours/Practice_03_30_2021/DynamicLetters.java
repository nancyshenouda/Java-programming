package OfficeHours.Practice_03_30_2021;


import java.util.Scanner;

public class DynamicLetters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Do you want uppercase or lowercase");
        String upperOrLower = input.next();
        int starting;
        int ending;

        System.out.println("Do you want ascending or descending?");

        String isAscendingOrDescending= input.next();

        if(upperOrLower.equals("uppercase")) {
            starting = 'A';
            ending = 'Z';
        } else {
            starting = 'a';
            ending = 'z';
        }
        if(isAscendingOrDescending.equals("ascending")) {
            for(int i= starting; i <= ending; i++) {
                System.out.print((char)i + " ");
            }
        } else {
            for(int i= ending; i >= starting; i--) {
                System.out.print((char)i + " ");
            }
        }
    }
}