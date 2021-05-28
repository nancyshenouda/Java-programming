package Tasks.Loops_Practice_1;

import java.util.Scanner;

/*
•Write a program that can ask the user "enter a number" five times and return the minimum number
 */
public class MinNumberV2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
int firstNumber = scan.nextInt();
        int number=0;
        int minNumber=firstNumber;
        int maxNumber=firstNumber;


        for(int i=0; i<4 ; i++){
            System.out.println("Enter a number");
            number = scan.nextInt();
            if(number>maxNumber) {
                maxNumber = number;
            }
            if(number<minNumber){
                minNumber=number;
            }
        }
        System.out.println("maxNumber = " + maxNumber);
        System.out.println("minNumber = " + minNumber);
    }
}
