package Tasks.Saim_tasks_Unit_One;
import java.util.Scanner;
/*
[Oxygen level - If statements, operators]
You are diving in the ocean. Your oxygen tank has a certain level (number)
and you must print a message based on the level
> Above 90 - Your tank is full
> Above 80 - Still okay
> Above 70 - Don't go too far
> Above 60 - Start to head back
> Above 50 - Be careful now you at at 50%
Scanner input = new Scanner(System.in);
        System.out.println("Enter your oxygen level:");
        int oxygenLevel = input.nextInt();

        if(oxygenLevel > 90) {
            System.out.println("Your tank is full");
        } else if (oxygenLevel > 80) {
            System.out.println("Still okay");
        } else if (oxygenLevel > 70) {
            System.out.println("Don't go too far");
        } else if (oxygenLevel > 60) {
            System.out.println("Start to head back");
        } else if (oxygenLevel > 50) {
            System.out.println("Be careful now you at at 50%");
        } else {
            System.out.println("Below 50, at " + oxygenLevel);
        }
 */
public class OxygenLevel {
    public static void main(String[] args) {
        System.out.println("Enter your oxygen level:");
        Scanner scan = new Scanner (System.in);

        int OxygenLevel=scan.nextInt();
        if(OxygenLevel>90) {
            System.out.println("Your tank is full");
        } else if(OxygenLevel>80) {
            System.out.println("Still okay");
        }else if(OxygenLevel>70) {
            System.out.println("Don't go too far");
        }else if(OxygenLevel>60) {
            System.out.println("Start to head back");
        }else if(OxygenLevel>50) {
            System.out.println("Be careful now you at at 50%");
        }else {
            System.out.println("Below 50, at " + OxygenLevel);}
        }
    }

