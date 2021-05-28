package Tasks.Loops_Practice_3;
/*
Camel Case
Given a String of words that follow Camel Case convention.
Find and print how many words are in the given String.
Every word, except the first word, begin with an uppercase letter.
The other characters of the word will be lowercase
Ex:Input:thisHasManyWordsToFind
Output: 6
 */
public class CamelCase {
    public static void main(String[] args) {

        String sentence = "iam In Love With Heaven And Ramy";
        int count = 0;
        for(int i=0; i<sentence.length();i++){
            if(sentence.charAt(i)>='A' && sentence.charAt(i)<='Z'){
                count++;
            }
        }
        System.out.println(count);
    }
}
