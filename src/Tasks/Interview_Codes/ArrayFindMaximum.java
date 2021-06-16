package Tasks.Interview_Codes;

/*
Array -- Find Maximum
Write a method that can find the maximum number from an int Array

 */
public class ArrayFindMaximum {
    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5,6};
        System.out.println(maximumNumber(arr));
    }
    public static int maximumNumber(int [] numArr){

        int max = numArr[0];

        for(int i=0;i<=numArr.length;i++){
            if(i>max){
                max=i;
            }
        }

        return max;
    }
}
