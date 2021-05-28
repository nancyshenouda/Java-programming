package Tasks.Arrays_Practice;
/*
Shortest and Longest words from String array•
Write a program that can return the shortest string element from a String array•
Write a program that can return the longest string element from a String array
 */
public class ShortestLongestArrays {
    public static void main(String[] args) {

        String [] words={"Apple", "egg", "ad", "orange"};

        String longest = words[0];
        String shortest = words[0];

        for(String each : words){
            if(each.length()>longest.length()){
                longest=each;
            }
            if(each.length()<shortest.length()){
                shortest=each;
            }
        }
        System.out.println(longest);
        System.out.println(shortest);
    }
}
