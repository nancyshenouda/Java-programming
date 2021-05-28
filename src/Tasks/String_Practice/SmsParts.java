package Tasks.String_Practice;
/*
[SMS parts]
Given a String in the following format:
“Sender: <James Bond>. From Number: [202-123-3456]. +Message: {“I love programming and problem solving}
”Separate these parts and print them separately:
“Sender:  actualSender”“Number: actualNumber”“Message: actualMessage”
 */
public class SmsParts {
    public static void main(String[] args) {

        String message = "“Sender: <James Bond>. From Number: [202-123-3456]. " +
                "+Message: {“I love programming and problem solving}";

        int senderStart = message.indexOf("<");
        int senderEnd = message.indexOf(">");
        String sender = message.substring(senderStart+1,senderEnd);

        int numberStart=message.indexOf("[");
        int numberEnd = message.indexOf("]");
        String number = message.substring(numberStart+1,numberEnd);

        int messageStart = message.indexOf("{");
        int messageEnd = message.indexOf("}");
        String msg = message.substring(messageStart+1,messageEnd);

        System.out.println("Sender: " + sender);
        System.out.println("Number: " + number);
        System.out.println("Message body: " + msg);

    }
}
