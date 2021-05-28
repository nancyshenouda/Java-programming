package Tasks.Saim_tasks_unit_two;

/*
[Street light]

You are at a street line. The color of the street line will determine what you should do.

    Green light - Print "Go"
    Yellow light - Print "Slow down"
    Red light - Print "Stop"
 */
import java.util.Scanner;

public class StreetLights {
    public static void main(String[] args) {
        System.out.println("What is the traffic light now? ");
        Scanner scan = new Scanner(System.in);
        String light = scan.next();
        if(light.equals("Green")) {
            System.out.println("Go");
        }else if(light.equals("Yellow")) {
            System.out.println("Slow down!");
        }else if(light.equals("Red")) {
            System.out.println("Stop");
        }

    }
}
