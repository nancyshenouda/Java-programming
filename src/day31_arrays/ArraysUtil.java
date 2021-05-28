package day31_arrays;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArraysUtil {
    public static void main(String[] args) {

        int [] nums = {5,7,1,9,0};
        int [] nums2 = {6,7,1,9};
        System.out.println(Arrays.toString(nums));

        Arrays.sort(nums);
        // print after sorting because sort is only an action but doesn't give a result
        System.out.println(Arrays.toString(nums));
        System.out.println();
        System.out.println("min value = " + nums[0]);
        System.out.println("max value = " + nums[nums.length-1]);


        //Arrays.sort(nums , Collections.reverseOrder());  reverse order doesn't work with sorting numbers.
        // It works only with String


        System.out.println();
        String []  word = {"java", "python", "c++", "sql", "ruby", "javascript"};
        String [] words2 ={"nacy","Ramy", "Heaven"};
        System.out.println(Arrays.toString(word));
        System.out.println();
        System.out.println("["+ String.join(", ", word) + "]");
        System.out.println();
        Arrays.sort(word); // it sorts the words alphabetically from a to z
        Arrays.sort(word, Collections.reverseOrder());
        System.out.print(Arrays.toString(word));



    }
}
