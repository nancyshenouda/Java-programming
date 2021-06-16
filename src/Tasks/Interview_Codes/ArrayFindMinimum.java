package Tasks.Interview_Codes;
/*
Array -- Find Minimum
Write a method that can find the maximum number from an int Array
 */
public class ArrayFindMinimum {
    public static void main(String[] args) {
        int [] arrMin = {7,20,3,10,5,6};
        System.out.println(findMinimum(arrMin));

    }
    public static int findMinimum(int [] arr){

        int min = arr[0];

        for(int each : arr){
            if(each<min){
                min=each;
            }
        }
        return min;
    }

}
