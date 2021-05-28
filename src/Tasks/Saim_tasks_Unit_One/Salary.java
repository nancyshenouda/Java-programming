package Tasks.Saim_tasks_Unit_One;
import java.util.Scanner;
/*
Write a program that will accept your salary amount.
Then also ask the user if they are full time or not (boolean).
If they are fulltime add 20000 to their salary,
but if they are part time then subtract 5000. Print the final salary.
Scanner input = new Scanner(System.in);
        System.out.println("Enter your salary");
        double salary = input.nextDouble();
        System.out.println("Are you full time?");
        String isFullTime = input.next();
        // The fullTime part can be with just a boolean too:
        // boolean isFullTime = input.nextBoolean();

        if(isFullTime.equals("yes") || isFullTime.equals("Yes") || isFullTime.equals("YES")) {
            salary += 20000;
        }else if(isFullTime.equals("no") || isFullTime.equals("No") || isFullTime.equals("NO")){
            salary -= 5000;
        } else {
            System.out.println("Invalid full time status, salary unchanged");
        }

        System.out.println("Final Salary: " + salary);
 */
public class Salary {
    public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
        System.out.println("Enter your salary");
        int salary=scan.nextInt();
        System.out.println("Are you full time?");
        boolean fulltime=scan.nextBoolean();
        int finalResult1=salary + 20000;
        int finalResult2=salary-5000;
        if(fulltime==true){
            salary +=20000;
            System.out.println("Final Salary "+ finalResult1);
        }
        if(fulltime==false){
            salary-=5000;
            System.out.println("final salary " + finalResult2);}

    }
}
