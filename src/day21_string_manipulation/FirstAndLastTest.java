package day21_string_manipulation;

public class FirstAndLastTest {
    public static void main(String[] args) {

        String word = "nancy";

        char first = word.charAt(0);
        char last = word.charAt(2);

        if(first == last ){
            System.out.println("first and last letters match");
        }else {
            System.out.println("first and last letters mismatch");
        }

        String friend = "level";
        char firstLetter = friend.charAt(0);
        char lastLetter = friend.charAt(friend.length()-1);
        System.out.println(firstLetter);
        System.out.println(lastLetter);

        if(firstLetter==lastLetter){
            System.out.println(friend + " - first and last letters match");
        }else {
            System.out.println(friend + " - first and last letters mismatch");
        }

      String s1= "abcdefg";
        String s2= "" + s1.charAt(0) + s1.charAt(s1.length()-1);
        System.out.println(s2);

    }
}
