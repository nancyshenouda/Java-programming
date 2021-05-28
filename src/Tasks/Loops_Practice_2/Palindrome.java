package Tasks.Loops_Practice_2;

import java.util.Scanner;

/*
[IQ] Palindrome A word that is the same read forwards and backwards.
User takes a word from the console. Print true if the word is a palindrome.
Print false if the word is not palindrome.-> input: civic-> output: true-
 */
public class Palindrome {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = scan.next();


        for (int i =0; i<=word.length()/2; i++) {

            if (word.charAt(0) == word.charAt(word.length()-1)) {

                System.out.println("true");
            break;
            }else{
                System.out.println("false");
               break;
            }
        }

//        System.out.println(" Enter your word");
//        String word = input.next();
//        int start = 0;
//        int end = word.length();
//        int m = 0;
//        for (int i = start; i <= word.length() / 2; i++) {
//            if (word.charAt(start) == word.charAt(end - 1)) {
//                m = i;
//
//
//                System.out.println(word + " is present");
//                break;

            }

}