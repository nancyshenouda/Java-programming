package Tasks;
/*
Print true if the string "java" and "love" appear the same number of times in the given string word.
 */
import java.util.*;
import java.util.Scanner;

public class Revision {
    public static void main(String[] args) {


int count =0;
        String word = "java";

        for(int i=0;i<word.length();i++){


            System.out.println("" + word.charAt(i)  + count++);
        }

//        String [] arrWord=word.split("a");
//        System.out.println(Arrays.toString(arrWord));
//
//        double [] data = new double[20];
//        data [19] = 12;
//
//
//        int [] nums ={1,2,3,4,5};
//reverse by adding an additional array with same length;
//        int [] reversArr=new int[nums.length];
//
//        for(int i=nums.length-1,j=0;i>=0;i--,j++){
//            reversArr[j]=nums[i];
//        }
//        System.out.println(Arrays.toString(reversArr));
// reverse array by adding additional variable;
        int [] numbers ={10,20,30,40,50};

        for(int i=0;i<numbers.length/2;i++){
            int temp = numbers[i];
            numbers[i]=numbers[numbers.length-1-i];
            numbers[numbers.length-1-i]=temp;
        }
        System.out.println(Arrays.toString(numbers));



        String [] friends = {"Nancy", "Fady", "Ramy", "Heaven"};

        for(String each : friends){
            System.out.println("Happy New Year " + each);
        }


       String []words = {"java", "python", "ruby", "sql"};

        String [] reverseWords = new String [words.length];

        for(int i= words.length-1,j=0;i>=0;i--,j++){
            reverseWords[j]=words[i];
        }
        System.out.println(Arrays.toString(reverseWords));


        //convert char Array letters to String

        char [] letters = {'j','a','v','a'};

        //String words = new String(letters);
        System.out.println(letters);

        //String word = "java";
        String [] wordArr=word.split(" ");
        System.out.println(Arrays.toString(wordArr));

//        System.out.println(word);
//        
//        char [] letter=word.toCharArray();
//
//        System.out.println("char letter = " + Arrays.toString(letter));
//
//        String [] arr={"one","two","three"};
//        
//        Arrays.sort(arr,Collections.reverseOrder());
//        System.out.println(Arrays.toString(arr));

    }
}