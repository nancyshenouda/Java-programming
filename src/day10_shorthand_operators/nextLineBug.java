package day10_shorthand_operators;

import java.util.Scanner;
public class nextLineBug {
    public static void main(String[] args) {
        System.out.println(" What is your monthly rent?");
        Scanner scan =new Scanner(System.in);
        double rent = scan.nextDouble();
        scan.nextLine();
        String month= scan.nextLine();
        System.out.println( rent + " rent is too high!");

    }
}
