package OfficeHours.Practice_05_25_2021;

import java.util.Arrays;

/*
Pangram –Not ArrayList task
A Pangram is a String that contains all of the letters in the alphabet.
Create a method that will accept a String and determine if the given String is a pangram. If it is a pangram return true,
otherwise return false.
Example Pangrams:
-A quick brown fox jumps over the lazy dog.
-Back in June we delivered oxygen equipment of the same size.
 */
public class Pangram {
    public static void main(String[] args) {

        String s = "A quick brown fox jumps over the lazy dog.";
       // System.out.println(isPangram(""));

        char [] a = s.replace(" ", "").toLowerCase().toCharArray();
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        System.out.println(isPangram(s));

    }
    public static boolean isPangram(String str){

        str= str.toLowerCase();

        String alp = "abcdefghijklmnopqrstuvwxyz";

        for(int i =0 ; i< str.length();i++){
           if(Character.isLetter(str.charAt(i))){
               alp.replace("" + str.charAt(i),"");
               //System.out.println(str.charAt(i) + " " + alp);
           }
        }
        return alp.isEmpty();
    }
}
