package Tasks.String_Practice;

import java.util.Scanner;

/*
[Middle char]
Given a String, write a program to display the middle character of a string)
If the length of the string is even there will be two middle characters.)
If the length of the string is odd there will be one middle character.
Ex:Input: elephant

Output: The middle characters: ph
 */
public class MiddleCharV2 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        String word = scan.next();

        String middleEven = word.substring(word.length()/2-1,word.length()/2+1);
        char middleOdd=word.charAt(word.length()/2);

        if(word.length()%2==0) {

            System.out.println(middleEven);
        }else if(word.length()%2!=0){
            System.out.println(middleOdd);
        }
    }
}
