package Tasks.ArrayList_Practice_1;

import java.util.ArrayList;
import java.util.Arrays;

/*
Target word
Given an ArrayList of Strings and a target word (String) print how many times the target word is in the ArrayList
Ex:Input:”java”, ”html”, “css”,“java”, “javascript”, “selenium”
Target:java
Output:2
 */
public class TargetWord {
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>(Arrays.asList("java", "html", "css", "java", "javascript", "selenium"));
        int count = 0;
        String target = "java";

        for(String each : words ){
            if(each.equals(target)){

                count++;
            }
        }
        System.out.println("Count of target word = " + count);
    }
}
