package Tasks.Arrays_Practice_2;

import java.util.Arrays;

/*
[IQ] Second Biggest Number
Given an Array of numbers. Find and print the 2nd biggest number. Note the 2nd biggest
should be unique meaning it should be different from the max number
Example:Input:[4,3,1,4,5,2,4,8,4,8]
Output:5
 */
public class SecondBiggestNumber {
    public static void main(String[] args) {

        int [] numbers={4,3,1,4,5,2,4,8,4,8};
        int secondBiggest=numbers[0];
        Arrays.sort(numbers);

        for(int i=numbers.length-1;i>0;i--){
            if(numbers[i]!=numbers[i-1]){
                secondBiggest=numbers[i-1];
                break;
            }
        }
        System.out.println(secondBiggest);
        //System.out.println(Arrays.toString(numbers));
    }
}
