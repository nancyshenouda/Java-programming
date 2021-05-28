package day24_loops;

import java.util.Scanner;

public class Alphabet {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please write the alphabet letters: ");
        char letter = scan.next().charAt(0);//when we want it reversed,
        // we need to input the letter z which is at the end

        while(letter<='z'){
//letter++;
            System.out.print(letter++ + " ");
        }

    }
}
