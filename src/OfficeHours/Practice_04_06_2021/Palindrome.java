package OfficeHours.Practice_04_06_2021;
/*
A word that is the same read forwards and backwards.
User takes a word from the console. Print true if the word is a palindrome.
Print false if the word is not palindrome.->
input: civic-> output: true->
input: java-> output: false
 */
public class Palindrome {
    public static void main(String[] args) {

        String word = "civic";
        boolean isPalindrome = true;

        for(int i=0; i<word.length()/2;i++){
            if(word.charAt(i)!= word.charAt(word.length()-1-i)){
                isPalindrome=false;
                break;
            }

        }
        System.out.println(isPalindrome);
    }
}
