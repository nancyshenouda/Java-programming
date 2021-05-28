package Tasks.Loops_Practice_1;
/*
•Write a program that can print all the EVEN numbers between 0 ~ 100 that can be divisible by 3 & 5
 */
public class AllEvenNumbersV2 {
    public static void main(String[] args) {

        for(int i=0; i<100 ; i++){
            if(i%2==0 && i%3==0 && i%5==0){
                System.out.println(i);
            }
        }
    }
}
