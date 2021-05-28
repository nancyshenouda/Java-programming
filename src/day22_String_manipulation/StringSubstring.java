package day22_String_manipulation;

public class StringSubstring {
    public static void main(String[] args) {
//                     01234567891011
        String word = "java is a lot of fun";
        /*
        1- word.substring(startIndex, endIndex)
        2- word.substring(startIndex)
         */

        System.out.println(word.substring(0,3)); // jav
        System.out.println(word.substring(0,4)); // java
        System.out.println(word.substring(5,7));// is
        System.out.println(word.substring(8));// a lot of fun ( it reads from one number in number 8 position(a)
        // till last one.

        System.out.println(word.substring(5)); // is a lot of fun
    }
}

