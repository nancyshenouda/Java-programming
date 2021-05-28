package Tasks.ArrayList_Practice_1;

import java.util.ArrayList;
import java.util.Arrays;

/*
Four or less
Given an ArrayList of Strings, go through and read only Strings that are 4 characters or less.
Take those Strings and put them into a different ArrayList
Ex:Input:“apples”, “tree”, “loop, “cat”, “animal”, “shortcut”
Output:[ tree, loop, cat ]
 */
public class FourOrLess {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList("Apples", "tree", "loop", "cat", "animal", "shortcut"));

        ArrayList<String> newList = new ArrayList<>();

        for( String each : list){
            if(each.length()<=4){
                newList.add(each);
            }
        }
        System.out.println(newList);
    }
}
