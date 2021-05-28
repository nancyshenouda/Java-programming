package Tasks.String_Practice;


//import java.util.Scanner;

/*
[Remove first and last]Given two words.
Print the first word without its first character then print the second word without its last character.
Input:
apple
banana
Output:
pple
banan
 */
public class RemoveFirstAndLastV2 {
    public static void main(String [] args){

        //Scanner scan = new Scanner(System.in);

        String word1="apple";
        String word2="banana";

        String firstLetter = word1.substring(0,1);
        String lastLetter = word2.substring(0, word2.length()-1);

        System.out.println(word1.replace(firstLetter,""));
        System.out.println(lastLetter);


    }
}
