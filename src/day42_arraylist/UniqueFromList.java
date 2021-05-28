package day42_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UniqueFromList {
    public static void main(String[] args) {
        getUnique();

    }

    public static void getUnique() {
        List<Integer> nums = new ArrayList<>(Arrays.asList(2,4,4,1,5,6,0,6));
        List<Integer> unique= new ArrayList<>();
        System.out.println("nums = " + nums);
        //check if a number appears only once in the list
        for(int each : nums){
            if(Collections.frequency(nums,each)==1){
                System.out.print(each + " ");
               unique.add(each);
            }

        }
        System.out.println("Unique list = " + unique);
    }
}
