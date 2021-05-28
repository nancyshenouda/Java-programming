package day24_loops;

public class LoopReverse {
    public static void main(String[] args) {
        int count= 5;

        while(count >=0){
            System.out.println("counting - " + count);
            count--; // we use -- to make the counting reversed 5,4,3,2,1,0
        }
        System.out.println("finish the counting");

        int unreadSMS = 10;

        while(unreadSMS >=1){
            System.out.println("read 💌  message "  + +unreadSMS );
            unreadSMS--;

        }
        System.out.println("you have  " + unreadSMS + " unread messages.");
    }
}
