package OfficeHours.Practice_04_06_2021;
/*
Given a String find the biggest substring of chars that match and print it.
Ex: aaabbbcccccddddee
Output: ccccc
 */
public class LongestSubstring {
    public static void main(String[] args) {

        String word = "aaabbbcccccddddeeeeeeeeeea ";
        String longestString = "";
        String temp = "";

        for(int i=0; i<word.length()-1;i++){

            temp+= word.charAt(i);
           // System.out.println(temp);

            if(word.charAt(i)!= word.charAt(i + 1) || i== word.length()-2){
                if(temp.length()> longestString.length()){
                longestString=temp;
                }
                temp="";
            }
        }
        System.out.println("Longest Substring = " + longestString);
    }
}
