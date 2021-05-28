package day20_string_manipulation;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Locale;

public class StringIsEmpty {
    public static void main(String [] args){

        String jobTitle = "";
        System.out.println(jobTitle.isEmpty()); //true  . it is has space, then it is not empty as space is a character
        System.out.println(jobTitle.length()); //0
        System.out.println(jobTitle.length() == 0);//true

        if(jobTitle.isEmpty()){
            System.out.println("job title is missing, please resend");//this one will be printed as it is true
        }else{
            System.out.println("job title looks good");
        }
        String word= " ";
        System.out.println(word.isEmpty());// false as space is a character
        System.out.println(word.length());//1 as blank space is a character

        String veggie = "tomato";
        System.out.println(veggie.isEmpty()); // false ( it returns boolean
        System.out.println(veggie.length());// 6   (returns int)
        System.out.println(veggie.toUpperCase()); //TOMATO ( returns String)
        System.out.println(veggie.endsWith("o")); // true ( it returns boolean)
        System.out.println(veggie.startsWith("ve"));// false (returns boolean)
    }
}
