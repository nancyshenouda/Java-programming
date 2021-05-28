package Tasks.Problem_Set;

import java.util.Scanner;

public class CharacterChecker {
    /*
        [Character Checker]
        Given a letter (char) determine if the character is an uppercase letter or lowercase letter Ex: 'b' --> lowercase
        'G' --> uppercase 'O' --> uppercase
        Hint: Use the ASCII table
         */

        public static void main(String[] args) {
            System.out.println("Enter a letter: ");
            Scanner scan = new Scanner(System.in);

            char ch= scan.next().charAt(0);
            String result = "";

           if(ch>=65 && ch<=90){
               System.out.println("Upper Case");
           }else if(ch>=97 && ch <=122){
               System.out.println("lower case");
           }

        }
    }

