package Tasks.Replit;

public class UniqueNumberInArray {
    public static void main(String[] args) {
        int [] arr = {2, 5, 5, 6, 3, 6, 9, 34, 3};
        printUniqueNumbers(arr);

    }
    public static void printUniqueNumbers(int[] nums){
        //WRITE YOUR CODE HERE

        int count = 0;

        for(int i=0;i<nums.length;i++){
            count = 0;

            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count==1){
                System.out.println(nums[i]);
            }
        }

    }
}

