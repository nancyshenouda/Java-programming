package OfficeHours.Practice_03_29_2021;

//Replit

import java.util.Scanner;

public class Sandwich {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String str = "breadbread";  // 0 + 5 = 5 -> substring(5) -> jam.contain(bread)

        if (str.contains("bread")) { // 5,5

            int firstBread = str.indexOf("bread");

            if (str.substring(firstBread + 5).contains("bread")) { //jambread

                int secondBread = str.lastIndexOf("bread");
                String result = str.substring(firstBread + 5, secondBread);

                if (result.isEmpty()) {
                    System.out.println("nothing");
                } else {
                    System.out.println(result);
                }

            } else {
                System.out.println("nothing");
            }

        } else {
            System.out.println("nothing");
        }
    }
}