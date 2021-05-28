package Tasks.ArrayList_Practice_2;

import java.util.ArrayList;
import java.util.Arrays;

/*
Write a program that can extract the special characters, digits and letters from a string and stores them
into separate ArrayLists of Characters
Ex: str = "ABCD123$%#@&456EFG!"
list1: {$, %, #, @, &, !}
list2: {A, B, C, D, E, F, G}
list3: {1, 2, 3, 4, 5, 6}
 */
public class SeparateParts {
    public static void main(String[] args) {

        String str = "ABCD123$%#@&456EFG!";
        ArrayList<Character> digits = new ArrayList<>();
        ArrayList<Character> letter = new ArrayList<>();

        ArrayList<Character> special = new ArrayList<>();

        for(int i=0;i<str.length();i++ ){
            char eachChar = str.charAt(i);
            if(Character.isDigit(eachChar)){
                digits.add(eachChar);
            }
            else if(Character.isLetter(eachChar)){
                letter.add(eachChar);
            }
            else{
                special.add(eachChar);
            }
        }
        System.out.println("Integers = " + digits);
        System.out.println("letters = " + letter);
        System.out.println("special characters = " + special);
    }
}
