package Tasks.Saim_tasks_Unit_One;


/*
Given a String variable with a message.
You will check if the message contains any of these bad words: “idiot, dumb, heck”
    -> If the message contains any of those words print: “Message not sent”.
    -> If the message is bad word free print “Message sent”
 */
import java.util.Scanner;

public class MessageContains {

    public static void main(String[] args) {

        System.out.println("Enter the message");
        Scanner scan = new Scanner(System.in);

        String message = scan.nextLine();

        if(message.contains("idiot") || message.contains("dumb") || message.contains("heck")){
            System.out.println("Message not sent");
        }else {
            System.out.println("Message sent");
        }

    }
}
