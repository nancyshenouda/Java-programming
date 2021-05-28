package day41_arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingList {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();

        nums.add(120);
        nums.add(40);
        nums.add(100);
        System.out.println("nums before sorting = " + nums);

        Collections.sort(nums);
        System.out.println("nums after sorting = " + nums);

    }
}
