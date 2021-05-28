package day21_string_manipulation;

public class StringIndexOf {
    public static void main(String[] args) {
        String word = "java";

        System.out.println(word.indexOf("j"));   // index of returns the index of the first occurrance
        // or first position of the letter
        System.out.println(word.indexOf("v"));
        System.out.println(word.indexOf("fun"));// -1 as it cannot find it in "java"
        System.out.println(word.indexOf("a")); // if it is multiple or repeated letters, it will return the first one "a"
    }
}
