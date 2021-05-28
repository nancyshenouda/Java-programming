package day38_methods;

public class ArraysTest {
    public static void main(String[] args) {

        int [] nums= {2,4,6,8,10};
        ArrayUtils.printArray(nums);
        ArrayUtils.printArray(new int []{5,10,15,20,25,30,35,40});

        System.out.println(ArrayUtils.sum(nums));
        System.out.println(ArrayUtils.sum(new int []{5,10,15,20,25,30,35,40}));

        //int[] nums2 = {1, 2, 3, 4, 5};
        //int num = 10;
        System.out.println("5 is found? " + ArrayUtils.contains(nums,5));
        System.out.println("10 is found? " + ArrayUtils.contains(nums,10));
    }
}
