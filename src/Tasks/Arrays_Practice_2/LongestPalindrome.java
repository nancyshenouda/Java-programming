package Tasks.Arrays_Practice_2;
/*
[IQ] Longest Palindrome
Given a String array. Find the longest Palindrome String in your array.
Ex: Input: [“java”, “longer word”, “civic” “apple”,  “racecar”, “mom”, “anna”]
Output: racecar
Ex:Input: [“abc”, “dna”, “kevin”, “joe”, “lamp”]
Output: No palindrome
 */
import java.util.Arrays;
public class LongestPalindrome {
    public static void main(String[] args) {

        String[] items = {"java", "longer word", "civic", "apple", "racecar", "mom", "anna"};

        String longest = "";
        String palindrome = "";

        for(int i=0; i<items.length;i++){
            for(int n=0; n<items[i].length()/2;n++){

                if(items[i].charAt(n)==items[i].charAt(items[i].length()-1-n)){
                    palindrome=items[i];
                    if(palindrome.length()>longest.length()){
                        longest=palindrome;
                    }
                }

            }

        }if(palindrome.isEmpty()){
    System.out.println("not palindrome");
}else{
    System.out.println("Palindrome word is "+ longest);
}
    }

    }

