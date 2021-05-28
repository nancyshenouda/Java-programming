package OfficeHours.Practice_04_12_2021;

import java.util.Arrays;
import java.util.Scanner;

public class EvenAndOddCountArray {
    public static void main(String[] args) {
        // Here we are getting a dynamic array from the user by asking for the numbers
        //        int [] nums = {4,1,3,12,5}; -> hardcoded array

        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers do you have");
        int [] nums = new int[input.nextInt()]; // 0 0 0 0 0

        for(int i=0; i < nums.length; i++) {
            System.out.println("Enter number " + (i+1));
            nums[i] = input.nextInt();
        }

       // int [] nums = {4,1,3,12,5};
        // We are counting the number of even and odd values from that array
        System.out.println("-------printing the even and odd count.");
            int even=0;
            int odd=0;
// String even += num + " " split by space -> String []
            for(int each: nums){
                if(each%2==0){
                  even++;
                }else{
                   odd++;
            }
        }
        System.out.println("even numbers count is - "+ even);
        System.out.println("Odd numbers count is - "+ odd);
        System.out.println("---------- printing the even and odd numbers");
            int [] evenNumbers= new int [even];
            int [] oddNumbers= new int[odd];

            for(int i=0, e=0,o=0; i<nums.length;i++){
                if(nums[i]%2==0){
                   evenNumbers[e] =nums[i];
                   e++;// it will increment the even numbers in the evenNumbers array

                }else{
                    oddNumbers[o] =nums[i];
                    o++; //it will increment the odd numbers in the oddNumbers array
                     /*
                i -> keep track of the indexes in your nums array
                e -> keep track of the indexes in our evenNumbers array
                o -> keep tracks of the indexes in our oddNumbers array
         */
                }
            }
        System.out.println("Even numbers - " + Arrays.toString(evenNumbers));
        System.out.println("Odd numbers - " + Arrays.toString(oddNumbers));

    }
}
