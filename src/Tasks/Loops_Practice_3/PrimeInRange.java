package Tasks.Loops_Practice_3;

import java.util.Scanner;
/*

[IQ] Prime in range
Given a number. Print out all the prime numbers from 2 to that number
A prime number is a number that is only divisible by 1 and itself.
Ex:Input:50
Output:2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47

 */
public class PrimeInRange {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        for(int i=1;i<=number;i++ ){
            int prime=0;
                for(int j=1; j<=i;j++){
                 if( i%j==0) {
                prime++;
            }
            }
            if(prime==2){
                    System.out.print(i + " ");}
                }
        }

    }

