package day42_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodsWithList {
    public static void main(String[] args) {
        //declare String ArrayList and add values:
       List<String> words = new ArrayList<>();
       words.add("Java"); words.add("HTML"); words.add("Selenium"); words.add("title"); words.add("input");
       //Pass the words list to the method:
        printStrList(words);
        printStrList(Arrays.asList("select", "Api", "option" , "br"));
        


        List<Integer> nums = new ArrayList<>(Arrays.asList(10,50,30));
        int sum = sumIntegerList(nums);
        System.out.println("sum = " + sum);

    }
    public static void printStrList(List<String> str){

       for(String each : str){
           System.out.print(each + " ");
       }

        System.out.println();
    }

    public static int sumIntegerList(List<Integer> list) {
        int sum=0;
        for(int each : list){
             sum+=each;
        }
        return sum;
    }
}
