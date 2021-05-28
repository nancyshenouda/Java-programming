package Tasks.Arrays_Practice_2;

import java.util.Arrays;

/*
Multiple Words
Given a String of words that are separate by commas.
Find and print any words that have more than one word
Example
Input: "knife, wooden spoons, plates, cups, forks, pan, pot, trash can,fridge,dish washer”
Output: wooden spoons trash can dish washer
 */
public class MultipleWordsV2 {
    public static void main(String[] args) {

        String words= "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer";

        String []wordsArray=words.split(", ");
        String twoWords="";

        for(int i=0;i<wordsArray.length;i++){
            if(wordsArray[i].contains(" ")){
                System.out.println(wordsArray[i].trim());

            }
        }

    }
}
