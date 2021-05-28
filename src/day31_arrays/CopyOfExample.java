package day31_arrays;

import java.util.Arrays;

public class CopyOfExample {
    public static void main(String[] args) {

        int [] array1={5,7,10};


        System.out.println(Arrays.toString(array1));

        for(int i=0; i< array1.length;i++){
            System.out.println(array1[i]);
        }
        int [] array2= Arrays.copyOf(array1,5); // it copies the original array length and put it to a new length.
        array2[3]= 55;
        array2[4]=77;
        System.out.println();
        for(int i=0; i< array2.length;i++){
            System.out.println(array2[i]);
        }
    }
}
