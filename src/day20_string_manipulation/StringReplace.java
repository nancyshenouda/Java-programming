package day20_string_manipulation;

public class StringReplace {
    public static void main(String[] args) {


        String sentence = "java Strings are fun";
        System.out.println(sentence.replace("a", "u"));
        System.out.println(sentence.replace("String" , "conditions"));
        System.out.println(sentence.replace(" " , ""));
        System.out.println(sentence.replace("java ", ""));
    }
}
