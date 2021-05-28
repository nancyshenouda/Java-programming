package Tasks.Saim_tasks_Unit_One;

/*
    [Triangle - If statement, operators]
A triangle is valid if the sum of all the three angles is equal to 180 degrees.
Write a program that declares three integers as angles and check whether the triangle is valid or not.
Print "Valid triangle" or "Not a valid triangle".
    => To make it dynamic change the three angles to be Scanner inputs

     */
import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the triangle angels");
        int angel1=scan.nextInt();
        int angel2=scan.nextInt();
        int angel3=scan.nextInt();
        if(angel1+angel2+angel3==180) {
            System.out.println("Valid triangle");
        }else if(angel1+angel2+angel3!=180){
            System.out.println("Not a valid triangle");}


    }


}
