package Tasks.Arrays_Practice_2;

import java.util.Arrays;

/*
Given a String,reverse each individual word and print the result
Hint: Use a nested loop, split
Input:It started to snow in Chicago
Output:tI detrats ot wons ni ogacihC
 */
public class ReverseEachWord {
    public static void main(String[] args) {
String reversed="";
        String words="It started to snow in Chicago";
        String [] sentence =words.split(" ");

        for(int i =sentence.length-1;i>=0;i--){
            for(int j=0; j<sentence.length-1; j++){
                reversed+=sentence[i]+" ";
            }

        }
        System.out.print(reversed);

        }

            }





