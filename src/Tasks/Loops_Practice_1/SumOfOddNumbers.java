package Tasks.Loops_Practice_1;
/*
• Write a program that can calculate the sum of all the odd numbers
between 1 ~ 100
 */
public class SumOfOddNumbers {

    public static void main(String[] args) {

        int sum=0;
        int oddNumber=1;

        while(oddNumber<101){
            if(oddNumber%2!=0) {
                sum += oddNumber;
            }
                oddNumber++;
            }
            System.out.println("sum of odd numbers = " + sum);
        }

    }

