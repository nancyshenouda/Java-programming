package Tasks.Arrays_Practice;
/*
Max and Min number from Array•
Write a program that can find the maximum number from any given int array•
Write a program that can find the minimum number from any given int array
 */

import java.util.Arrays;
public class MaxAndMinNumbers {
    public static void main(String[] args) {

        int [] numbers = {3,6,100,200,5,10,70};
        int maxNumber=numbers[0];
        int minNumber=numbers[0];

        for(int each : numbers){
            if(each > maxNumber){
                maxNumber=each;

            }if(each<minNumber) {
                minNumber=each;
            }
        }
        System.out.println("maximum number is - " + maxNumber);
        System.out.println("minimum number is - " + minNumber);
    }
}
