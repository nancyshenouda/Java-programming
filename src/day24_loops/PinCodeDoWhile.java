package day24_loops;

import java.util.Scanner;

public class PinCodeDoWhile {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int secretPinCode= 1234;
        int pinCode=0;  // we have to declare the variables in the beginning
        // to make it VISIBLE to all the conditions below

        do{
            System.out.println("Please enter your pin code:");

            pinCode= scan.nextInt();

        }while(pinCode!=secretPinCode);


        System.out.println("Welcome to your account.");
    }
}
