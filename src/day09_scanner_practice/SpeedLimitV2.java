package day09_scanner_practice;
import java.util.Scanner;

public class SpeedLimitV2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("What is your current Speed?");
        int speedLimit=55;
        int currentSpeed=scan.nextInt();
        int overTheLimit=currentSpeed-speedLimit;
        System.out.println("Your Speed is MPH" + overTheLimit + " Over the speed limit. Slow Down!");
    }
}
