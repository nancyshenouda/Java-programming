package Tasks.Saim_tasks_Unit_One;
/*
 Scanner input = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = input.nextInt();

        if(age >= 18) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote");
        }
 */
import java.util.Scanner;
public class Voting {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your age: ");
        int ageOfVoting=scan.nextInt();
        if(ageOfVoting>=18) {
            System.out.println("Eligible to vote");
        }else {
            System.out.println("not eligible to vote");

        }


    }
}
