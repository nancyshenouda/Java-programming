package day19_class_vs_object_strings;

import java.util.Locale;

public class StringLength {
    public static void main(String[] args) {
        String word = "ILoveYou";
        System.out.println(word);
        System.out.println(word.length());
        System.out.println("The number of letters in I love You is " + word.length() + " letters");

        String firstName = "Nadir";
        System.out.println(firstName + " has " + firstName.length() + " characters");


        int count = firstName.length();
        System.out.println(count);

        String password = "12";
        if(password.length() >= 6){
            System.out.println("Valid Amazon Password");

        }else {
            System.out.println("Password is too short");
        }

        String countryCode = "usa";
        if(countryCode.equals(countryCode.toUpperCase())){
            System.out.println(countryCode);

        }else{
            System.out.println("Invalid country code");
        }
    }
}
