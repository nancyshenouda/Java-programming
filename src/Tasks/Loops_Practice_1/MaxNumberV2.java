package Tasks.Loops_Practice_1;

import java.util.Scanner;

/*
•Write a program that can ask the user "enter a number" five times and return the maximum number
 */
public class MaxNumberV2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int number =0;
        int maxNumber =0;
        int attempts=1;

        while(attempts < 6){
            System.out.println("Enter a number");
            number = scan.nextInt();
            if(number>maxNumber){
                maxNumber=number;
            }
            attempts++;

        }
        System.out.println("Max number  = " + maxNumber);

    }
}
