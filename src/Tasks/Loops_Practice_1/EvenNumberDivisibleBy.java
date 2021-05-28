package Tasks.Loops_Practice_1;

/*
• Write a program that can print all the EVEN numbers between 0 ~
100 that can be divisible by 3 & 5
 */
public class EvenNumberDivisibleBy {
    public static void main(String[] args) {

        int evenNumber=0;

        while(evenNumber<101){
            if(evenNumber%2==0 && evenNumber%3==0 && evenNumber%5==0){
                System.out.println("evenNumber = " + evenNumber);
            }
            evenNumber++;
        }
    }
}
