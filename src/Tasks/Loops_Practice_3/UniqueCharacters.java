package Tasks.Loops_Practice_3;
/*
[IQ] Unique characters
Given a String,
find and print the unique characters.
A character is unique if it only appears once in the String.
Ex:AAABCCDEEF
Output:BDF
 */
public class UniqueCharacters {
    public static void main(String[] args) {
        String words = "AAABCCDEEF";
        String unique = " ";
        int count = 0;

        for (int i = 0; i < words.length(); i++) {
            count = 0;
            for (int n = 0; n < words.length(); n++) {

                if (words.charAt(i) == words.charAt(n)) {
                    count++;
                }
            }
            if (count == 1) {
                unique += words.charAt(i);
            }
        }
        System.out.println(unique);

    }
}