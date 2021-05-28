package day23_string_manipulation_while_loop;

public class ChainingStringMethods {
    public static void main(String[] args) {
        String word = "wooden spoon";

        System.out.println(word.toUpperCase().toLowerCase());
        word="w o o d e n sp o o n";
        System.out.println(word.replace(" ", "").toUpperCase());// linking the methods together.

        String word2 = "cairo";
        System.out.println(word2.substring(0,1).toUpperCase()+ word2.substring(1).toLowerCase());
        
        String capitalised = (word2.substring(0,1).toUpperCase()+ word2.substring(1).toLowerCase());
        // it reads the first letter and make it Uppercase,
        // then reads the second till last letter and make it lowercase
        // chaining doesn't work with all types

        System.out.println("capitalised = " + capitalised);


        }
    }

