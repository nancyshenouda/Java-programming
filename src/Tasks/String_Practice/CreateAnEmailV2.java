package Tasks.String_Practice;

import java.util.Scanner;

/*
[Creating an email]
Ask user to enter two strings. Both of these strings should be at least 6 character long.
If they are shorter than that print “Invalid data” and program should end.
If the information provided is valid, you will take the first 4 characters
of first string and combine them with the last three characters of the second string.
At the end of your combined string add “@cybertek.com” and print the final string as your created email.
The final email should be in all lowercase.
input:
JamesBond
Secret
output:jameret@cybertek.com
 */
public class CreateAnEmailV2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);

        String word1 = scan.next();
        String word2 = scan.next();
        String email="";

        if(word1.length()>=6 && word2.length()>=6){

          email =  word1.substring(0,4);

            email+=word2.substring(word2.length()-3);

            System.out.println(email+"@cybertek.com");

        }else {
            System.out.println("Invalid data");
        }
        }
    }

