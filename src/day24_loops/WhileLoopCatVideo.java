package day24_loops;

import day22_String_manipulation.ReverseUsingCharAt;

public class WhileLoopCatVideo {
    public static void main(String[] args) throws InterruptedException {
        int seconds= 0;
        while (seconds <=117){ // 117 because the example video was 1 minute and 57 seconds
            System.out.println("Watching youtube video till second - " + seconds);
            seconds++; // the ++ can be before seconds or after seconds: ++seconds or seconds++
            Thread.sleep(1000);// this command is the same with every code, it doesnt change
        }
        System.out.println("youtube video ended");// it will run when the condition becomes false


    }
}
