package day23_string_manipulation_while_loop;

public class SMSMessage {
    public static void main(String[] args) {
        String message = "Sender: [ S a i m ] From Number<(222)333-4444> Message:{Hello, lets code some java}";

        int start = message.indexOf("[");
        int end = message.indexOf("]");
        System.out.println(message.substring(start+1, end));

        String sender = message.substring(start+2, end-1);
        sender = sender.trim() .replace(" ", "") .toLowerCase();
        System.out.println("sender = " + sender);
        
        
        String mobile = message.substring(message.indexOf("<")+1 , message.indexOf(">"));
        System.out.println("mobile = " + mobile);
        
        String hello = message.substring(message.indexOf("{")+1 , message.indexOf(","));
        System.out.println("hello = " + hello);
        
        String java = message.substring(message.indexOf("j"), message.indexOf("}"));
        System.out.println("java = " + java);
        
        String text = message.substring(message.indexOf("{")+ 1 , message.indexOf("}"));
        System.out.println("text = " + text);
    }
}
