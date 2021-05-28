package OfficeHours.Practice_04_19_2021;

import day38_methods.Reverse;
import day38_methods.StringUtils;

/*
Reverse Each word
Given a String,reverse each individual word and print the result
Hint: Use a nested loop, split
Input:It started to snow in Chicago
Output:tIdetratsotwonsniogacihC
 */
public class ReverseEachWord {
    public static String reverseEachWord(String str){

        String reverse="";

        for (String each : str.split(" ")){

            reverse+= Reverse.reverse(each) + " ";// we found the same method in another class (Reverse)
            // and called it here and printed it in the MethodClassAndTest class
        }
        return reverse;
    }
}
