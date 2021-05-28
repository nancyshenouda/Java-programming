package day33_arrays;

import java.util.Arrays;

public class ReverseArrays {
    public static void main(String[] args) {

        int [] numbers={1,2,3,4,5};
        int [] numReverse=new int [numbers.length];// declare new array with the same length.
        for(int i=numbers.length-1, j=0;i>=0 ;i--,j++){// adding another int j for the new reverse array
            numReverse[j]=numbers[i];
        }
        System.out.println("First Array before reverse - " + Arrays.toString(numbers));
        System.out.println("Second Array after Reverse = " + Arrays.toString(numReverse));


    }
}
