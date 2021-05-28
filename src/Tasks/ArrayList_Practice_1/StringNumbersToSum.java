package Tasks.ArrayList_Practice_1;

import java.util.ArrayList;
import java.util.Arrays;

/*
String numbers to sum
Given an ArrayList of numbers in String format, add each digit of each element and store into a different ArrayList.
Ex:Input: “123”,“34”,“513”
Output:[ 6, 7, 9 ]
 */
public class StringNumbersToSum {
    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<>(Arrays.asList("123","34", "513"));
        ArrayList<Integer> nums = new ArrayList<>();



//        for (String each : str){
//        int sum = 0;
//            Integer.parseInt(each);
//            for(char i : str.get(i).toCharArray()){
//                sum+=each.charAt(i);
//
//            }
//            nums.add(sum);
//        }
//        System.out.println(nums);
    }
}
