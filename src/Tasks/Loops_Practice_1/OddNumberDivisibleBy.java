package Tasks.Loops_Practice_1;

import java.util.Scanner;

/*
• Write a program that can print all the ODD numbers between 0 ~ 100
that can be divisible by 3 & 5
 */
public class OddNumberDivisibleBy {

    public static void main(String[] args) {
        
        int oddNumber=0;
        
        while(oddNumber<101){
            if(oddNumber%5==0 && oddNumber%3==0 && oddNumber%2!=0){
                System.out.println("oddNumber = " + oddNumber);
            }
            oddNumber++;

        }


            int i = 1;
            int j = 1;

            Scanner scan = new Scanner(System.in);

            int n = scan.nextInt();

            for (i = 1; i <=n ; i++) {
                for (j = 1; j <=i ; j++) {
                    System.out.print("*");

                }
                System.out.println("");

            }

        }
        
    }

