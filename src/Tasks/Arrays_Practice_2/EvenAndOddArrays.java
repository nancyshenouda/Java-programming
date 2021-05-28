package Tasks.Arrays_Practice_2;

import java.util.Arrays;

/*
Even and odd Arrays
Given an array with values: 1,2,-3,4,-34,55,78,90,33,10
-Take our all the even numbers from the array and put them into a new array. Print the new array
-Take our all the odd numbers from the array and put them into a new array. Print the new array
 */
public class EvenAndOddArrays {
    public static void main(String[] args) {

        int[] numbers = {1, 2, -3, 4, -34, 55, 78, 90, 33, 10};

        String evenNumbers="";
        String oddNumbers="";

        for (int each : numbers) {
            if (each % 2 == 0) {
                evenNumbers+=each+ " ";
            }
        }
        for (int eachNumber:numbers) {
            if (eachNumber % 2 != 0) {
              oddNumbers+=eachNumber+" ";
            }
        }

        System.out.println(Arrays.toString(evenNumbers.split(", ")));
        System.out.println(Arrays.toString(oddNumbers.split(", ")));

    }
}
