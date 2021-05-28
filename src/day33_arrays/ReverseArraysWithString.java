package day33_arrays;

import java.util.Arrays;

public class ReverseArraysWithString {
    public static void main(String[] args) {
        String [] words ={"java","html", "js", "selenium", "ruby","css"};
        System.out.println("Array before reverse - " + Arrays.toString(words));
//        for(int i=0; i<words.length/2;i++){
//            String temp=words[i];
//            words[i]=words[words.length-1-i];
//            words[words.length-1-i]=temp;
//        }
//        System.out.println("Array after reverse - " + Arrays.toString(words));

        //reverse with 2 variables in the loop:
        for(int i=0, j=words.length-1; i<words.length/2;i++, j--){
            String temps=words[i];
            words[i]=words[j];
            words[j]=temps;
        }
        System.out.println("Array after reverse - " + Arrays.toString(words));

    }
}
