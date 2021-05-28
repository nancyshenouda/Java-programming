package Tasks.Loops_Practice_3;
/*
Reverse only second word
Given a String with three words separated by spaces.
Reverse only the second word and return the modified String
Ex:I love java
I evol java
 */
public class ReverseOnlySecondWord {
    public static void main(String[] args) {
//                         0123456
        String sentence = "I love java";
        String secondWord="";
        String reversedWord="";


        secondWord=sentence.substring(sentence.indexOf(" ") +1,sentence.lastIndexOf(" "));

        for(int i=secondWord.length()-1; i>=0;i--){
           reversedWord+=secondWord.charAt(i);

            }
        System.out.println(reversedWord);
        }

            }
