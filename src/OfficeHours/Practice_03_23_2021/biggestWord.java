package OfficeHours.Practice_03_23_2021;

/*
Given three String variables of some text find and print the longest word that also contains 'a'
    Ex:
        "java"
        "mouse"
        "computer"
        Output: java
    Ex:
        "java"
        "mouse"
        "apples"
        Output: apples

Challenge: Instead of just checking for 'a' add another variable that can be used to check for any character.

 */
public class biggestWord {

    public static void main(String[] args) {

        String word1= "java";
        String word2= "mouse";
        String word3= "appl";
        String biggestWordWithA= "";

        if(word1.contains("a") && word1.length()> biggestWordWithA.length()){
            biggestWordWithA = word1;

            if(word2.contains("a") && word2.length()> biggestWordWithA.length())
                biggestWordWithA =  word2;

            if(word3.contains("a") && word3.length()> biggestWordWithA.length())
                biggestWordWithA =  word3;
        }
        System.out.println("Longest word with a is " + biggestWordWithA);


    }
}
