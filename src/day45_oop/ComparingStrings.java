package day45_oop;

public class ComparingStrings {
    public static void main(String[] args) {

        String word1= "java";
        String word2 ="java";
        String word3 = new String("java");
        String word4 = new String("java");

        System.out.println(word1==word2); // true because both of them are variables
        System.out.println(word1==word3); // false because  word1 is a variable and word3 is an object
        System.out.println(word1.equals(word2)); // true as both are variables
        System.out.println(word1.equals(word3)); //true because this is the only way we can make a variable equals to an object
        System.out.println(word3.equals(word4));// true both are objects

        Integer n1 = 10;
        Integer n2 = 10;
        Integer n3 = new Integer(n1);

        System.out.println(n1==n2);
        System.out.println(n1.equals(n2));
        System.out.println(n1==n3);
        System.out.println(n1.equals(n3));
        System.out.println(n3.equals(n2));
    }
}
