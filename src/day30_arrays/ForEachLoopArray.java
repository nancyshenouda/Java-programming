package day30_arrays;

import java.util.Arrays;

public class ForEachLoopArray {
    public static void main(String[] args) {
//            0    1   2   3     4    5    6    7   8   9
int[] data = {32, 532, 1, 5454, 22, 123, 543, 999, 321, 3};
       int sum=0;
        for( int nums : data){
            sum+=nums;

            System.out.print(nums + ", ");

        }

        System.out.println();
        System.out.println("Sum of numbers inside data arrays = " + sum);
        System.out.println("numbers in an array format: "+ Arrays.toString(data));

        System.out.println();
        System.out.println("******** FOR LOOP *******");
        for(int i=0; i<data.length; i++){
            System.out.print(data[i]+ ", ");
        }
        System.out.println();
        System.out.println(data[data.length-1]);
        // we need to use length-1 to get the last index position.
        // if it is only data.length it will show us error as it will show index 10, which doesn't exist here.

        // printing numbers backwards in the same line:
        System.out.println();
        for(int n=data.length-1; n>=0; n-- ){
            System.out.print(data[n] + ", ");
        }


    }
}
