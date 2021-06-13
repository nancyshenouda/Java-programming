package Tasks.Interview_Codes;

/*
String -- Reverse
Write a return method that can reverse  String

Ex: Reverse("ABCD"); ==> DCBA
 */
public class StringReverse {
    public static String reverse(String str){

        String reversed = "";

        for(int i=str.length()-1;i>=0;i--){
            reversed+=""+str.charAt(i);
        }
        //return new StringBuffer(str).reverse().toString();
        return reversed;
    }

    public static void main(String[] args) {
        System.out.println(reverse("ABCD"));
    }

}
