package Tasks.Loops_Practice_1;

import java.util.Scanner;

/*
• Write a program that will ask ‘upper’ or ‘lower’
• If it is upper: print the alphabet in all uppercase letter from A to Z
• If it is lower: print the alphabet in all uppercase letter from a to z
- Challenge: Also ask if they want to show the alphabet in ascending or
order descending
- Ascending: A – Z or a – z
- Descending: Z – A or z – a
 */
public class DynamicAlphabet {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Is the letter upper or lower?");

        String check= scan.next();
        if(check.equalsIgnoreCase("upper")){
          char start ='A';
        while(start<='Z'){
            System.out.print(start++ + " ");}


        }else if(check.equalsIgnoreCase("lower")){
            char start = 'a';
           while(start<='z'){
                System.out.print(start++ + " ");}
            }
        }

        }



