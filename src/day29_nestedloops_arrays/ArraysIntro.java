package day29_nestedloops_arrays;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {

        // Long way to declare and assign arrays and values:
         int num = 10; // single variable
        int [] nums = new int [3]; // array variable (contains/or can hold 3  int values)
         nums[0] = 5;
         nums [1] = 10;
         nums [2] =7;
        //Print the values:
        System.out.println(Arrays.toString(nums));// printed like 5, 10, 7
        System.out.println("number of elements =" + nums.length);///length is 3
        int i =0;
        System.out.println(nums[i]);// it will print 5
        System.out.println("value in index 0 = " + nums[0]);
        System.out.println("value in index 1 = " + nums[1]);
        System.out.println("value in index 2 = " + nums[2]);


        int len = nums.length;//// it is the length of the array, WITHOUT ()
        System.out.println(len);/// it will print 3

        //we can change the values inside the Arrays, but it will print the last values (top to bottom)

        nums[0]= 500;
        nums [1] = 700;
        nums[2] = 100;
        //nums[4] = 200;   we cannot have nums[4] as the Array size is already set as 3 in the beginning

        System.out.println(nums[0]);

        // the shorter way to declare and assigning arrays are values:

        int[] nums2 = {5, 7, 10, 11, 55, 990, 440};

        System.out.println(nums2.length);  // the size of nums2 is 7

        // third way to declare and assign value in the same statement:

        int [] nums3 = new int[] {10, 7, 3, 5, 900};


    }
}
