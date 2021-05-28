package Tasks.Arrays_Practice;
/*
Average Number from Array
Given an int array calculate the average number-> Make it flexible so it will work with any array size
 Examples:
 [1,2,3] -> average: 2
 [10, 15, 5, 6] -> average: 9
 [4, 5, 6, 7, 8, 10, 20, 30, 0] -> average: 10
 */
public class AverageNumberV2 {
    public static void main(String[] args) {

        int [] nums= {4, 5, 6, 7, 8, 10, 20, 30, 0};
        int average =0;
        int sum=0;

        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            average=sum/nums.length;
        }
        System.out.println(average);
    }
}
