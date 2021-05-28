package Tasks.Loops_Practice_2;

import java.util.Scanner;

/*
[IQ] Palindrome A word that is the same read forwards and backwards.
User takes a word from the console. Print true if the word is a palindrome.
Print false if the word is not palindrome.->
 input: civic-> output: true-> input: java-> output: false
 */
public class PalindromeV2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        System.out.println("please enter a word:");
        String word=scan.next();
        String first =word.substring(0,1);
        String lastLetter =word.substring(word.length()-1);

        for(int i=0; i<word.length()/2;i++){
            if(first.equals(lastLetter)){
                System.out.println("true");
                break;
            }else{
                System.out.println("false");
                break;
        }


        }

    }
}
