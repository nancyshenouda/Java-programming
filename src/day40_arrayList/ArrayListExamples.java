package day40_arrayList;

import java.util.ArrayList;

public class ArrayListExamples {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>(); // it is specific only Integers. We cannot add String values. Only numbers

        nums.add(5);
        nums.add(6);
        nums.add(100);
        System.out.println(nums);// ==> [5,6,100]
        nums.size(); // ==> return method
        System.out.println("nums size = " + nums.size());

        // Reading from ArrayList

        System.out.println("Index 0 in ArrayList nums = " + nums.get(0)); // ==> 5 in index 0
        System.out.println("Index 1 in ArrayList nums = " + nums.get(1));// ==> 6
        System.out.println("Index 2 in ArrayList nums = " + nums.get(2)); // ==> 100
        //System.out.println(nums.get(3));// IndexOutOfBoundException... Index 3 doesn't exist
        System.out.println(nums);// prints the elements in the same line
        nums.remove(1); //remove index 1

        System.out.println(nums); // [5,100]


    }
}
