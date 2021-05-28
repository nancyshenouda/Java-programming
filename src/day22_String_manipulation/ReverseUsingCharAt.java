package day22_String_manipulation;

public class ReverseUsingCharAt {
    public static void main(String[] args) {

        String word = "noon";
        System.out.print(word.charAt(3));
        System.out.print(word.charAt(2));
        System.out.print(word.charAt(1));
        System.out.println(word.charAt(0));
        System.out.println();

        System.out.println(word.charAt(0) + "" + word.charAt(1) + "" + word.charAt(2) + "" + word.charAt(3));
        System.out.println("" + word.charAt(0) +  word.charAt(1)+ word.charAt(2) + word.charAt(3));

        String word2= "" + word.charAt(3) + word.charAt(2) + word.charAt(1) + word.charAt(0);
        System.out.println(word2);

        if(word.equalsIgnoreCase(word2)){
            System.out.println("Palindrome word");
        }else {
            System.out.println("not Palindrome word");
        }
    }
}
