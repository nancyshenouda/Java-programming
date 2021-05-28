package OfficeHours.Practice_05_03_2021;

import java.util.ArrayList;
import java.util.Arrays;

/*
Given an ArrayList of Strings and a target word (String) print how many times the target word is in the ArrayList
Ex:Input:”java”, ”html”, “css”,“java”, “javascript”, “selenium”
Target:java
Output:2
 */
public class TargetWord {
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>(Arrays.asList("java","html","css","java","javascript","selenium"));
        String target = "java";
        int count = 0;

        for (String each : words){
            if(each.equals(target)){
                count++;
            }

        }
        System.out.println(target + " was found " + count + " times.");



    }
}
