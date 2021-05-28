package Tasks.ArrayList_Practice_1;

import java.util.ArrayList;
import java.util.Arrays;

/*
Hide Password
Given an array of passwords (String).
Hide each password as a star (*) and show the hidden password
Ex:Input:{"one", "hi", "hold}
Output: [ ***, **, **** ]
 */
public class HidePassword {
    public static void main(String[] args) {

        ArrayList<String> passwords = new ArrayList<>(Arrays.asList("one", "hi", "hold"));

        ArrayList<String> newPass = new ArrayList<>();

        for (String each : passwords){
           newPass.add(convertToStars(each));
        }
        System.out.println(passwords);
        System.out.println(newPass);
    }
public static String convertToStars(String str){
        String stars = "";

        for(int i =0;i<str.length();i++){
            stars+="*";
        }
        return stars;
}

}
