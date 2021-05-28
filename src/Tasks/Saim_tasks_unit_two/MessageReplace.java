package Tasks.Saim_tasks_unit_two;

import java.util.Scanner;

/*
Given a String message with some text and a number (1-3) replace certain characters from the String message.

When the number is:
        1: replace 'a' with 'e'
        2: replace 's' with 'r'
        3: replace 'o' with 'z'


    Ex:
        message: java class is fun
        number: 1
        Output: jeve cless is fun

    Ex:
        message: java class is fun
        number: 2
        Output: java clarr ir fun

 */
public class MessageReplace {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your message");


        String word = scan.nextLine();

        int number = scan.nextInt();

        switch(number){
            case 1:
                System.out.println(word.replace("a" , "e"));
                break;
            case 2:
                System.out.println(word.replace("s" , "r"));
                break;
            case 3:
                System.out.println(word.replace("o" , "z"));
                break;
        }
    }
}
