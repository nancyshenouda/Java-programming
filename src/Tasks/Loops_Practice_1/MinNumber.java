package Tasks.Loops_Practice_1;

/*
Write a program that can ask the user "enter a number" five times
and return the minimum number
 */
import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int number;
        int minNumber=1;
        int attempts=1;

        while(attempts <6){
            System.out.println("Enter a number:");
            number = scan.nextInt();
            if(number<=minNumber) {
               minNumber=number;
            }
            attempts++;
            }
        System.out.println("Minimum number is - "+ minNumber);
        }

    }

