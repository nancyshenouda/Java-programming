package day38_methods;

public class Reverse {
    public static void main(String[] args) {
       reverse("java is fun");
    }

    public static String reverse(String str) {

        String reversedStr="";
        for(int i=str.length()-1; i>=0;i--){
            reversedStr+=str.charAt(i);
        }
        System.out.println(reversedStr);
        return reversedStr;
    }
}
