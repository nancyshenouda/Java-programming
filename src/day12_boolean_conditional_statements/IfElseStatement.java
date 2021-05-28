package day12_boolean_conditional_statements;
import java.util.Scanner;
public class IfElseStatement {
    public static void main(String[] args) {
        if(10>5) {
            System.out.println("Condition is true? ");
        } else{
                System.out.println("Condition is false");
            }

        int count =25;
        if (count>30) {
            System.out.println("Count is more than 30");
        }else {
            System.out.println("Count is less than 30");
        }
        Scanner scan = new Scanner (System.in);
        System.out.println("What is your age?");
        int age= scan.nextInt();
        if(age>=21) {
            System.out.println("You are allowed to buy alcohol");
        } else {
            System.out.println("You are not allowed to buy alcohol");
        }
        Scanner input=new Scanner(System.in);
        System.out.println("What is your age?");
        int ageToVote=scan.nextInt();
        if(ageToVote>=20) {
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("You are not eligible to vote");
        }
    }
}
