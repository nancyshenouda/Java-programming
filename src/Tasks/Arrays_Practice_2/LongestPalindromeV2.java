package Tasks.Arrays_Practice_2;
/*
[IQ] Longest Palindrome
Given a String array. Find the longest Palindrome String in your array.
Ex: Input: [“java”, “longer word”, “civic” “apple”,  “racecar”, “mom”, “anna”]
Output: racecar
Ex:Input: [“abc”, “dna”, “kevin”, “joe”, “lamp”]
Output: No palindrome
 */
public class LongestPalindromeV2 {
    public static void main(String[] args) {

        String [] words={"java","longer word", "civic","apple","racecar", "mom","anna"};
        String longestPalindrome="";
        String palindrome ="";

        for(int i=0;i< words.length;i++){
            for(int j=0;j<words[i].length()/2;j++){
                if(words[i].charAt(j)==words[i].charAt(words[i].length()-1-j)){
                    palindrome=words[i];
                }
                if(palindrome.length()>longestPalindrome.length()){
                    longestPalindrome=palindrome;
                }
            }
        }
        if(palindrome.isEmpty()){
            System.out.println("No palindrome");
        }else{
            System.out.println("Longest Palindrome is: " + longestPalindrome);
        }
    }
}
