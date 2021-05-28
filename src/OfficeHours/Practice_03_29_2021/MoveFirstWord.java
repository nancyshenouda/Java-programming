package OfficeHours.Practice_03_29_2021;

/*
[Move first word]
Given a sentence. Display the sentence with the first word moved to the end of the sentence.
Ex:
input: Java is a fun language
output: is a fun language Java
Hint: Use indexOf and substring
------------------------------------------------------------
 */
public class MoveFirstWord {
    public static void main(String[] args) {

        String sentence = "Java is a fun language";
        int space= sentence.indexOf(" ");
        String firstWord= sentence.substring(0,space);
        System.out.println(firstWord);
        System.out.println(sentence.substring(space+1) + " " + firstWord);


    }
}
