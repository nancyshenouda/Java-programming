package OfficeHours.Practice_03_09_2021;
import java.util.Scanner;
public class SecondsConvertor {
    public static void main(String[] args) {
        Scanner scan= new Scanner (System.in);

        int inputSeconds, hours, minutes, seconds;

        System.out.println("Enter Seconds: ");
        inputSeconds = scan.nextInt();
        hours=inputSeconds/3600;
        //1 hour has 60 minutes / 1 minute has 60 seconds = 1 hour has (60*60)= 3600 seconds.
        inputSeconds%=3600;
        minutes=inputSeconds/60;
        inputSeconds %=60;
        seconds=inputSeconds;

        System.out.println(hours + " hours, " + minutes + " minutes, " + seconds + " seconds");






    }

}
