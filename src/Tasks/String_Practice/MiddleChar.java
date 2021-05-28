package Tasks.String_Practice;

/*
[Middle char]
Given a String, write a program to display the middle character of a string
a) If the length of the string is even there will be two middle characters.
b) If the length of the string is odd there will be one middle character.
Ex:
Input: elephant
Output: The middle characters: ph
 */
public class MiddleChar {
    public static void main(String[] args) {

        String word = "amazing";

        String evenMiddle = word.substring(word.length()/2-1,word.length()/2+1);
        char oddMiddle=word.charAt(word.length()/2);
        if(word.length()%2==0){
        System.out.println(evenMiddle);
        }else if(word.length()%2!=0){
            System.out.println(oddMiddle);
        }


    }
}
