package day40_arrayList;

import java.util.*;
public class ArrayListLoop {
    public static void main(String[] args) {

        List<Integer> nums= new ArrayList<>();
        System.out.println(nums); // empty Array
        System.out.println("nums size = " + nums.size());// it is empty doesnt have any values
        nums.add(22); nums.add(32); nums.add(42); nums.add(52); nums.add(62); nums.add(72);
        System.out.println(nums);
        System.out.println("nums size = " + nums.size());
        nums.remove(new Integer(42));
        System.out.println("nums = " + nums);
        //nums.clear();
        //System.out.println("nums = " + nums);

        //for loop... iterates between all values and print them

        for(int i=0; i<nums.size();i++){
            System.out.print(nums.get(i) + " ");
        }
        System.out.println();
        for(Integer each:nums){
            System.out.print(each + " ");
        }
    }
}
