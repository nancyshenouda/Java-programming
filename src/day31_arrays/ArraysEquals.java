package day31_arrays;
import java.util.Arrays;
public class ArraysEquals {
    public static void main(String[] args) {

        int[] nums1 = {4, 5, 2, 10};
        int[] nums2 = {4, 5, 2, 10};
        int[] nums3 = {10, 4, 5, 2};
        int[] nums4 = {4, 5, 2, 10, 90};
        int[] nums5 = {54, 23, 54, 123, 54};
        String[] cars1 = {"Toyota","Honda", "Tesla","BMW", "Dodge"};
        String[] cars2 = {"Toyota","Honda", "Tesla","BMW", "Dodge"};
        String[] cars3 = {"toyota","honda", "tesla","bmw", "dodge"};
        String[] cars4 = {"Toyota","Honda", "Tesla"};

        System.out.println("nums1==nums2 - " + Arrays.equals(nums1, nums2));
        System.out.println("nums2==nums3 - " + Arrays.equals(nums2, nums3));
        System.out.println(nums1 == nums2);  // == it is not checking the values inside each Array.

        if(Arrays.equals(nums1, nums4)){
            System.out.println("nums1 matches nums4");
        }else{
            System.out.println("nums1 mismatch nums4");
        }
        System.out.println("cars2 == cars4 is " + Arrays.equals(cars2, cars4));

        if(Arrays.toString(cars2).equalsIgnoreCase(Arrays.toString(cars3))) {
            System.out.println("cars2 == cars3 match - ignorecase");
        }
    }
}
