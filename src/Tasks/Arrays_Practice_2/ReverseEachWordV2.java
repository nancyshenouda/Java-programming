package Tasks.Arrays_Practice_2;
/*
Reverse Each word
Given a String,reverse each individual word and print the result
Hint: Use a nested loop, split
Input:It started to snow in Chicago
Output:tI detrats ot wons ni ogacihC
 */
public class ReverseEachWordV2 {
    public static void main(String[] args) {

        String words = "It started to snow in Chicago";
        String reversed="";

        for( String each : words.split(" ")){
            String eachReversed="";

            for(int i=each.length()-1;i>=0;i--){
                eachReversed+=each.charAt(i);
            }
            reversed+=eachReversed + " ";
        }

        System.out.println(reversed);
    }
}
