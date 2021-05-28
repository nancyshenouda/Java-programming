package Tasks.Loops_Practice_1;

/*
Write a program that can calculate the sum of all the even numbers between 1 ~ 100
 */
public class EvenNumbersV2 {
    public static void main(String[] args) {

        int evenNum=1;
        int sum=0;
        while(evenNum <101){

            if(evenNum%2==0) {

                sum += evenNum;

            }
            evenNum++;
        }
        System.out.println(sum);
    }
}
