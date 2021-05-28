package day33_arrays;

import java.util.Arrays;

public class SplitReview {
    public static void main(String[] args) {
        String word="java program";
        String [] strArr = word.split("a");
        System.out.println("-------- split with a string-----------");
        int aCount = strArr.length-1;
        System.out.println(Arrays.toString(strArr));
        System.out.println("The count of 'a' = " + aCount);

        String str="java";
        String [] strArr2=str.split("a");
        System.out.println(strArr2.length);// the length is 2 after the split which is removing letter a
        System.out.println(Arrays.toString(strArr2));

        System.out.println("------ split with empty string -------");
        String name ="Nancy";
        String [] nameArr= name.split("");
        System.out.println(Arrays.toString(nameArr));

        String word2="java1sql2html";

        String [] strArr3=word2.split("\\d");// this method is called regular expression(splitting by a number)
        System.out.println(Arrays.toString(strArr3));

        word2=word2.replaceAll("\\d", "_");// it replaces ALL the numbers separators with "_"
        System.out.println(word2);

        String password= "Heavenramy_11110000";
        if(password.matches("^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^_&+=]).*$")){
            // regExp for all the languages not just java
            //it is universal String pattern matching in all programming languages
            System.out.println("valid password");
        }else{
            System.out.println("Invalid password");
        }
        String wordds = "https://learn.cybertekschool.com/courses/130";

        String[] strArrs = wordds.split("/");
        System.out.println(Arrays.toString(strArrs));// it will print the array without / sign and put separate by comma
    }
}
