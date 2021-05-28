package Tasks.Loops_Practice_1;

/*
• Write a program that can calculate the sum of all the even numbers
between 1 ~ 100
 */
public class EvenNumbers {
    public static void main(String[] args) {

        int sum = 0;
        int evenNumber = 1;

        while (evenNumber < 101) {
            if (evenNumber % 2 == 0){
                sum += evenNumber;
            }
                evenNumber++;
            }
            System.out.println("Sum of even numbers: " + sum);
        }
    }


