package Tasks.Saim_tasks_Unit_One;
import java.util.Scanner;
public class OppositeBoolean {
    public static void main(String[] args) {
        /*
        [If statement, operators]

Write a program that will accept a boolean value. Print out the opposite of the given boolean

Ex: true -> false
    false -> true
// This one doesn't need if statement
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a boolean");
        boolean bool = input.nextBoolean();
        System.out.println("The opposite of true is " + !bool);

        // With if statement:

//        if(bool) {
//            System.out.println("The opposite of true is " + false);
//        } else {
//            System.out.println("The opposite of false is " + true);
//        }
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a boolean");
        boolean bool = scan.nextBoolean();
        if(bool==true) {
            System.out.println("The opposite of true is " + !bool);
        } else if(bool==false){
                System.out.println("The opposite of false is " + !bool);}

    }
}
