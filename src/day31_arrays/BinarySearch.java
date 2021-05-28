package day31_arrays;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
// this method works like indexof(). It finds the number position in the Array. It starts from Zero.
        int [] nums ={-5 ,23, 123, 654, 2344, 12345, 14421};
        System.out.println(Arrays.binarySearch(nums, 654));// position 0
        System.out.println(Arrays.binarySearch(nums, 2344));// position 1
        System.out.println(Arrays.binarySearch(nums, 14421));// position 2
        System.out.println(Arrays.binarySearch(nums, 12345));// position 3
        System.out.println(Arrays.binarySearch(nums, 6)); // it will give you a position that doesn't exist

        if(Arrays.binarySearch(nums,12345 ) >=0){
            System.out.println("12345 is present in Arrays");
        }else{
            System.out.println("12345 is not present");
        }
    }
}
