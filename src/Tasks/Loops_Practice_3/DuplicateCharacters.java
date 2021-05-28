package Tasks.Loops_Practice_3;
/*
[IQ] Duplicate characters
Given a String, find and print the duplicate characters.
A character is duplicate if it appears more than once in the String.
Ex:AAABCCDEEF
Output:ACE
 */
public class DuplicateCharacters {
    public static void main(String[] args) {
        String words="AAABCCDEEF";
        String duplicate=" ";
        int count=0;

        for(int i=0; i<words.length();i++){
            count=0;
            for(int n=0; n<words.length();n++){
                if(words.charAt(i)==words.charAt(n)){
                    count++;
                }
            }
            if(count>1 && !duplicate.contains(words.charAt(i)+"")){
                duplicate+=words.charAt(i);
            }
        }
        System.out.println(duplicate);
    }
}
