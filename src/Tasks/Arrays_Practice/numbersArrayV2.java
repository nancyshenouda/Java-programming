package Tasks.Arrays_Practice;

import java.util.Arrays;

/*
100 numberarray

1.Create an int array called numbers that has length of 1002.Assign 1-100 to each index of the array.
Then use a for each loop to print out all the elements of the array
 */
public class numbersArrayV2 {
    public static void main(String[] args) {

        int [] numbers = new int [100];

        for(int i=0;i<numbers.length;i++){
            numbers[i]=i+1;
        }
        System.out.print(Arrays.toString(numbers));


    }
}
