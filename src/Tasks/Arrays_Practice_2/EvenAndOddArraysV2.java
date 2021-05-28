package Tasks.Arrays_Practice_2;

import java.util.Arrays;

/*
Even and odd Arrays
Given an array with values: 1,2,-3,4,-34,55,78,90,33,10
-Take our all the even numbers from the array and put them into a new array.
Print the new array
-Take our all the odd numbers from the array and put them into a new array.
Print the new array
 */
public class EvenAndOddArraysV2 {
    public static void main(String[] args) {

        int [] numbers ={1,2,-3,4,-34,55,78,90,33,10};
        String oddArray= "";
        String evenArray = "";

        for(int i=0; i<numbers.length;i++){
            if(numbers[i]%2==0){
                evenArray+=numbers[i] +" ";
            }
            if(numbers[i]%2!=0){
                oddArray+=numbers[i] +" ";
            }
        }
        String []evenNumber = evenArray.split(" ");
        System.out.println("Even Array = " + Arrays.toString(evenNumber));

        String [] oddNumbers= oddArray.split(" ");
        System.out.println( "Odd Array = " + Arrays.toString(oddNumbers));

    }
}
