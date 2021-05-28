package Tasks.Saim_tasks_Unit_One;

/*
Given two String variables. One is a full name and the second a last name.
Check if the full name has the same last name as the other String.
    Ex:
        s: "james bond"
        s: "bond"
        output: Same last name

        s: "alex benji"
        s: "bond"
        output: Not the same last name
 */

import java.util.Scanner;

public class FullAndLastName {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your full name: ");


        String fullName = scan.nextLine();

        System.out.println("Enter your last name: ");
        String lastName = scan.nextLine();

        if(fullName.contains(lastName)){
            System.out.println("Same last name");
        }else{
            System.out.println("Not the same last name");

        }

    }
}
