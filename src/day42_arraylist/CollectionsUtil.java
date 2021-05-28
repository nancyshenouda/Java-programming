package day42_arraylist;

import java.util.*;

public class CollectionsUtil {
    public static void main(String[] args) {

        List<Character> letters = new ArrayList<>();
        letters.addAll(Arrays.asList('j','a','v','a','i','s','f','u','n'));
        System.out.println(letters);
        System.out.println("size is = " + letters.size());

        Collections.reverse(letters);
        System.out.println("letters reversed= " + letters);

        Collections.reverse(letters);
        System.out.println("the frequency of letter a = " + Collections.frequency(letters,'a')); 
        // shows how many times letter a was repeated
        
        int vCount = Collections.frequency(letters,'v');
        System.out.println("vCount = " + vCount);
        System.out.println("Max char = " + Collections.max(letters)); // as per the ASCIII
        System.out.println("Min char = " + Collections.min(letters));


        Collections.replaceAll(letters,'a','u');

        System.out.println(letters);

        Collections.sort(letters);
        System.out.println("sorted letters = " + letters);

        List<Integer> nums = new ArrayList<>(Arrays.asList(3,45,100,70,3,23,1,90,3));

        Collections.reverse(nums);
        System.out.println("nums after reverse= " + nums);

        int max = Collections.max(nums);
        System.out.println("Max in nums = " + max);

        int min= Collections.min(nums);
        System.out.println("Min in nums = " + min);

        //Collections.sort(nums);
        //System.out.println("nums after sorting = " + nums);

        System.out.println("frequency of 3 = " + Collections.frequency(nums,3));

        //Collections.replaceAll(nums,3,30);
        //System.out.println("nums after replace = " + nums);

        //Collections.sort(nums, Collections.reverseOrder());
        //System.out.println("reverse order = " + nums);
        //Collections.shuffle(nums);
        //System.out.println("After shuffle = " + nums); //shuffle randomly

        Collections.swap(nums,1,3);
        System.out.println("swap 30 and 100 = " + nums);
        
    }
}
