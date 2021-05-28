package Tasks.Loops_Practice_1;
/*
•Write a program that can calculate the sum of all the odd numbers between 1 ~ 100
 */
public class OddNumbersV2 {
    public static void main(String[] args) {

        int oddNum = 1;
        int sum = 0;

        while(oddNum<101) {

            if (oddNum % 2 != 0) {
                sum += oddNum;
            }
            oddNum++;
        }
        System.out.println(sum);
    }
}
