package Tasks.Interview_Codes;

import java.util.Arrays;

/*
String -- Same letters
Write a return method that check if a string is build out of the same letters as another string.
Ex:  same("abc",  "cab"); -> true
same("abc",  "abb"); -> false:
 */
public class StringSameLetters {
    public static boolean isSameLetters(String a, String b) {

        char [] ch1 = a.toCharArray();
        char [] ch2 = b.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        String str1 = "";
        String str2 = "";

        for(char each : ch1){
            str1+=each;
        }
        for( char each : ch2){
            str2+=each;
        }

        return str1.equals(str2);
    }

    public static void main(String[] args) {
        System.out.println(isSameLetters("abc","cba"));
    }
}
