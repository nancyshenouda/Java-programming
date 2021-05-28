package Tasks.Saim_tasks_Unit_One;
import java.util.Scanner;
/*
[If statements, operators]

Create a program that will accept a year. Check if the year is a leap year.
If it is a leap year print "$year is a leap year" otherwise print "$year is not a leap year"
Hint: Lets say if a number is evenly divisible by 4 it is a leap year
Scanner input = new Scanner(System.in);
        System.out.println("Enter a year");
        int year = input.nextInt();

        if(year % 4 == 0) {
            System.out.println(year + " is a leap year!");
        } else {
            System.out.println(year + " is NOT a leap year!");
        }

 */
public class LeapYear {
    public static void main(String[] args) {
Scanner scan= new Scanner(System.in);
        System.out.println("Enter a year");
        int year=scan.nextInt();

        if(year%4==0) {
            System.out.println(year + " is a leap year");
        }else {
            System.out.println(year + " is not a leap year");}
        }

    }

