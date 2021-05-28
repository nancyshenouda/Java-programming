package day39_wrapper_classes;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class WrapperClassMethods {
    public static void main(String[] args) {
        System.out.println(Integer.max(10,5));
        System.out.println(Integer.sum(50,35));
        System.out.println(Integer.min(10,5));

        System.out.println("MIN INT = " + Integer.MIN_VALUE);
        System.out.println("MAX INT = " + Integer.MAX_VALUE);

        System.out.println("MIN DOUBLE = " + Double.MIN_VALUE);
        System.out.println("MAX DOUBLE = " + Double.MAX_VALUE);

        //  USEFUL METHOD IN COMPARE:

        System.out.println(Double.compare(5,1));//first number is larger ==> 1
        System.out.println(Double.compare(5,5));// both numbers are Equal ==> 0
        System.out.println(Double.compare(5,45));// first is less than second ==> -1

        // MOST USEFUL METHOD IN CHARACTER:

        System.out.println(Character.isDigit('8'));// true
        System.out.println(Character.isAlphabetic('A'));//true
        System.out.println(Character.isLetter('A'));//true
        System.out.println(Character.isUpperCase('a'));//false

        char letter = 'b';

        if(Character.isUpperCase(letter)){
            System.out.println(true);
        }

        String word="JaVa iS FuN";

        for(int i=0; i<word.length();i++)
            if( Character.isUpperCase(word.charAt(i))){
                System.out.print(word.charAt(i) + " ");
            }
        System.out.println(Boolean.TRUE);


        }

    }

