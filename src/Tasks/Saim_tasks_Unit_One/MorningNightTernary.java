package Tasks.Saim_tasks_Unit_One;
/*
[Morning or Night]
Given some time value (int) in 24 hours format. Print if its the morning or night.
0 - 11 : Morning
12- 24 : Night
-> You can assume the value given is always valid (in the 24 hours range), but if you want a
challenge use an if to control invalid values
 */
import java.util.Scanner;

public class MorningNightTernary {
    public static void main(String[] args) {
        System.out.println("What is the time now?");
        Scanner scan= new Scanner (System.in);
        int timeValue= scan.nextInt();
        //String time=" ";

        String time=  (timeValue <=11)? "Morning" : "Night";
        System.out.println(time);



    }
}
