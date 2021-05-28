package day28_Loops;

import java.util.*;

public class RandomPassword {
    public static void main(String[] args) {

        String source = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789_!#$%^*&*";

        String password= "";

        Random random = new Random();// Random class that will help us generate random numbers

        for(int i=1; i <=8; i++) {
           int index = random.nextInt(71); // random number between 0 and 70----> 71 because the 0 is counted
            password+=source.charAt(index);// it stores the char index inside the variable password.

            System.out.print(source.substring(index,index+1));

        }

        System.out.println("\nyour password is : " + password);
    }
}
