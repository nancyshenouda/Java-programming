package day22_String_manipulation;

public class DynamicSubstring {
    public static void main(String[] args) {
        String result = "result count:12345";
        //               0123456789101112131415
        System.out.println(result.substring(13, 18)); //12345
        System.out.println(result.substring(13)); //12345
        System.out.println(result.substring(12,13)); // :
        System.out.println(result.indexOf(":")); // it shows the position number of ":" in result
        int colonIndex = result.indexOf(":");// colonIndex is 12
        System.out.println(result.substring(colonIndex+1)); // it skips the 12 and starts from 1

        // we can combine them in one statement
        System.out.println(result.substring(result.indexOf(":") +1));

        String today = "i learned [java] today";

        System.out.println(today.indexOf("[")); // 10
        System.out.println(today.indexOf("]")); // 15

        int start = today.indexOf("[");
        int end = today.indexOf("]");

        System.out.println(today.substring(start +1 , end)); // java

        System.out.println(today.substring(today.indexOf("[") + 1 ,today.indexOf("]" )));  // java


    }
}
