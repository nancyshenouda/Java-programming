package Tasks.Arrays_Practice_2;

import java.util.Arrays;

/*
Multiple Words
Given a String of words that are separate by commas.
Find and print any words that have more than one word
Example Input: "knife, wooden spoons, plates, cups, forks, pan, pot, trash can,fridge,dish washer”
Output: wooden spoons,trash can, dish washer
 */
public class MultipleWords {
    public static void main(String[] args) {

        String items= "knife, wooden spoons, plates, cups, forks, pan, pot,  trash can, fridge,  dish washer";
        String []itemsArray=items.split(", ");
        String multiple="";

        for(int i=0; i< itemsArray.length;i++){
            if(itemsArray[i].contains(" ")){

                System.out.println(itemsArray[i].trim());
            }

        }

        }

    }

