package Tasks.Arrays_Practice;
/*
Even and odd from array
Write a program that can count the even and odd number from an array of integers
Useforeachtomakeiteasier
Ex:Input: [4,1,3,12,5]
Output: Even:2
Odd: 3
 */
public class EvenAndOddCountInArrayV2 {
    public static void main(String [] args){

        int [] numbers ={4,1,3,12,5};
        int evenCount=0;
        int oddCount=0;
        int even=numbers[0];
        int odd=numbers[0];

        for( int each : numbers){
            if(each%2==0){
                even=each;
                evenCount++;
            }
            if(each%2!=0){
                odd=each;
                oddCount++;
            }
        }
        System.out.println("Even count = " + evenCount);
        System.out.println("Odd count = " + oddCount);
    }
}
