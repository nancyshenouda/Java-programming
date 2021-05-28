package Tasks;

import java.util.Arrays;

public class ReversArray {
    public static void main(String[] args) {
        int [] nums= {4,3,2,44,1,100,55};
         int temp=0;
for(int i=0;i<nums.length/2;i++){
    temp=nums[i];
    nums[i]=nums[nums.length-(i+1)];
    nums[nums.length-(i+1)]=temp;
}
        System.out.println(Arrays.toString(nums));
    }
}
